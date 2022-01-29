#!/bin/bash

# Códigos de error
INVALID_RAID_LEVEL=9
RAID_ERROR=10

# Recupera los parámetros
new=$(head -1 $1)
level=$(head -2 $1 | tail -1)
disps=$(tail -1 $1)
n_disps=$(echo $disps | wc -w)

# Comprueba si el parámetro nivel de RAID es válido
if [ "$level" -lt 0 ] || [ "$level" -gt 6 ]; then
    echo "ERROR@raid: El nivel de RAID especificado, $level, no es válido" 1>&2
    exit $INVALID_RAID_LEVEL
fi

# Comprueba si 'mdadm' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep mdadm)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    apt-get -y -q install mdadm > /dev/null
fi

echo "Creando el RAID en $new, nivel $level, de dispositivos [$disps]"
mdadm --create --run $new --level=$level --raid-devices=$n_disps $disps

if [ "$?" -ne 0 ]; then
    echo "ERROR@raid: No se pudo realizar el RAID de los dispositivos [$disps]" 1>&2
    exit $ERROR_RAID
else
    echo "INFO@raid: El RAID se ha realizado correctamente"
    exit 0
fi
