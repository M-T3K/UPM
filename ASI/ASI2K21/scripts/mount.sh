#!/bin/bash

# Códigos de error
INVALID_MOUNT_POINT=6
INVALID_MOUNT_DEVICE=7
MOUNT_ERROR=8

# Recupera los parámetros
disp=$(head -1 $1)
punt=$(tail -1 $1)

# Comprueba si 'mount' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep mount)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    apt-get -y install mount > /dev/null
fi

# Comprueba si el dispositivo está instalado
is_installed=$(lsblk -l | grep $(echo $disp | cut -c6-))
if [ "$?" -ne 0 ]; then
    echo "ERROR@mount: El dispositivo $(echo $disp | cut -c6-) no está instalado" 1>&2
    exit $INVALID_MOUNT_DEVICE
fi

# Comprueba si el punto de montaje es un directorio y existe
if [ ! -d $punt ]; then
    echo "El directorio $punt no existe; se crea"
    mkdir $punt
fi

# Comprueba si el directorio está vacío
if [ "$(ls -A $punt)" ]; then
    echo "ERROR@mount: El punto de montaje $punt no está vacío" 1>&2
    exit $INVALID_MOUNT_POINT
fi


# @info Ejemplo de un fichero fstab
# /etc/fstab: static file system information.
#
# Use 'blkid' to print the universally unique identifier for a
# device; this may be used with UUID= as a more robust way to name devices
# that works even if disks are added and removed. See fstab(5).
#
# <file system> <mount point>   <type>  <options>       <dump>  <pass>
# / was on /dev/sda1 during installation
# UUID=d5df0c9a-ce86-41f0-85c3-35acb6b9d9a1 /               ext4    errors=remount-ro 0       1
# swap was on /dev/sda5 during installation
# UUID=a57d5d74-f3c3-4938-955f-ef1e3a2336c3 none            swap    sw              0       0
# /dev/sr0        /media/cdrom0   udf,iso9660 user,noauto     0       0

# Directivas para añadir a fstab
type="ext4"
opts="defaults"
dump="0"
pass="0"

# Si no se encuentra en el fichero fstab, se actualiza
is_installed=$(cat /etc/fstab | grep $disp)
if [ "$?" -ne 0 ]; then
    echo "$disp $punt $type $opts $dump $pass" >> /etc/fstab
fi

echo "Montando dispositivo $disp en el punto de montaje $punt"
sudo mount -a #2&>/dev/null

if [ "$?" -ne 0 ]; then
    echo "ERROR@mount: No se pudo realizar el montaje en el dispositivo ${disp} en el punto de montaje ${punt}" 1>&2
    exit $ERROR_MOUNT
else
    echo "INFO@mount: El montaje se ha realizado correctamente"
    exit 0
fi
