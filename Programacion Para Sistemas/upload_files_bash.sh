
function do_cleanup() {

    FILES=$(cat .cleanup)
    echo "@CleanUp: Performing CleanUp on {"$FILES"}" 
    mkdir "cleanup_storage"
    for FILE in $FILES; do
        if [ -f $FILE ]; then
            echo "Saving File::"$FILE""
            DIR=$(dirname "$FILE")
            echo "DIRECTORY::$DIR"
            echo "" >> $FILE
            echo "$DIR" >> $FILE
            mv $FILE "cleanup_storage/"
        elif [ -d $FILE ]; then
            echo "Removing Directory::"$FILE"";
            rm -r $FILE
        else
            echo "Can't find "$FILE""
        fi
    done
}


function undo_cleanup() {

    for FILE in ./cleanup_storage/*; do
        echo "Moving "$FILE" back."
        # We obtain the previous path from the file
        PREV_PATH=$(tail -n1 $FILE)
        # We remove the last line of the file (the previous path)
        sed -i '$d' $FILE
        # We get the new path (Which is the old path - the name of the file)
        # NEW_PATH=${PREV_PATH%/*}
        echo "("$FILE")->("$PREV_PATH")"
        # We finally move
        mv $FILE $PREV_PATH
    done 
}

do_cleanup

dir=$(pwd)
echo "Uploading [$dir/Practicas_BASH/tarea-1.1.2018-2019/$FILE_NAME] => [NUMERO_MATRICULA@triqui1.fi.upm.es:~/pps/tarea-1.1.2018-2019]"
# scp -r $dir/Practicas_BASH/tarea-1.1.2018-2019/ NUMERO_MATRICULA@triqui1.fi.upm.es:~/pps/
sleep 10

undo_cleanup