#!/bin/bash

# Códigos de error
INCORRECT_BACKUP_PARAMS=22
NONEXISTING_CLIENT_BACKUP_DIR=23
INVALID_IP_BACKUP=24

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
        #echo "DEBUG: en validate_ip() se está comprobando que la ip $1 es válida mediante PING. Por motivos de DEBUG, he pensado que sería mejor ignorar el resultado de esta validación."
        #echo "Aun así, la comprobación ha devuelto ${val}. Es posible que esta parte no esté funcionando. Cuando se quiera testear en condiciones reales, habra que descomentar la linea de debajo a esta."
        ret=$val
        return $ret
}


# Recupera los parámetros

readarray -t file_data < $1
len=${#file_data[@]} # Longitud del Fichero
if [ $len -ne 4 ]; then
    echo "Cantidad de parametros incorrecta: Require 4 y tiene $len. Fichero $1 malformado" >&2
    exit $INCORRECT_BACKUP_PARAMS
fi

# Comprueba si 'cron' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep cron)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    apt-get -qq -y install cron > /dev/null
fi

# Comprueba si 'rsync' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep rsync)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    apt-get -qq -y install rsync > /dev/null
fi

dir_local=${file_data[0]}
server=${file_data[1]}
dir_dest=${file_data[2]}
period=${file_data[3]}

if [ ! -d $dir_local ]; then
    echo "$dir_local no es un directorio valido para hacer la copia de seguridad." >&2
    exit $NONEXISTING_CLIENT_BACKUP_DIR
fi

validate_ip $server
if [[ $? -ne 0 ]];then
    echo "Direccion IP de la maquina destino $maq_destino es invalida." >&2
    exit $INVALID_IP_BACKUP
fi

# @info Creamos el script que se ejecutara mediante crontab para realizar copias de seguridad periodicas
mkdir ~/cctmp/
echo "curr_date=\$(date +%d-%m-%Y)" >> ~/cctmp/cronscript.sh
echo "backup_file=~/cctmp/backup_\$curr_date.tar.gz" >> ~/cctmp/cronscript.sh
echo "tar -zcvpf \$backup_file $dir_local" >> ~/cctmp/cronscript.sh
echo "scp \$backup_file $server:$dir_dest" >> ~/cctmp/cronscript.sh
chmod +x ~/cctmp/cronscript.sh
# Hacer crontab

cp /etc/crontab ~/cctmp/crontab.bk
sed -i '$ d' ~/cctmp/crontab.bk
days=$((period/24))
hours=$((period%24))
sudo echo "* $hours $days * * root /root/cctmp/cronscript.sh" >> ~/cctmp/crontab.bk
sudo echo "#" >> ~/cctmp/crontab.bk
sudo mv ~/cctmp/crontab.bk /etc/crontab
sudo service cron restart
