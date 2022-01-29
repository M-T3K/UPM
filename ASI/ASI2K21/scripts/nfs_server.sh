#!/bin/bash

# Códigos de error
INVALID_DIR_NFS_SERVER=12

# Comprueba si 'nfs-kernel-server' y 'nfs-common' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep -w nfs)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    # Automaticamente se descarga e instala nfs-kernel-server
    apt-get -qq -y install nfs-kernel-server > /dev/null
fi

sudo service nfs-kernel-server stop

# https://www.digitalocean.com/community/tutorials/how-to-set-up-an-nfs-mount-on-ubuntu-16-04
# https://ilearnedhowto.wordpress.com/2017/05/15/how-to-install-a-cluster-with-nis-and-nfs-in-ubuntu-16-04/

# Iteramos por el fichero de configuracion
mkdir ~/cctmp/ 2&>/dev/null
while read ln
do
    # Si la linea encontrada esta vacia (suele pasar en la ultima linea del fichero temporal) nos salimos del bucle
    if [ -z "$ln" ]; then
        break
    fi

    echo "Directorio Especificado: ${ln}"
    if [ ! -d $ln ]; then
        echo "El Directorio $ln, especificado en el fichero $1, no existe. Abortando." 1>&2
        exit $INVALID_DIR_NFS_SERVER
    fi
    cp /etc/exports ~/cctmp/exports.bk
    echo "${ln} *(rw,sync,no_subtree_check)" >> ~/cctmp/exports.bk
done < $1

sudo mv ~/cctmp/exports.bk /etc/exports
sudo rm -f -r ~/cctmp/
exportfs -a > /dev/null

echo "Reiniciando NFS Kernel Server."
sudo service nfs-kernel-server start