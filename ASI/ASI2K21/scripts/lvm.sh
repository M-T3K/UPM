#!/bin/bash

# Códigos de error
VGCREATE_FAILED=10

# Recupera los parámetros
n_lines=$(wc -l $1)
groupname=$(head -1 $1)
groupdevs=$(head -2 $1 | tail -1)

# Comprueba si 'lvm2' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep -w lvm2)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    apt-get -y install lvm2 > /dev/null
fi

echo "Creando el grupo de volúmenes lógicos $groupname"
# vgcreate $groupname $groupdevs > /dev/null
if [ "$?" -ne 0 ]; then
    echo "ERROR@lvm: Se ha producido un error al crear el grupo de LVM" 1>&2
    exit $VGCREATE_FAILED
fi

# TODO
# la llamada sudo vgcreate serverdata /dev/sda1
# "No physical volume label read from /dev/sda1"
# "Can't open /dev/sda1 exclusively. Mounted filesystem?"
# "Unable to add physical volume /dev/sda1 to volume group serverdata"
