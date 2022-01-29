#!/bin/bash

# ===============================
# +         Variables           +
# ===============================

# Nombre del archivo temporal en el que vamos a guardar los resultados
tmp_file="tmp"

# Lista con el enumerado de los servicios posibles
services=("mount" "raid" "lvm" "nfs_server" "nfs_client" "nis_server" "nis_client" "backup_server" "backup_client")

# ===============================
# +      Códigos de error       +
# ===============================
# TODO cambiar cuando todos los errores estén hechos
# Errores devueltos por el script maestro
INVALID_SCRIPT_CALL=1
INVALID_IP=2
SERVICE_DOES_NOT_EXIST=3
PROFILE_DOES_NOT_EXIST=4
INVALID_CONF_FILE=5

# Errores devueltos por 'mount'
INVALID_MOUNT_POINT=6
INVALID_MOUNT_DEVICE=7
MOUNT_ERROR=8

# Errores devueltos por 'raid'
INVALID_RAID_LEVEL=9
RAID_ERROR=10

# Errores devueltos por 'nis_server'
# No tiene

# Errores devueltos por 'nis_client'
INVALID_IP_NIS=11

# Errores devueltos por 'nfs_server'
INVALID_DIR_NFS_SERVER=12

# Errores devueltos pro 'nfs_client'
INVALID_CONF_LINE=13
INVALID_IP_NFS=14

# Errores devueltos por 'backup_server'
NONEXISTING_SERVER_BACKUP_DIR=20
NONEMPTY_BACKUP_DIR=21
INCORRECT_BACKUP_PARAMS=22

# Errores devueltos por 'backup_client'
INCORRECT_BACKUP_PARAMS=22
NONEXISTING_CLIENT_BACKUP_DIR=23
INVALID_IP_BACKUP=24

# ===============================
# +         Funciones           +
# ===============================

function errcho() {
    echo "$@" 1>&2;
}

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

function validate_service()
 {
        serv=$1
        local ret=1
        if [[ " ${services[@]} " =~ " ${serv} " ]]; then
            ret=0
        fi
        return $ret
}

function validate_file()
 {
        file=$1
        local ret=1
        if [ -f $file ]; then
            ret=0
        fi
        return $ret
}

# TODO lo del sudo y tal
function send_order()
 {
        echo "Enviando los ficheros necesarios a $1"
        local script="./scripts/$2.sh"
        local config=$3
        local filename=$(basename $config)
        scp $script $1:/tmp
        scp $config $1:/tmp
        scp pwd.txt $1:/tmp

        echo "Ejecutando '$2' en $1"
        cat pwd.txt | ssh -tt $1 "sudo /tmp/$2.sh /tmp/$filename"
}

# ===============================
# +           Código            +
# ===============================

# Comprobamos que tenga mas de un argumento
if [ $# -ne 1 ]; then
    errcho "ERROR: Solo se espera un único argumento pero ${#} fueron encontrados." "USO: ./configurar_cluster [fichero_configuracion.conf]"
    exit $INVALID_SCRIPT_CALL
fi

validate_file $1
if [ $? -ne 0 ]; then
    errcho "ERROR: El fichero de configuración $1 no existe"
    exit $INVALID_SCRIPT_CALL
fi

# Filtramos las lineas que no nos gustan con grep, y guardamos en un archivo temporal
grep -v '^$' $1 | grep -v '#' > $tmp_file


# @info en un principio queria guardar el numero de linea pero este sería el del fichero temporal y no la del original
# asi que al final he llegado a la conclusion de que nos serviria de poco
# c=( $( awk '{print NR,$1, $2, $3}' $tmp_file ) )
c=( $( awk '{print $1, $2, $3}' $tmp_file ) )

lns=0
len=${#c[@]} # Longitud del Fichero
ln_len=3 # Longitud de cada Linea del Fichero
ip_regex='([1-9]?[0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])'

# @info Aqui hacemos una comprobacion rapida de que el fichero esta bien formado.
# Aka todas las lineas tienen exactamente 3 palabras.
wc_tmp_file="wc.txt"
while read line; do
    N=$(echo "$line" | wc -w )
    if [[ $N -ne 3 ]]; then
        errcho "ERROR: La línea <${line}> no cumple el formato válido. Debería tener 3 argumentos pero tiene $N."
        exit $INVALID_CONF_FILE
    fi
done < $tmp_file

echo "#################################################"


for (( i=0; i<=${len}; ))
do
    declare -a curr_ln
    for (( j=0; j<${ln_len}; ++j ))
    do
        # determine errors using regex and mod
        curr_ln=("${curr_ln[@]}" "${c[${i}]}")
        i=$((i+1))
    done

    # Si la linea encontrada esta vacia (suele pasar en la ultima linea del fichero temporal) nos salimos del bucle
    if [ -z "${curr_ln[0]}" ]; then
        break
    fi
    maq_destino="${curr_ln[0]}"
    servicio="${curr_ln[1]}"
    perfil="./configs/${curr_ln[2]}"

    echo "Maquina Destino:" "${maq_destino}"
    echo "Servicio: " "${servicio}"
    echo "Perfil:" "${perfil}"

    # @info Comprobacion detallada de errores
    validate_ip $maq_destino
    if [[ $? -ne 0 ]];then
        errcho "Direccion IP de la maquina destino $maq_destino es invalida."
        exit $INVALID_IP
    fi

    validate_service $servicio
    if [[ $? -ne 0 ]]; then
        errcho "Servicio $servicio no existe."
        exit $SERVICE_DOES_NOT_EXIST
    fi

    validate_file $perfil
    if [[ $? -ne 0 ]]; then
        errcho "Fichero de Perfil $perfil no existe."
        exit $PROFILE_DOES_NOT_EXIST
    fi

    # Calculamos el numero de lineas del fichero de configuracion de perfil para 
    # realizar una comprobacion de errores preliminar en los archivos
    N=$(grep "" -c $perfil )
    case $servicio in
        "mount")
            echo "Se busca realizar un servicio mount"
            if [[ $N -ne 2 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@mount: Perfil <${perfil}> debe tener 2 líneas y tiene $N."
                exit $INVALID_CONF_FILE
            fi
        ;;
        "raid")
            echo "Se busca realizar un servicio raid"     
            if [[ $N -ne 3 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@raid: Perfil <${perfil}> debe tener 3 líneas y tiene $N."
                exit $INVALID_CONF_FILE
            fi
        ;;
        "lvm")
            echo "Se busca realizar un servicio lvm"      
            if [[ $N -lt 3 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@lvm: Perfil <${perfil}> debe tener al menos 3 líneas y tiene $N."
                exit $INVALID_CONF_FILE
            fi 
        ;;
        "nis_server")
            echo "Se busca realizar un servicio nis_server"    
            if [[ $N -ne 1 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@nis_server: Perfil <${perfil}> debe tener 1 línea y tiene $N."
                exit $INVALID_CONF_FILE
            fi          
        ;;
        "nis_client")
            echo "Se busca realizar un servicio nis_client"    
            if [[ $N -ne 2 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@nis_client: Perfil <${perfil}> debe tener 2 líneas y tiene $N."
                exit $INVALID_CONF_FILE
            fi     
        ;;
        "nfs_server")
            echo "Se busca realizar un servicio nfs_server"    
            if [[ $N -lt 1 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@nfs_server: Perfil <${perfil}> debe tener al menos 1 línea y tiene $N."
                exit $INVALID_CONF_FILE
            fi          
        ;;
        "nfs_client")
            echo "Se busca realizar un servicio nfs_client"   
            if [[ $N -lt 1 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@nfs_client: Perfil <${perfil}> debe tener al menos 1 línea y tiene $N."
                exit $INVALID_CONF_FILE
            fi           
        ;;
        "backup_server")
            echo "Se busca realizar un servicio backup_server"     
            if [[ $N -ne 1 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@backup_server: Perfil <${perfil}> debe tener 1 línea y tiene $N."
                exit $INVALID_CONF_FILE
            fi         
        ;;
        "backup_client")
            echo "Se busca realizar un servicio nis_client"  
            if [[ $N -ne 4 ]]; then # @info Comprobacion preliminar de errores
                errcho "ERROR@backup_client: Perfil <${perfil}> debe tener 4 líneas y tiene $N."
                exit $INVALID_CONF_FILE
            fi            
        ;;
    # Cul de 
    esac
    send_order $maq_destino $servicio $perfil
    # Lmao

    echo "#################################################"
    # Reinicio de la Linea Actual para la siguiente iteracion
    curr_ln=()
done

echo "END"
exit 0
