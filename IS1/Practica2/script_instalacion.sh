#!/bin/bash

# Script de la practica

# 1) Descarga de spain_latest.osm.bz2

SPAIN_OSM_BZ=spain-latest.osm.bz2
SPAIN_OSM=spain-latest.osm
ZIP_TOOL=bzip2

if [ ! -f "$SPAIN_OSM_BZ" ]; then
    echo "$SPAIN_OSM_BZ does not exist... Checking if decompressed version exists..."
    if [ ! -f "$SPAIN_OSM" ]; then
        echo "$SPAIN_OSM does not exist... Retrieving File..."
        wget http://download.geofabrik.de/europe/spain-latest.osm.bz2
    fi
fi

# 2) Extraccion / descompresion

if [ ! -f "$SPAIN_OSM" ]; then
    echo "$SPAIN_OSM_BZ hasn't been decompressed yet... decompressing..."
    if ! type $ZIP_TOOL; then
        echo "$ZIP_TOOL not found on this system, installing..."
        apt-get install ZIP_TOOL
    fi
    bzip2 -d $SPAIN_OSM_BZ
fi

if [ ! -f "$SPAIN_OSM" ]; then
    echo "Something went wrong amidst decompression. Please, try again using sudo."
    echo "ERROR CODE: $?"
    exit
fi

echo "Decompressed!"

# Se ha descargado el fichero, ahora toca comprobar si tenemos las herramientas
# Realmente hay varias formas de hacer esto. La mas simple seria:
# sudo apt-get install osmctools
# Pero seamos sinceros, Quien cojones quiere tener estas herramientas ocupando espacio de disco duro?
# Pues eso, asi que he decidido instalarlas manualmente
# Y asi cuando terminemos el proyecto simplemente borramos todo y ya

OSMFILTER=./osmfilter
OSMCONVERT=./osmconvert
CC=cc
if ! type $OSMFILTER; then
    if ! type $CC; then
        echo "$CC not found... Installing..."
        sudo apt install gcc
    fi
    echo "$OSMFILTER not found... Installing..."
    wget -O - http://m.m.i24.cc/osmfilter.c |cc -x c - -O3 -o osmfilter
fi

# Comprobamos si tenemos osmconvert

if ! type $OSMCONVERT; then
    echo "$OSMCONVERT not found... Installing..."
    wget -O - http://m.m.i24.cc/osmconvert.c | cc -x c - -lz -O3 -o osmconvert
fi

# Checking for errors
if [[ "$?" -ne 0 ]] ; then
  echo 'An error occurred.'
  exit $rc
fi

# END


