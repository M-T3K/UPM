# #! /bin/bash

# Queremos crear una funcion para poder hacer echo de errores facilmente:
errcho() {
    echo "$@" 1>&2;
}

# Este es el handle para hacer 'parsing' de los argumentos.

# Si el numero de argumentos no es el correcto
if [ $# -ne 1 ]; then
    errcho "minientrega.sh: Error(EX_USAGE), uso incorrecto del mandato. "Success""
    errcho "minientrega.sh: <<descripción detallada del error>>"
    exit 65
fi

# Imprimimos la ayuda
if [[ $1 == "-h" || $1 == "--help" ]]; then
    echo "minientrega.sh: Uso: minientrega.sh ID_PRACTICA"
    echo "minientrega.sh: Este programa realiza la entrega de una practica 'ID_PRACTICA' siempre que sea posible"
    exit 0
fi 

# Debemos comprobar que la variable MINIENTREGA_CONF esta declarada y que el 
# directorio que representa es legible

# Comprobamos que MINIENTREGA_CONF esta 

if [[ ! -d $MINIENTREGA_CONF ]]; then
    errcho "minientrega.sh: Error, no se pudo realizar la entrega"
    errcho "minientrega.sh+ no es accesible el directorio \""$MINIENTREGA_CONF"\""
    exit 64
fi

# Ahora debemos comprobar que el archivo es un archivo valido
ID_PRACTICA="$MINIENTREGA_CONF/$1"

if [[ ! -f $ID_PRACTICA ]]; then
    errcho "minientrega.sh: Error, no se pudo realizar la entrega"
    errcho "minientrega.sh+ no es accesible el fichero \"$1\""
    exit 64
fi

# Ahora cargamos las variables del archivo
source $ID_PRACTICA

# Comprobamos si la fecha es legit
# TODO: fix fecha_maxima = 2100
if [[ ! $MINIENTREGA_FECHALIMITE == 20[0-9][0-9]-[0-1][0-9]-[0-3][0-9] ]] || ! date -d "$MINIENTREGA_FECHALIMITE" >/dev/null 2>&1; then
    errcho "minientrega.sh: Error, no se pudo realizar la entrega"
    errcho "minientrega.sh+ fecha incorrecta "$MINIENTREGA_FECHALIMITE""
    exit 65
fi

# Tomamos la 2 fechas relevantes para la comparacion.
# Como en la variable del archivo, MINIENTREGA_FECHALIMITE
# es un String, tenemos que convertirla a una fecha valida.
# Llegados a este punto por el anterior if sabemos que es 
# una fecha valida, asi que la convertimos

FECHA_ACTUAL=$(date +"%F")
FECHA_LIMITE=$(date -d "$MINIENTREGA_FECHALIMITE" +"%F")

# Ahora obtenemos los valores en Segundos para comparar
FECHA_ACTUAL_S=$(date +%s)
FECHA_LIMITE_S=$(date -d "$MINIENTREGA_FECHALIMITE" +%s)

# Comprobamos que la fecha de entrega no se haya pasado
if [[ $FECHA_ACTUAL_S -ge $FECHA_LIMITE_S ]]; then
    errcho "minientrega.sh: Error, no se pudo realizar la entrega"
    errcho "minientrega.sh+ el plazo acabada el "$FECHA_LIMITE""
    exit 65
fi

# Ahora nos encargamos de los archivos de la practica

# Comprobacion de los archivos

for FILE in $MINIENTREGA_FICHEROS; do
    if [ ! -r $FILE ]; then
        errcho "minientrega.sh: Error, no se pudo realizar la entrega"
        errcho "minientrega.sh+ no es accesible el fichero "$FILE""
        exit 66
    fi
done

DESTINACION="$MINIENTREGA_DESTINO/${USER}"

# Realizacion de entrega

if [ ! -d $MINIENTREGA_DESTINO ] || ! mkdir -p "$DESTINACION" >/dev/null 2>&1 ; then
    errcho "minientrega.sh: Error, no se pudo realizar la entrega"
    errcho "minientrega.sh+ no se pudo crear el subdirectorio de entrega en "$MINIENTREGA_DESTINO""
    exit 73
fi

# Copiamos los archivos al directorio correcto
for FILE in $MINIENTREGA_FICHEROS; do
    cp $FILE "$DESTINACION"
done

# Si hemos llegado hasta aqui, terminamos con 0 (Terminacion Correcta)
exit 0







