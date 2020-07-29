# IA2K20
Practica de Inteligencia Artificial 2020

# Contenidos
- [IA2K20](#ia2k20)
- [Contenidos](#contenidos)
  - [Estructura de la práctica](#estructura-de-la-práctica)
  - [Ejecución de la práctica](#ejecución-de-la-práctica)
  - [Posible problema para entrega](#posible-problema-para-entrega)

## Estructura de la práctica
El código está repartido en 4 ficheros fuente y 3 archivos que se usan a modo de base de datos. Existen además dos scripts de bash para facilitar labores y una imagen png de la red de metro. Se ha usado la versión 3.7.5 de Python y las librerías "networkx" para creación y manipulación de grafos y "PyQt5" para el desarrollo del entorno gráfico.

Archivos de código fuente:
- gui.py: Genera la interfaz y contiene el main. Hace uso de los demás archivos.
- QImageLabel.py: Tiene un QLabel con una imagen que permite el dibujado. Usa el archivo "metro.png"
- station.py: Clase que modela una estación de metro.
- AlgoritmoAestrella.py: Implementa el algoritmo A* usando como criterio el elegido por el usuario.

Archivos de datos:
- metro.json: Guarda las estaciones organizadas por líneas, y con su posición y tamaño en la interfaz.
- coord.json: Guarda en forma de lista todas las estaciones con sus coordenadas geográficas.
- aristas.json: Para cada par de estaciones adyacentes, almacena el origen y destino (arista bidireccional) y una lista con pesos. Pueden ser tiempo o distancia entre origen-destino o bien si hay o no transbordo.

Scripts:
- install_gui_components.sh: Instala automáticamente las librerías necesarias para ejecutar la práctica
- run.sh: Ejecuta la práctica

## Ejecución de la práctica
Hay dos formas de ejecutar la práctica. Una de ellas es usando los ejecutables de la carpeta "Buscametro" (hay versión tanto para Windows
como para Linux). Esto permite ejecutar en cualquier parte con un simple click y sin tener en cuenta las dependencias del código. La otra usar run.sh en Linux o bien el mandato "python gui.py" en la terminal en Windows, estando en la carpeta raíz de esta práctica.       

**AVISO:**
En el último caso se debe usar el ejecutable de python3. Si se tiene instalado tanto Python2 como Python3, el mandato python usará la versión que se encuentre con mayor preferencia en el "PATH" del sistema. En algunas distibuciones de Linux no ocurre dado que cada versión de Python usa un nombre de ejecutable diferente (python vs python3).

## Posible problema para entrega
Puede haber un límite de MB en la entrega, con lo cual no podríamos enviar los ejecutables independientes debido a su peso. Si es el caso, la única manera sería entregar el resto y ejecutar tal y como se describe en el apartado anterior.
