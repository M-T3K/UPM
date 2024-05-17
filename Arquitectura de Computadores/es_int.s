* |================================================================================|
* |                                                                                | 
* |                          ARQUITECTURA DE COMPUTADORES                          |
* |                          ~ PROYECTO ENTRADA-SALIDA ~                           |                         
* |                                   ~ 2021 ~                                     |
* |                          "A la tercera va la vencida."                         |
* |                                                                                |
* |================================================================================|


* Sitios Utiles

* Ensamblador M68K:
        * http://68k.hax.com/
        * http://mrjester.hapisan.com/04_MC68/

* ASCII:
        * https://ascii.cl/
        * https://www.rapidtables.com/convert/number/ascii-to-hex.html

* Las paginas especificadas son del pdf, no las marcadas en el documento
* Tabla de Vectores de Interrupcion

        ORG     $0
        DC.L    $8000           * Posicion de la Pila
        DC.L    INICIO          * Posicion del PC

* |================================================================================|
* |                                                                                | 
* |                      Tabla de Registros de Duart                               |
* |                              Manual P. 43                                      |
* |                                                                                |
* |================================================================================|

        ORG     $400

*Linea A

MR1A            EQU     $effc01       	* De modo A (Linea A)
MR2A            EQU     $effc01       	* De modo A (Linea A)
SRA             EQU     $effc03       	* De estado A (lectura)
CSRA            EQU     $effc03       	* De seleccion de reloj A (escritura)
CRA             EQU     $effc05       	* De control A (escritura) y Sin Acceso
RBA             EQU     $effc07       	* Buffer recepcion A  (lectura)
TBA             EQU     $effc07       	* Buffer de transmision A (escritura)
ACR             EQU	$effc09	      	* De control auxiliar
ISR             EQU     $effc0B       	* De estado de interrupcion A (lectura)
IMR             EQU     $effc0B       	* De mascara de interrupcion A (escritura)

* Linea B

MR1B	        EQU     $effc11		* De modo B (Linea B)
MR2B	        EQU     $effc11		* De modo B (Linea B)
SRB 	        EQU	$effc13		* De estado B (lectura)
CSRB	        EQU	$effc13		* De seleccion de reloj B (escritura)
CRB             EQU     $effc15		* De control B (escritura)
TBB 	        EQU 	$effc17		* Buffer de transmision B (escritura)
RBB             EQU     $effc17		* Buffer de recepcion B (lesctura)

* Ambas Lineas

IVR	        EQU	$effc19		* De vector de interrupcion (escritura y lectura)
*               EQU     $effc1b         * Sin Implementar x2
*               EQU     $effc1d         * Sin Implementar x2
*               EQU     $effc1F         * Sin Implementar x2

* Registro de Estado de Interrupcion, pagina 47 manual 1.1
TXRDYA	        EQU	0
RXRDYA	        EQU	1
TXRDYB	        EQU	4
RXRDYB	        EQU	5

IMRC            DS.B    1       * Aqui guardamos la copia del IMR
                                * Necesaria porque IMR no se puede 
                                * leer. Pg. 67 manual 1.1

* |================================================================================|
* |                                                                                | 
* |                             Datos y Variables                                  |
* |                                                                                |
* |================================================================================|

* Codigo de Puerto (usados en comparaciones para mayor legibilidad)
* Cada puerto viene denominado por su codigo en binario (pg 65 pdf)
* Bit 0: Determina Linea de transmision (A o B)
* Bit 1: Determina el Tipo de Buffer (Recepcion o Transmision)
* 8 Bits:   00000000
* Posicion: 76543210
* Por lo tanto, bastaria con enmascarar AND.L #3,D0, y comprobar lo siguiente: 
* Recepcion Linea A:   00 = 0x0
* Recepcion Linea B:   01 = 0x1
* Transmision Linea A: 10 = 0x2
* Transmision Linea B: 11 = 0x3
PORT_RA	        EQU	0
PORT_RB	        EQU	1
PORT_TA	        EQU	2
PORT_TB	        EQU	3

* Datos Buffer Circular
BUFSZ	        EQU	2001

* Zona de Buffers
BUF_RA          DS.B    BUFSZ   * Buffer de Recepcion A
BUF_RB          DS.B    BUFSZ   * Buffer de Recepcion B
BUF_TA          DS.B    BUFSZ   * Buffer de Transmision A
BUF_TB          DS.B    BUFSZ   * Buffer de Transmision B
FINBUFTB        DS.B    1       * Fin de la Zona de Buffers

* Zona de Punteros
PTR_RAI		DC.L	1	* Puntero de Insercion
PTR_RAX		DC.L	1	* Puntero de Extraccion 

PTR_RBI		DC.L	1	* Puntero de Insercion
PTR_RBX		DC.L	1	* Puntero de Extraccion 

PTR_TAI		DC.L	1	* Puntero de Insercion
PTR_TAX		DC.L	1	* Puntero de Extraccion 

PTR_TBI		DC.L	1	* Puntero de Insercion
PTR_TBX		DC.L	1	* Puntero de Extraccion 

* |================================================================================|
* |                                                                                | 
* |                            Subrutina RTI                                       |
* |                            Manual p. 71                                        |
* |                                                                                |
* |================================================================================|

RTI:            * MOVE.W #0,D6                  * Que cojones es esto? No recuerdo haberlo puesto, buah chaval estoy molido
                MOVEM.L D0-D2,-(A7) 	        * Guarda los registros que se usan en la pila
                AND.L #0,D1                     * Reset de Registros Utilizados
                AND.L #0,D2
                * Seccion de Identificacion de Interrupcion
RTI_ID:         MOVE.B ISR,D2                   * Cargamos el ISR en D1
                                                * (Interruption State Register)
                                                * Basicamente nos dice donde hubo una interrupción
                AND.B IMRC,D2                   * El ISR se enmascara con el IMR, pg. 40 del manual 1.1
                                                * Esencialmente es un filtro que nos permite decidir qué
                                                * Interrupciones consideramos importantes
                                                * En INIT hemos marcado los siguientes bits: 00100010
                                                * Eso corresponde con un modo FFULL de interrupciones
                                                * hasta que se haya cargado algo en los puertos
                                                * pg. 41 del manual, lo que implica interrupciones completas
                * Las operaciones se deben negar aqui, porque BTST funciona de tal forma que el valor TRUE 
                * es que un bit determinado sea igual a 0
                BTST #RXRDYB,D2                 * Si el origen no es transmisión por linea A
                        BNE RTI_RB              * !(D1 & 0b00000001) == Vamos a transmision de A
                BTST #TXRDYB,D2                 * Si el origen no es transmisión por linea A
                        BNE RTI_TB              * !(D1 & 0b00010000) == Vamos a transmision de A
                BTST #RXRDYA,D2                 * Si el origen no es transmisión por linea A
                        BNE RTI_RA              * !(D1 & 0b00100000) == Vamos a transmision de A
                BTST #TXRDYA,D2                 * Si el origen no es transmisión por linea A
                        BNE RTI_TA              * !(D1 & 0b00000010) == Vamos a transmision de A
                * Esto no deberia haber ocurrido
                * BRA RTI_ERR
                BRA RTIEND
                * Zona de Recepcion
RTI_RA:         MOVE.B RBA,D1                   * Cargamos el caracter del puerto de recepcion a
                MOVE.L #PORT_RA,D0              * Cargamos el puerto RA para ESCCAR
                        BRA RTI_REC
RTI_RB:         MOVE.B RBB,D1                   * Cargamos el caracter del puerto de recepcion b
                MOVE.L #PORT_RB,D0              * Igual que en RTI_RA pero para RB
                * Seccion de Tratamiento de Interrupciones: Apartado de Recepcion
RTI_REC:                BSR ESCCAR              * Ejecutamos ESCCAR
                * Situación Especial I: pg. 70 manual 1.1
                * Si el buffer está lleno, descartamos el caracter 
                * y realmente, todos los demas que vengan despues
                * CMPI.L #$FFFFFFFF,D0            * Buffer de ESCCAR lleno
                *         BEQ RTI_ERR
                * Si hacemos esto de arriba, nos acabamos saliendo de la RTI y eso es un problema
                * porque no debemos salir de la RTI
                        BRA RTI_ID              * Volvemos al principio: En el manual 1.1 pone que
                                                * "Si no, hasta que no se cargue un nuevo car´acter
                                                * en el registro del buffer de transmisi´on 
                                                * correspondiente (TBA o TBB) se solicitar´an 
                                                * interrupciones de forma ininterrumpida" pg 47
                                                * Debemos hacerlo porque la transmision es por bloques
                * Seccion de Tratamiento de Interrupciones: Apartado de Transmision
                * Solo se puede transmitir un caracter simultaneamente
RTI_TA:         MOVE.L #PORT_TA,D0              * Cargamos el Identificador del Puerto de Transmision A
                        BSR LEECAR      
                CMPI.L #$FFFFFFFF,D0            * El buffer esta vacio: no queda nada por trasmitir
                        BNE RTI_TATR            * Hacemos la Transmision
                        
                * Si la interrupcion es de “transmision” y el buffer interno de la lınea esta vacıo
                * (la llamada a la funcion LEECAR ha devuelto 0xFFFFFFFF) se deben deshabilitar
                * las interrupciones de transmision para la lınea que ha interrumpido en el registro IMR 
                * Pagina 70 Manual 1.1
                BCLR #TXRDYA,IMRC               * Una vez hacemos la transmision, inhibimos
                MOVE.B IMRC,IMR                 * para evitar llamadas innecesarias.
                        BRA RTI_ID
RTI_TATR:       MOVE.B D0,TBA                   * Transmitimos el caracter
                        BRA RTI_ID              * Volvemos a la RTI en bucle
                * FIN DE TRANSMISION A

RTI_TB:         MOVE.L #PORT_TB,D0              * Cargamos el Identificador del Puerto de Transmision A
                        BSR LEECAR      
                CMPI.L #$FFFFFFFF,D0            * El buffer esta vacio: no queda nada por trasmitir
                        BNE RTI_TBTR            * Hacemos la Transmision
                        
                * Si la interrupcion es de “transmision” y el buffer interno de la lınea esta vacıo
                * (la llamada a la funcion LEECAR ha devuelto 0xFFFFFFFF) se deben deshabilitar
                * las interrupciones de transmision para la lınea que ha interrumpido en el registro IMR 
                * Pagina 70 Manual 1.1
                BCLR #TXRDYB,IMRC               * Una vez hacemos la transmision, inhibimos
                MOVE.B IMRC,IMR                 * para evitar llamadas innecesarias.
                        BRA RTI_ID
RTI_TBTR:       MOVE.B D0,TBB                   * Transmitimos el caracter
                        BRA RTI_ID              * Volvemos a la RTI en bucle
                * Fin de Transmision de B

* RTI_ERR:        MOVE.L #4,D1                    * Indicamos que hay error en RTI
                        * BSR PERROR              * Imprimimos el Error
RTIEND:         MOVEM.L (A7)+,D0-D2          * Restauramos los registros que habiamos guardado en pila
	        RTE

* |================================================================================|
* |                                                                                | 
* |                           Subrutina INIT                                       |
* |                            Manual p. 68                                        |
* |                                                                                |
* |================================================================================|


INIT:   * PAGINA 44+ del Manual. Empezando por la Linea A
        * Primero reiniciamos el puntero de Control A:
        MOVE.B  #%00010000,CRA		
        * Queremos que cada puerto tenga 8 bits
        MOVE.B  #%00000011,MR1A		
        * Desactivamos el ECO
        MOVE.B  #%00000000,MR2A		
        * Velocidad = 38400 bps.
        MOVE.B  #%11001100,CSRA         
        * Full Duplex, transmision y recepcion activados.  
        MOVE.B  #%00000101,CRA		

        * Linea B

        * Primero reiniciamos el puntero de Control B:
        MOVE.B  #%00010000,CRB		
        * Queremos que cada puerto tenga 8 bits       
        MOVE.B  #%00000011,MR1B
        * Desactivamos el ECO  
        MOVE.B  #%00000000,MR2B	
        * Velocidad = 38400 bps.	
        MOVE.B  #%11001100,CSRB
        * Full Duplex, transmision y recepcion activados. 
        MOVE.B  #%00000101,CRB

        * Ambas Lineas (Comunes)
        * Velocidad = 38400 bps
        MOVE.B  #%00000000,ACR         

        * Interruption Handling
        MOVE.B  #%00100010,IMRC	
        MOVE.B  IMRC,IMR		
        MOVE.B  #$40,IVR		* Vector de Interrupciones

        * Apuntamos al inicio de cada buffer
	MOVE.L	#BUF_RA,PTR_RAI		* Puntero de Insercion
	MOVE.L	#BUF_RA,PTR_RAX		* Puntero de Extraccion

	MOVE.L	#BUF_RB,PTR_RBI	        * Puntero de Insercion
	MOVE.L	#BUF_RB,PTR_RBX	        * Puntero de Extraccion

	MOVE.L	#BUF_TA,PTR_TAI	        * Puntero de Insercion
	MOVE.L	#BUF_TA,PTR_TAX	        * Puntero de Extraccion

	MOVE.L	#BUF_TB,PTR_TBI	        * Puntero de Insercion
	MOVE.L	#BUF_TB,PTR_TBX	        * Puntero de Extraccion
	
        * Errores para pruebas
	* MOVE.L	#ERRORSPC,PTR_ERRI      * Puntero de Insercion de Errores

        MOVE.L  #RTI,$100               * Almacenamos la direccion de RTI en 0x100
        
        RTS



* |================================================================================|
* |                                                                                | 
* |                                  AUXILIARES                                    |
* |                                                                                |
* |================================================================================|

* Esta subrutina determina el bufer al que vamos, y prepara los punteros
* Retornara, para el buffer especificado por el descriptor:
* A0 <- Direccion de Comienzo del Buffer 
* A1 <- Direccion de Puntero de Extraccion
* A2 <- Direccion de Puntero de Insercion
* A3 <- Direccion de Fin del Buffer
* A4 <- Direccion en memoria del Puntero de Extraccion
* A5 <- Direccion en memoria del Puntero de Insercion
* Estos dos ultimos son necesarios para poder actualizar los punteros

* Orden de los Buffers
* BUF_RA          
* BUF_RB          
* BUF_TA          
* BUF_TB          
* FINBUFTB                      * Esto es una direccion unicamente utilizada para localizar el fin del BUFF_TB

BUFSEL: AND.L	#3,D0           * Aplicamos una máscara para filtrar bits innecesarios
* SEL_RA:
        CMP.B   #PORT_RA,D0     * Comprobamos si el buffer es 0b00 (PORT_RA)
                BNE SEL_RB      * Si no es correcto, pasamos al siguiente buffer
        LEA BUF_RA,A0           * Cargamos la direccion del Buffer
        MOVE.L PTR_RAX,A1       * Cargamos el puntero de extraccion
        MOVE.L PTR_RAI,A2       * Cargamos el puntero de insercion
        LEA BUF_RB,A3           * Cargamos la direccion en la que termina el buffer
        LEA PTR_RAX,A4          * Cargamos la direccion de la variable del puntero de Extraccion
        LEA PTR_RAI,A5          * Cargamos la direccion de la variable del puntero de Insercion
                BRA FINSEL
        * END
SEL_RB: CMP.B   #PORT_RB,D0     * Comprobamos si el buffer es 0b01 (PORT_RB)
                BNE SEL_TA   
        LEA BUF_RB,A0           * Cargamos la direccion del Buffer
        MOVE.L PTR_RBX,A1       * Cargamos el puntero de extraccion
        MOVE.L PTR_RBI,A2       * Cargamos el puntero de insercion
        LEA BUF_TA,A3           * Cargamos la direccion en la que termina el buffer
        LEA PTR_RBX,A4          * Cargamos la direccion de la variable del puntero de Extraccion
        LEA PTR_RBI,A5          * Cargamos la direccion de la variable del puntero de Insercion   
                BRA FINSEL
        * END
SEL_TA: CMP.B   #PORT_TA,D0     * buffer == 0b10 (PORT_TA)?
                BNE SEL_TB      
        LEA BUF_TA,A0           * Cargamos la direccion del Buffer
        MOVE.L PTR_TAX,A1       * Cargamos el puntero de extraccion
        MOVE.L PTR_TAI,A2       * Cargamos el puntero de insercion
        LEA BUF_TB,A3           * Cargamos la direccion en la que termina el buffer
        LEA PTR_TAX,A4          * Cargamos la direccion de la variable del puntero de Extraccion
        LEA PTR_TAI,A5          * Cargamos la direccion de la variable del puntero de Insercion
                BRA FINSEL
        * END
        * Llegados a este punto, sabemos que tiene que ser el buffer de tranmision B
SEL_TB: LEA BUF_TB,A0           * Cargamos la direccion del Buffer
        MOVE.L PTR_TBX,A1       * Cargamos el puntero de extraccion
        MOVE.L PTR_TBI,A2       * Cargamos el puntero de insercion
        LEA FINBUFTB,A3         * Cargamos la direccion en la que termina el buffer
        LEA PTR_TBX,A4          * Cargamos la direccion de la variable del puntero de Extraccion
        LEA PTR_TBI,A5          * Cargamos la direccion de la variable del puntero de Insercion
        * END
FINSEL:	RTS

* |================================================================================|
* |                                                                                | 
* |                              SUBRUTINA LEECAR                                  |
* |                                                                                |
* |================================================================================|

LEECAR: MOVEM.L A0-A5,-(A7)     * Se guardan los registros usados en la pila
                BSR BUFSEL      *
        AND.L #0,D0             *
        CMPA.L A1,A2            * Si el puntero de extraccion y el de insercion estan 
                BEQ LEEERR      * En la misma posicion, eso quiere decir que el buffer 
                                * Esta vacio 
                                * IMPORTANTE: Esto es asi solo porque se esta comprobando 
                                * antes de realizar cualquier operacion
        MOVE.B (A1)+,D0         * Leemos el caracter desde la posicion del puntero. 
                                * Incrementamos el puntero.
        CMPA.L A3,A1            * Comprobamos si hemos llegado al final del buffer
                BNE LEENXT      * Si hemos llegado, al tratarse de un buffer circular
        MOVEA.L A0,A1           * volvemos a apuntar el ptr extraccion al principio d
LEENXT: MOVE.L A1,(A4)          * Actualizamos el puntero en memoria, mirar ESCCAR para mas info
                BRA LEEEND      * 
        * END                   *
LEEERR: MOVE.L #$FFFFFFFF,D0    
LEEEND:	MOVEM.L (A7)+,A0-A5 	*R Se restauranlos registros
	RTS

* |================================================================================|
* |                                                                                | 
* |                              SUBRUTINA ESCCAR                                  |
* |                                                                                |
* |================================================================================|

ESCCAR: MOVEM.L A0-A5/D2,-(A7)  * Se guardan los registros  usados en la pila
                BSR BUFSEL      * Seleccionamos el Buffer
        AND.L #0,D0             * Asumimos que la operacion ira bien (D0 = 0, esto solo cambia cuando
                                * haya un error, solo pueden haber 2 valores, 0 o -1 segun el enunciado
        MOVE.B D1,(A2)+         * Metemos el caracter de D1 en la direccion del 
                                * puntero de insercion. Incrementamos puntero.
        CMPA.L A2,A3            * Comprobamos si hemos llegado al final del buffer. 
                BNE ESCNXT      * Buffer Circular -> Cuando se llega al final, se 
        MOVEA.L A0,A2           * vuelve a apuntar el ptr_insercion al inicio del buffer.
ESCNXT: CMPA.L A2,A1            * Si el puntero de insercion = el de extraccion, entonces
                BEQ ESCERR      * El buffer esta lleno. Es un buffer circular, el ptr_ins 
                                * solo puede ser igual al ptr_ex si ambos estan en la posicion 
                                * inicial. Esto quiere decir que no se ha extraido ningun caracter
                                * y que se han insertado todos los caracteres en el buffer.
                                * IMPORTANTE: Esto es asi porque se incrementa antes de realizar 
                                * cualquier comprobacion.
        MOVE.L A2,(A5)          * Actualizamos el valor del puntero (al no conservarse el registro
                                * A2, tenemos que hacer una escritura en memoria para que cada vez
                                * que carguemos el puntero este actualizado.
                BRA ESCEND
        * END
ESCERR: MOVE.L #$FFFFFFFF,D0    * Si el buffer seleccionado esta lleno
ESCEND:	MOVEM.L (A7)+,A0-A5/D2	* Se restauran los registros
	RTS

* |================================================================================|
* |                                                                                | 
* |                              SUBRUTINA SCAN                                    |
* |                                                                                |
* |================================================================================|

SCAN:           LINK  A6,#0     	* Inicializamos marco de pila
                MOVE.L #0,A1             * Reset de los registros utilizados
                AND.L #0,D0
                AND.L #0,D1             
                AND.L #0,D2
                AND.L #0,D3
                AND.L #0,D4
                MOVE.L 8(A6),A1         * Direccion del Buffer en el que se devuelven
                                        * los caracteres leidos
                MOVE.W 12(A6),D2        * Descriptor del buffer
                MOVE.W 14(A6),D3        * Maximo de caracteres a leer
                MOVE.L #PORT_RB,D4      * Por defecto, asumimos que va a RA
                CMPI.W #1,D2            * Comprobamos si es RB
                        BEQ SIG_SC
                AND.L #0,D4             * Reset de D4 por si acaso, ya no se ni que cojones estoy haciendo
                MOVE.L #PORT_RA,D4      * Asumimos que es RB
                CMPI.W #0,D2            * Comprobamos si es RB
                        BEQ SIG_SC
                MOVE.L #$FFFFFFFF,D0    * Descriptor erroneo
                        BRA SCAN_END
SIG_SC:         AND.L #0,D5
                CMPI.W #0,D3            * Queremos leer 0 bytes
                        BEQ SCAN_SAL    * nos vamos directamente

SCAN_BUC:       MOVE.L D4,D0            * Insertamos el Descriptor de Buffer
                        BSR LEECAR      * Leemos caracter
                CMPI.L #$FFFFFFFF,D0    * ERROR: Buffer vacio
                        BEQ SCAN_SAL    * Terminamos: Si el buffer esta vacio no 
                                        * Perdemos mas el tiempo
                MOVE.B D0,(A1)+         * Escribimos el caracter leido en el buffer
                ADDI.W #1,D5            * Incrementamos el contador
                CMP.W D5,D3             * Hemos leido todos los caracteres?
                        BNE SCAN_BUC    
SCAN_SAL:       MOVE.L D5,D0            * Actualizamos D0 con el valor apropiado
SCAN_END:       UNLK    A6
                RTS

* |================================================================================|
* |                                                                                | 
* |                                SUBRUTINA PRINT                                 |
* |                                                                                |
* |================================================================================|


PRINT:          LINK    A6,#0   	        * Inicializamos marco de pila
                MOVE.L #0,A1                    * Reset de los registros utilizados
                AND.L #0,D0
                AND.L #0,D1             
                AND.L #0,D2
                AND.L #0,D3
                AND.L #0,D4
                AND.L #0,D5                     * Contador de caracteres
                MOVE.L 8(A6),A1                 * Cargamos el buffer
                MOVE.W 12(A6),D2                * Cargamos el Descriptor
                MOVE.W 14(A6),D3                * Cargamos el tamaño
                MOVE.L #PORT_TA,D4              * Por defecto Asumimos TA
                CMPI.W #0,D2                    * Comprobamos si es TA
                        BEQ PRNT_BUC            * Pasamos al bucle de transmision
                AND.L #0,D4                     * Reset de D4, a ver si esto hace algo
                MOVE.L #PORT_TB,D4              * Asumimos TB
                CMPI.W #1,D2                    * Comprobamos si es TB
                        BEQ PRNT_BUC
                MOVE.L #$FFFFFFFF,D0            * Descriptor incorrecto
                        BRA PRNT_END

PRNT_BUC:       CMPI.W #0,D3                    * Si quedan por transmitir 0 bytes, 
                        BEQ PRNT_INT            * Salimos del bucle de transmision
                MOVE.L D4,D0                    * Cargamos el descriptor
                MOVE.B (A1),D1                 * Cargamos el caracter a transmitir
                        BSR ESCCAR              * Escribimos el caracter
                CMPI.L #$FFFFFFFF,D0            * ERROR: El buffer está lleno
                        BEQ PRNT_SAL            * Terminamos
                ADD.L #1,A1                     * Incrementamos el A1 solo si no explota
                ADDI.W #1,D5                    * Incrementamos el contador
                SUBI.L #1,D3                    * Decrementamos cantidad por transmitir
                        BRA PRNT_BUC
                * Fin del Bucle

                * Zona de Interrupciones
                * Dado que en la RTI cambiamos los bits del IMR
                * para evitar redundancia y los problemas que 
                * Conllevaria, lo que debemos hacer aqui es 
                * actualizarlos cada vez que se vaya a transmitir algo.
                * Para evitar problemas, debemos asegurarnos de que no surge
                * ningun tipo de interrupcion en este momento, ya que esto
                * dispararia la RTI y podria inhibir un bit, provocando una 
                * condicion de carrera que impediria la correcta transmision
                * de caracteres.
PRNT_INT:       AND.L #0,D6                     * Reset de D6
                MOVE.W SR,D6                    * Salvaguardado de Registro de Estado
                MOVE.W #$2700,SR                * Inhibimos interrupciones
                CMPI.L #0,D2                    * Comprobamos el puerto
                        BEQ PRNT_TA
                * No hace falta comprobar el descriptor del puerto b
                * porque llegado este punto, por las comprobaciones al 
                * principio de la subrutina, hubiera devuelto 0xFFFFFFFF
                BSET #TXRDYB,IMRC
                        BRA PRNT_ACT
PRNT_TA:        BSET #TXRDYA,IMRC
PRNT_ACT:       MOVE.B IMRC,IMR                 * Actualizamos la mascara de interrupcion
                                                * para tener en cuenta las interrupciones 
                                                * por transmision
                MOVE.W D6,SR                    * Restauramos las interrupciones
                * FIN DE ZONA DE INTERRUPCIONES
PRNT_SAL:       MOVE.L D5,D0
PRNT_END:       UNLK    A6
                RTS


* |================================================================================|
* |                                                                                | 
* |                                PRUEBAS                                         |
* |                                                                                |
* |================================================================================|

*         ORG $6000

* ERRORSPC:       DS.B 2100       * ERROR SPACE
* PTR_ERRI        DC.L 1          * Puntero 

* * |================================================================================|
* * |                                                                                | 
* * |                           THE END IS NIGH                                      |
* * |                                                                                |
* * |================================================================================|

* ERR_INI         DC.B   'ERROR EN SUBRUTINA ' * 20 BYTES
* LERRINI         DC.L   20      * Longitud de Buffer de error de inicio

* ERR_FIN         DC.B   '#STOP#'
* LERRFIN         DC.L   6      * Longitud de Buffer de error de fin


* * NOMBRES Y LONGITUD DE SUBRUTINAS
* * 0
* N_ESC           DC.B   'ESCCAR'        * 6 BYTES
* LN_ESC          DC.L   6       

* * 1
* N_LEE           DC.B   'LEECAR'        * 6 BYTES
* LN_LEE          DC.L   6

* * 2
* N_SCAN          DC.B   'SCAN'          * 4 BYTES
* LN_SCAN         DC.L   4

* * 3
* N_PRINT         DC.B   'PRINT'          * 5 BYTES
* LN_PRNT         DC.L   5

* * 4
* N_RTI           DC.B   'RTI'            * 4 BYTES
* LN_RTI          DC.L   3

* * Subrutina de bucle que escribe todo un buffer con los siguientes params:
* * A0: Direccion de Espacio de Escritura
* * A1: Direccion de Contenidos a Escribir
* * D2: Longitud de los contenidos a escribir
* BPERROR:        MOVEM.L A1-A2/D1-D2,-(A7)       * Guarda los registros que se usan en la pila,
*                                                 * porque sino se resetean
* BUCERR:         MOVE.B  (A1)+,D1                * Cargamos el caracter a escribir
*                 MOVE.B  D1,(A0)+                * Escribimos en el buffer
*                 SUB.L   #1,D2                   * Le quitamos 1 al contador
*                 CMPI.L  #0,D2                   * Comprobamos si el bucle ha llegado a su fin
*                         BNE BUCERR
*                 * END
*                 MOVEM.L (A7)+,A1-A2/D1-D2
*                 RTS

* * Subrutina Perror que recibe un valor por Registro 
* PERROR:         MOVEM.L A0-A5/D0-D7,-(A7)       * Salvaguardado de Registros completo
*                 * Escribimos el error inicial en la direccion
*                 MOVE.L  LERRINI,D2      * Cargamos la Longitud del buffer de Inicio
*                 MOVE.L  PTR_ERRI,A0     * Cargamos la direccion del espacio de errores
*                 LEA     ERR_INI,A1      * Cargamos la direccion del Buffer
*                         BSR BPERROR
*                 * Fin de escritura del error inicial
                
*                 * Detallado

*                 CMPI.L  #0,D1           * Hubo error en ESCCAR?
*                         BNE PE_LEE  
*                 MOVE.L  LN_ESC,D2       * Cargamos la Longitud del buffer de Inicio
*                 LEA     N_ESC,A1        * Cargamos la direccion del Buffer
*                         BSR BPERROR
*                 BRA PE_FIN
*                 * Fin ERROR_ESCCAR

* PE_LEE:         CMPI.L  #1,D1           * Hubo error en LEECAR?
*                         BNE PE_SCAN  
*                 MOVE.L  LN_LEE,D2       * Cargamos la Longitud del buffer de Inicio
*                 LEA     N_LEE,A1        * Cargamos la direccion del Buffer
*                         BSR BPERROR
*                 BRA PE_FIN
*                 * Fin ERROR_LEECAR

* PE_SCAN:        CMPI.L  #2,D1           * Hubo error en SCAN?
*                         BNE PE_PRNT  
*                 MOVE.L  LN_SCAN,D2      * Cargamos la Longitud del buffer de Inicio
*                 LEA     N_SCAN,A1       * Cargamos la direccion del Buffer
*                         BSR BPERROR
*                 BRA PE_FIN
*                 * Fin ERROR_SCAN

* PE_PRNT:        CMPI.L  #3,D1           * Hubo error en PRINT?
*                         BNE PE_RTI  
*                 MOVE.L  LN_PRNT,D2      * Cargamos la Longitud del buffer de Inicio
*                 LEA     N_PRINT,A1       * Cargamos la direccion del Buffer
*                         BSR BPERROR
*                 BRA PE_FIN
*                 * Fin ERROR_PRINT

* PE_RTI:         * Las comprobaciones aqui sobran * Hubo error en RTI?
*                 MOVE.L  LN_RTI,D2      * Cargamos la Longitud del buffer de Inicio
*                 LEA     N_RTI,A1       * Cargamos la direccion del Buffer
*                         BSR BPERROR
*                 BRA PE_FIN
*                 * Fin de Detalle
                
*                 * Escribimos el error final
* PE_FIN:         MOVE.L  LERRFIN,D2      * Cargamos la Longitud del fin del buffer de error
*                 LEA     ERR_FIN,A1      * Cargamos el buffer de Fin de error 
*                         BSR BPERROR
*                 * Fin de escritura del error final
*                 LEA PTR_ERRI,A2         * Actualizamos el puntero
*                 MOVE.L A0,(A2)
*                 MOVEM.L (A7)+,A0-A5/D0-D7
*                 RTS     * Volvemos a la posición anterior
*                 * BRA FIN_PRG

* * Buffer con los numeros 0123456789 para escribirlo en bucle
* BUFNUM: DC.B    '01234567890123456789012345678901234567890123456789012345678901234567890123456789'
* 	DC.B	'01234567890123456789012345678901234567890123456789012345678901234567890123456789'
* LENP2:  DC.L    100     * Longitud de este buffer



* * Identificador de la prueba: pr06es_int
* *	Entrada/Salida por interrupciones.
* *	La subrutina ESCCAR falla cuando se escriben más de 2000 caracteres
* * en el buffer de transmision de la linea B (2200 llamadas a ESCCAR). Solo se deben
* * aceptar los 2000 primeros caracteres.
* * El registro D0 contiene el numero total de caracteres leidos o escritos en la linea.
* * El valor de este registro no es correcto. El que genera la prueba es
* *	REGISTRO D0: 00000898
* * y el que debe generar es
* *	REGISTRO D0: 000007d0.

* * 2200 caracteres / 100 chars por bloque numerico = 22
* XPR_06:         AND.L #0,D4             * Cantidad de Escrituras
*                 MOVE.L #22,D2           * Cargamos la cantidad de veces que debemos
*                                         * Ejecutar el bloque (220) (i)
* B1XPR_06:       LEA BUFNUM,A0           * Cargamos la direccion del buffer numerico
*                 MOVE.L LENP2,D3         * Cargamos la longitud del buffer numerico (j)
* B2XPR_06:       MOVE.L #PORT_RA,D0      * Pasamos el puerto al registro
*                 MOVE.B (A0)+,D1         * Cargamos el char correspondiente. Aumentamos buffer.
*                         BSR ESCCAR      * Escribimos el char con ESCCAR
*                 CMPI.L #$FFFFFFFF,D0    * Si hubo un error, lo marcamos
*                         BEQ PERROR  
*                 ADDI.L #1,D4            * Aumentamos en 1 la cantidad de escrituras por ESCCAR
*                 SUB.L #1,D3             * j-- 
*                 CMP.L #0,D3             * Recorremos el buffer numerico
*                         BNE B2XPR_06     

*                 SUB.L #1,D2             * i--
*                 CMP.L #0,D2             * Realizamos el proceso D2 veces
*                         BNE B1XPR_06    
*                 * END
*                 MOVE.L #$11111111,D0    * Todo ha ido bien
*                 RTS


* *       Identificador de la prueba: pr13es_int
* *       Entrada/Salida por interrupciones.
* *       Se realiza la inserción de 2000 caracteres en el buffer interno de
* *recepcion de la linea B llamando sucesivamente a ESCCAR. A continuación se
* *lee 1 caracter de dicho buffer llamando a LEECAR y se intenta insertar dos
* *caracteres (solo deberia tener exito la primera insercion). Los bloques que se
* *transfieren se componen por la secuencia 0123456789 repetida 200 veces.
* *
* *El registro D0 contiene el numero total de caracteres leidos o escritos en la linea.
* *El valor de este registro no es correcto. El que genera la prueba es
* *	REGISTRO D0: 00000001
* *y el que debe generar es
* *	REGISTRO D0: fffffffe.

* XPR_13:         AND.L #0,D4             * Cantidad de Escrituras
*                 MOVE.L #200,D2        * Cargamos la cantidad de veces que debemos
*                 * ESCCAR                * Ejecutar el bloque (220) (i)
* B1XPR_13:       LEA BUFNUM,A0           * Cargamos la direccion del buffer numerico
*                 MOVE.L LENP2,D3         * Cargamos la longitud del buffer numerico (j)
* B2XPR_13:       MOVE.L #PORT_TB,D0      * Pasamos el puerto al registro
*                 MOVE.B (A0)+,D1         * Cargamos el char correspondiente. Aumentamos buffer.
*                         BSR ESCCAR      * Escribimos el char con ESCCAR
*                 CMPI.L #$FFFFFFFF,D0    * Si hubo un error, lo marcamos
*                         BEQ PERROR  
*                 ADDI.L #1,D4            * Aumentamos en 1 la cantidad de escrituras por ESCCAR
*                 SUB.L #1,D3             * j-- 
*                 CMP.L #0,D3             * Recorremos el buffer numerico
*                         BNE B2XPR_13     

*                 SUB.L #1,D2             * i--
*                 CMP.L #0,D2             * Realizamos el proceso D2 veces
*                         BNE B1XPR_13    
*                 * END ESCCAR
*                 * LEECAR
*                 MOVE.L #PORT_TB,D0      * Pasamos el puerto al registro
*                         BSR LEECAR      * Cargamos LEECAR
*                 CMPI.L #$30,D0           * Comprobamos que se ha leido el numero correcto
*                        BNE PERROR       * Si no, error
*                 * END LEECAR
*                 * ESCCAR                * Escribimos 2 caracteres mas
*                 MOVE.L #2,D3            * Contador
* B3XPR_13:       MOVE.L #PORT_TB,D0      * Recargamos el buffer del puerto
*                 LEA BUFNUM,A0           * Cargamos la direccion del buffer numerico
*                 AND.L #0,D1             * Reiniciamos D1
*                 MOVE.B (A0)+,D1         * Cargamos el primer char
*                         BSR ESCCAR      
*                 CMPI.L #$FFFFFFFF,D0    * Comprobamos si hubo error
*                         BEQ PERROR      *
*                 SUB.L #1,D3             * j-- 
*                 CMPI.L #0,D3            * FIN DEL BUCLE
*                         BNE B3XPR_13    * 
*                 * END ESCCAR
                
*                 MOVE.L #$11111111,D0    * Todo ha ido bien
*                 RTS

* * Identificador de la prueba: pr17es_int
* * 	Entrada/Salida por interrupciones.
* * 	La subrutina SCAN falla cuando se le pasa un descriptor
* * invalido.
* * El registro D0 contiene el numero total de caracteres leidos o escritos en la linea.
* * El valor de este registro no es correcto. El que genera la prueba es
* * 	REGISTRO D0: 00000000
* * y el que debe generar es
* * 	REGISTRO D0: ffffffff.
* XPR_17:         MOVE.W #TAMBS,PARTAM    * Inicializa par´ametro de tama~no
*                 MOVE.L #BUFFER,PARDIR   * Par´ametro BUFFER = comienzo del buffer  
*                 MOVE.W #$2000,SR        * Permite interrupciones
*                 MOVE.W PARTAM,-(A7)     * Tamano de bloque
*                 MOVE.W #2,-(A7)         * Descriptor Incorrecto
*                 MOVE.L PARDIR,-(A7)     * Direccion de lectura
*                       BSR SCAN
*                 ADD.L #8,A7             * Restaurado de Pila
*                 MOVE.L #2,D1            * Codigo de error de SCAN
*                 CMPI.L #$FFFFFFFF,D0
*                         BNE PERROR
*                 RTS

* * Prueba de SCAN General: Enviamos N caracteres mediante ESCCAR
* * y probamos a escanear N caracteres con SCAN.
* * El resultado de SCAN deberia ser N
* PR_SCAN:        MOVE.L #BUS_ERROR,8     * Bus error handler
*                 MOVE.L #ADDRESS_ER,12   * Address error handler
*                 MOVE.L #ILLEGAL_IN,16   * Illegal instruction handler
*                 MOVE.L #PRIV_VIOLT,32   * Privilege violation handler
*                 MOVE.L #ILLEGAL_IN,40   * Illegal instruction handler
*                 MOVE.L #ILLEGAL_IN,44   * Illegal instruction handler
*                         BSR INIT

*                 AND.L  #0,D2            * Contador
*                 AND.L  #0,D3            * Contador del Bucle
*                 * MOVE.W #TAMBS,PARTAM    * Inicializa par´ametro de tama~no
*                 MOVE.L #BUFFER,PARDIR   * Par´ametro BUFFER = comienzo del buffer
*                 MOVE.W #$2000,SR        * Permite interrupciones
*                 MOVE.W #5,-(A7)     * Tamano de bloque
*                 MOVE.W #DESA,-(A7)   * Puerto A
*                 MOVE.L PARDIR,-(A7)     * Direccion de lectura
*                       BSR SCAN
*                 ADD.L #8,A7             * Restaurado de Pila
*                 * MOVE.W PARTAM,D3        * Valor inicial
*                 * MOVE.W #15,D3
* * BPR_SCAN:       MOVE.L #PORT_RA,D0
* *                 MOVE.L #'a',D1          * 'A'
* *                 ADD.L D2,D1             * Sumamos para el siguiente char
* *                         BSR ESCCAR      * ESCCAR
* *                 ADDI.L #1,D2            * Incrementamos contador
* *                 SUBI.L #1,D3            * Decrementamos contador del bucle
* *                 CMPI.W #0,D3        * Comparamos si ha llegado al tamano
* *                         BNE BPR_SCAN     * Bucle
                        
* *                 * Prueba de SCAN
* *                 MOVE.W #$2000,SR        * Permite interrupciones
* *                 MOVE.W PARTAM,-(A7)     * Tamano de bloque
* *                 MOVE.W #DESA,-(A7)   * Puerto A
* *                 MOVE.L PARDIR,-(A7)     * Direccion de lectura
* *                       BSR SCAN
* *                 ADD.L #8,A7             * Restaurado de Pila
* *                 MOVE.W #15,D3
* *                 CMP.L D3,D0             * Si se han leido exactamente los caracteres que 
* *                         BEQ PR_PRNT     * habia que leer: saltamos a SCAN
* *                 MOVE.L #2,D1            * Codigo de error de SCAN
* *                         BSR PERROR
* *                 MOVE.L #$FFFFFFFF,D5
* *                         BRA FIN_PRG
* * PR_PRNT:        MOVE.W PARTAM,-(A7)     * Tamano de bloque
* *                 MOVE.W #DESA,-(A7)      * Puerto A
* *                 MOVE.L PARDIR,-(A7)     * Direccion de lectura
* *                       BSR PRINT
* *                 ADD.L #8,A7             * Restablece la pila
* *                 MOVE.W PARTAM,D3        * Cargamos el tama;o de bloque
* *                 CMP.L D3,D0             * Hemos impreso los caracteres que hacian falta
* *                         BEQ PR_PRSCE    * Terminamos
* *                 MOVE.L #3,D1            * Codigo de error de PRINT
* *                         BSR PERROR
* *                 MOVE.L #$FFFFFFFF,D5
* *                         BRA FIN_PRG        
* PR_PRSCE:       RTS

* * Insertamos cosas por la Linea A artificialmente
* * y esperamos a que salte la RTI
* * ! Parece que esto no funciona de esa forma.

* PR_RTI:         MOVE.L #BUS_ERROR,8     * Bus error handler
*                 MOVE.L #ADDRESS_ER,12   * Address error handler
*                 MOVE.L #ILLEGAL_IN,16   * Illegal instruction handler
*                 MOVE.L #PRIV_VIOLT,32   * Privilege violation handler
*                 MOVE.L #ILLEGAL_IN,40   * Illegal instruction handler
*                 MOVE.L #ILLEGAL_IN,44   * Illegal instruction handler
*                         BSR INIT
*                 MOVE.W #$2000,SR        * Permite interrupciones
*                 MOVE.B #'b',RBA         * Enviamos por Recepcion de A
*                 * ERROR: MOVE.B RBA,D6 no deja en D6 un 'a' (0x61). Por que? L987
*                 * Ninguna combinacion RBA/TBA (RBA/RBA, TBA/TBA, RBA/TBA, TBA/RBA) funciona
*                 MOVE.B RBA,D6           * Comprobamos que se ha enviado correctamente
* PR_RTIB:        MOVE.W #TAMBS,PARTAM    * Contador de Chars a 0
*                 MOVE.L #BUFFER,PARDIR   * Direccion del Buffer
*                 MOVE.W PARTAM,-(A7)     * Tamano de bloque
*                 MOVE.W #DESA,-(A7)      * Puerto A
*                 MOVE.L PARDIR,-(A7)     * Direccion de lectura
*                         BSR SCAN 
*                         BRA PR_RTIB    * Recargamos el Bucle
*                 MOVE.W PARTAM,-(A7)     * Tamano de bloque
*                 MOVE.W #DESA,-(A7)      * Puerto A
*                 MOVE.L PARDIR,-(A7)     * Direccion de lectura
*                         BSR PRINT
*                 RTS

* |================================================================================|
* |                                                                                | 
* |                         Prueba Concurrente                                     |
* |                            Manual p. 79                                        |
* |                                2021                                            |
* |                                                                                |
* |================================================================================|

* Propiedad del equipo docente, eliminado al publicar la practica en Github. Se trata de la subrutina INICIO.
* INICIO: * incluir aqui la subrutina concurrente.


* |================================================================================|
* |                                                                                | 
* |                         Prueba Concurrente                                     |
* |                            Manual p. 84                                        |
* |                              2018/2020                                         |
* |                                                                                |
* |================================================================================|

* Propiedad del equipo docente, eliminado al publicar la practica en Github. Se trata de la subrutina INICIO.


BUS_ERROR:      BRA FIN_PRG * Al no tener una alternativa clara
ADDRESS_ER:     BRA FIN_PRG
ILLEGAL_IN:     BRA FIN_PRG
PRIV_VIOLT:     BRA FIN_PRG

FIN_PRG: * Final del Flujo de Ejecucion del Programa
        BREAK * Rompemos el emulador
        NOP   * LLENAMOS DE NOP
        NOP   * LLENAMOS DE NOP
        NOP   * LLENAMOS DE NOP
        NOP   * LLENAMOS DE NOP
        NOP   * LLENAMOS DE NOP
