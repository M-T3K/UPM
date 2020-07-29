# La Vida es Dura
## Pero mas dura es Estructura
Trabaho de Ass-Embly para el regocijo de los homos del Datsi on SiDaH

## Tabla de Contenidos
- [La Vida es Dura](#la-vida-es-dura)
  - [Pero mas dura es Estructura](#pero-mas-dura-es-estructura)
  - [Tabla de Contenidos](#tabla-de-contenidos)
  - [Progreso](#progreso)
  - [Links](#links)
  - [M88K-HK](#m88k-hk)
    - [Registros](#registros)
    - [MACROS](#macros)
    - [Anotaciones](#anotaciones)
  - [Uso de los Archivos .bat](#uso-de-los-archivos-bat)
  - [Uso de los Archivos .sh](#uso-de-los-archivos-sh)

## Progreso

![Entregas](/Info/Entregas.png)

- [x] nFiltrados (0f/10)
- [x] Comp (0f/10)
- [x] ActualizaFiltro (0f/10)
- [x] SubMatriz (0f/10)
- [x] ValorPixel (0f/10)
- [x] FilPixel (0f/10)
- [x] Filtro (0f/10)
- [x] FiltRec  (0f/10)

## Links 

* [Pagina del Proyecto](https://www.datsi.fi.upm.es/docencia/Estructura_09/Proyecto_Ensamblador/)

* [Enunciado](https://www.datsi.fi.upm.es/docencia/Estructura_09/Proyecto_Ensamblador/privado/enunciado_f19.pdf)

* [Casos de Prueba](https://www.datsi.fi.upm.es/docencia/Estructura_09/Proyecto_Ensamblador/privado/casos_f19.pdf)

* [Presentacion](https://www.datsi.fi.upm.es/docencia/Estructura_09/Proyecto_Ensamblador/privado/filtror_f19_exp.pdf)

* [F.A.Q](http://www.datsi.fi.upm.es/docencia/Estructura_09/Proyecto_Ensamblador/aclaraciones.html)

## M88K-HK

M88K-HK (H-Kevin) es una serie de directrices para hacer el codigo escrito en Motorola-88000 mas legible. 

### Registros

* r1 : Reservada para almacenar la direccion de retorno.
* r2 y r3 los tomamos como reservados, para cosas que sean absolutamente necesarias y que no se puedan modificar mas tarde. Me parece adecuado tener un par de registros exclusivamente dedicados a esto. Suelen ser usadas en MACROs.
* r4 a r10 : Uso general para variables
* r11 a r16 :  Aritmetica
* r17, r18, r19 :  Logica (Para comparaciones)
* r20 a r24 :  Registros de los argumentos y parametros de las funciones. 
* r25 a r28 : Auxiliares, se pueden usar en caso de que se necesiten registros adicionales.
* r29 : Para almacenar el valor de retorno.
* r30, r31 : Reservadas para Pila.


### MACROS

* **cPILA()** crea el marco de pila.
* **dPILA()** deshace el marco de pila.
* **IF(ra, condicion, rb, eti)** actua como un if.
* **IFNOT(ra, condicion, rb, eti)** actua como un if negado.

### Anotaciones

Hay varias anotaciones personales. Son un comentario (generalmente "//") que comienza con "@".

* @CleanUp : Sugiere que hay que limpiar el codigo (eliminar restos de testing y demas)
* @Opt     : Sugiere que hay que optimizar el codigo.
* @WIP     : Sugiere que el codigo no esta terminado. No tocar nada hasta que esta anotacion no este.
* @me   : Informacion para mi (Deberia eliminarse cuando se limpie el codigo)
* @info : Info general para cualquiera (Eliminar cuando se haga el cleanup)
* @TODO : Cosas que faltan por hacer. 
* @Check : Algo que requiere comprobacion (i.e. posibles bugs)
No creo que use ninguna mas por ahora. There you go.

## Uso de los Archivos .bat

* Llamada a **compile.bat**, pedira la etiqueta para la que hacer el punto de entrada.
* LLamada a **run.bat**, correra el archivo.
* Funcionan exclusivamente en nuestro repositorio. Cualquier otra organizacion de archivos y/o carpetas necesitara una edicion del codigo.

## Uso de los Archivos .sh

* Llamada a **comp.sh**, pedira la etiqueta a usar como punto de entrada.
    LLamada correcta: *sudo ./comp.sh*.
* LLamada a **run.sh**, correra el archivo.
    LLamada correcta: *sudo ./run.sh*.
* Funcionan para cualquier Sistema Unix siempre y cuando el emulador de DATSI este instalado.
* Los derechos de Super User son necesarios. En otras palabras, *sudo* es obligatorio.