#!/bin/bash

# Ya se que no se tiene que hacer un script, 
# pero para que sea mas accesible creo que va a ser lo mejor
# asi ademas lo podemos anadir a git

# Definiciones

MADRID_MAIN=madriles.o5m
SPAIN_OSM=spain-latest.osm

# Pipeline 1

# Paso 1: Comprobamos que tenemos todo Descargado

./script_instalacion.sh

# Paso 2: Filtramos para sacar solo la zona de madrid
# Esto en la entrega final deberiamos decir que lo hemos hecho para 
# evitar tener que hacer lo mismo en las dos pipes, 
# y deberiamos ofrecer versiones de las pipes con y sin esta parte
# Porque lo mismo se pican

# https://wiki.openstreetmap.org/wiki/Osmconvert
# Seccion de Combining the functions
# Solo lo generamos si no existe ya

if [ ! -f "$MADRID_MAIN" ]; then
    ./osmconvert $SPAIN_OSM -B=CiudadMadrid.poly.txt -o=$MADRID_MAIN
fi

# Segun la documentacion se puede hacer esto:
# bzcat europe.osm.bz2 | osmconvert - -o=europe.o5m sobre el .bz2
# y asi nos ahorramos la parte de descomprimir
# Pero me di cuenta tarde asi que me da pereza cambiarlo ahora

# Paso 3: Ejecutamos la Primera Pipeline
# Usamos --ignore-dependencies para quedarnos solo con los objetos de tipo dato 
# Y olvidarnos de los de tipo nodo que se quedarian 
# https://wiki.openstreetmap.org/wiki/Osmfilter
# https://gis.stackexchange.com/questions/247800/osmfilter-filter-every-node-with-at-least-one-tag
# --all-to-nodes sirve para pasar los datos a nodos (que son de un tipo distinto a los anteriores)
# https://wiki.openstreetmap.org/wiki/Osmconvert
# Por defecto se separa cada columna por tabuladores \t
# Tecnicamente en el regex deberia usar una mas compleja que ".*"
# Con .* estoy comprobando cualquier digito cuando la longitud y la longitud deberian ser numeros
# pero el trabajo simplemente no merece la pena
# Usamos - en el osmconvert para permitir pasar como pipe
./osmfilter $MADRID_MAIN --ignore-dependencies --keep="shop=bakery" | ./osmconvert - --all-to-nodes --csv="@id @lon @lat name" --csv-headline | grep .*$'\t'.*$'\t'.*$'\t'. > filt_bakeries.csv | ./populate_db.sh

# Paso 4: Ejecutamos la Segunda Pipeline
# Grep es el encargado de filtrar, como no entiendo bien el enunciado dejo los siguientes filtros de grep. 
# Por defecto el codigo ejecuta la opcion 4 (Panaderias y Supermercados con Nombre y Web)
# 1) Si queremos todas las panaderias y supermercados, sin ningun filtro: grep .*$'\t'.*$'\t'.*$'\t'.*$'\t'.*
# 2) Si queremos todas las panaderias y supermercados, con nombre: grep .*$'\t'.*$'\t'.*$'\t'..*$'\t'.*
# 4) Si queremos todas las panaderias y supermercados, con web: grep .*$'\t'.*$'\t'.*$'\t'..*$'\t'.
# 3) Si queremos todas las panaderias y supermercados, con nombre y con web: grep .*$'\t'.*$'\t'.*$'\t'..*$'\t'.

./osmfilter $MADRID_MAIN --ignore-dependencies --keep="shop=bakery or shop=supermarket" | ./osmconvert - --all-to-nodes --csv="@id @lon @lat name website" --csv-headline | grep .*$'\t'.*$'\t'.*$'\t'.*$'\t'..* > filt_shops.csv | ./populate_db.sh


