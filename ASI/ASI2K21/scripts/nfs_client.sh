#!/bin/bash

# Códigos de error
INVALID_CONF_LINE=13
INVALID_IP_NFS=14

# Esto esta basado en un post de stack overflow que lo explicaba bien
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


# Comprueba si 'nfs-kernel-server' y 'nfs-common' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep -w nfs)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    # Automaticamente se descarga e instala nfs-common
    apt-get -qq -y install nfs-common > /dev/null
fi


# https://www.digitalocean.com/community/tutorials/how-to-set-up-an-nfs-mount-on-ubuntu-16-04
# https://ilearnedhowto.wordpress.com/2017/05/15/how-to-install-a-cluster-with-nis-and-nfs-in-ubuntu-16-04/

# Iteramos por el fichero de configuracion
i=1
while read ln
do
    # Si la linea encontrada esta vacia (suele pasar en la ultima linea del fichero temporal) nos salimos del bucle
    if [ -z "$ln" ]; then
        break
    fi

    echo "$ln"
    num_params=$(echo $ln | wc -w)
    if [[ num_params -ne 3 ]]; then
        echo "La linea $i no está bien formada. Tiene ${num_params} parametros en vez de 3." 1>&2
        exit $INVALID_CONF_LINE
    fi

    # Obtenemos los parametros en forma de array
    params=($ln)
    server=${params[0]}
    export_dir=${params[1]}
    local_dir=${params[2]}

    # Comprobamos que la IP es valida
    validate_ip $server
    if [[ $? -ne 0 ]]; then
        echo "Direccion IP de la maquina destino $maq_destino es invalida." 1>&2
        exit $INVALID_IP_NFS
    fi

    # Se crea el directorio si no existía
    if [ ! -d $local_dir ]; then
        echo "El directorio de montaje $local_dir no existe. Creándolo."
        sudo mkdir $local_dir
    fi

    # Montaje
    echo "#### MOUNT ####"
    sudo mount $server:$export_dir $local_dir > /dev/null
    echo "#### ENDMOUNT ####"

    # Nos aseguramos de que se mantenga al hacer reboot
    mkdir ~/cctmp/ 2&>/dev/null
    cp /etc/fstab ~/cctmp/fstab.bk
    echo "${server}:${export_dir} ${local_dir} nfs defaults,auto 0 0" >> ~/cctmp/fstab.bk
    sudo mv ~/cctmp/fstab.bk /etc/fstab
    sudo rm -f -r ~/cctmp/
    i=$((i+1))

done < $1