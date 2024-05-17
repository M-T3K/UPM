; Esta prueba calcula los PCs de todo el fichero y los imprime por el Puerto deseado
; Se inicializa con CTRL + K y se termina con ESCAPE


^k:: ; Queremos ejecutar la Prueba con CTRL + K


num := 0
Loop, read, es_int.s
{
    line = A_LoopReadLine
    val := (num * 4)
    Send, PC = %val% = %line%. ; Escribimos la linea
    Send, {Enter} ; Terminamos con un Enter (Carriage Return)
    Sleep, 10 ; We sleep for 10ms
    num++
}


Esc::ExitApp  ; Exit script with Escape key
^p::Pause    ; Pause script with Ctrl+Alt+P
^s::Suspend  ; Suspend script with Ctrl+Alt+S
^r::Reload   ; Reload script with Ctrl+Alt+R



