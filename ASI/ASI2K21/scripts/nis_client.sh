#!/bin/bash

# Códigos de error
INVALID_IP_NIS=11

# Función que valida y comprueba la IP
function validate_ip()
 {
        # @info En la primera parte nos aseguramos que la IP este bien formada
        local ip=$1
        local ret=1
        if [[ $ip =~ ^[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}$ ]]; then
            IFS_tmp=$IFS # Salvaguardamos el IFS temporal
            IFS='.'
            ip=($ip)
            [[ ${ip[0]} -le 255 && ${ip[1]} -le 255 && ${ip[2]} -le 255 && ${ip[3]} -le 255 ]]
            ret=$?
        fi
        IFS=$IFS_tmp
        # @info Ahora nos encargamos de que la IP exista
        ping -c 1 $1 > /dev/null ;
        local val=$?
        ret=$val
        return $ret
}

# Recupera los parámetros
domain=$(head -1 $1)
server=$(tail -1 $1)

# Comprueba si 'nis' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep -w nis)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    apt-get -qq -y install nis > /dev/null
fi

# Comprobamos que la IP es valida
validate_ip $server
if [[ $? -ne 0 ]];then
    echo "ERROR@nis_client: Direccion IP de la maquina destino $maq_destino es invalida." 1>&2
    exit $INVALID_IP_NIS
fi

# https://www.linuxquestions.org/questions/debian-26/debian-nis-not-respecting-etc-defaultdomain-662580/
# @info tenemos que hacer esto porque sino NIS no guarda el domainname
mkdir ~/cctmp/ 2&>/dev/null
touch ~/cctmp/defaultdomain
echo $domain > ~/cctmp/defaultdomain
sudo mv ~/cctmp/defaultdomain /etc/defaultdomain

# https://ilearnedhowto.wordpress.com/2017/05/15/how-to-install-a-cluster-with-nis-and-nfs-in-ubuntu-16-04/

# Modifica el fichero /etc/yp.conf para que incluya la línea "domain [nombre del dominio] server [IP del servidor]"
# @info esto es util en caso de que no pueda "buscar" el servidor, sino que tenga que conectarse directamente
cp /etc/yp.conf ~/cctmp/yp.conf.bk
sudo echo "domain $domain server $server" >> ~/cctmp/yp.conf.bk
sudo mv ~/cctmp/yp.conf.bk /etc/yp.conf

# Modifica el fichero /etc/default/nis en sus líneas NISSERVER(XXXXX->false), NISCLIENT(XXXXXX->true)
sudo sed -i 's/NISSERVER=.*$/NISSERVER=false/' /etc/default/nis
sudo sed -i 's/NISCLIENT=.*$/NISCLIENT=true/' /etc/default/nis

# Modifica el fichero /etc/nsswitch.conf para incluir el servidor NIS
sudo sed -i 's/compat$/compat nis/g;s/dns$/dns nis/g' /etc/nsswitch.conf

# Elimina el directorio temporal
sudo rm -r ~/cctmp

# Reinicia NIS para que se efectúen los cambios
sudo service nis restart
echo "INFO@nis_client: El cliente NIS se ha configurado correctamente"
exit 0
