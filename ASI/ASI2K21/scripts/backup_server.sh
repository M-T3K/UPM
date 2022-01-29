#!/bin/bash

# Códigos de error
NONEXISTING_SERVER_BACKUP_DIR=20
NONEMPTY_BACKUP_DIR=21
INCORRECT_BACKUP_PARAMS=22

# Recupera los parámetros

readarray -t file_data < $1
len=${#file_data[@]} # Longitud del Fichero
if [ $len -ne 1 ]; then
    echo "Cantidad de directorios erronea. Fichero $1 malformado" >&2
    exit $INCORRECT_BACKUP_PARAMS
fi

backup_dir=$(head -1 $1)

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

# Comprueba si el directorio de backup especificado es un directorio y existe
if [ ! -d $backup_dir ]; then
    >&2 echo "ERROR@backup_server: El directorio $backup_dir no existe"
    exit $NONEXISTING_SERVER_BACKUP_DIR
fi

# Comprueba si el directorio está vacío
if [ "$(ls -A $backup_dir)" ]; then
    >&2 echo "ERROR@backup_server: El directorio $backup_dir no está vacío"
    exit $NONEMPTY_BACKUP_DIR
fi

mkdir ~/cctmp/
cp /etc/ssh/sshd_config ~/cctmp/sshd_config.bk

is_installed=$(cat ~/cctmp/sshd_config.bk | grep GatewayPorts)
if [ "$?" -ne 0 ]; then
    echo "GatewayPorts yes" >> ~/cctmp/sshd_config.bk
fi
sudo mv ~/cctmp/sshd_config.bk /etc/ssh/sshd_config
sudo rm -r ~/cctmp


