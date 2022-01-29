# IA2K21
Practica de Inteligencia Artificial

# Contenidos
- [IA2K21](#ia2k21)
- [Contenidos](#contenidos)
  - [Estructura de la práctica](#estructura-de-la-práctica)

## Estructura de la práctica
El código está repartido en 4 ficheros fuente y 3 archivos que se usan a modo de base de datos. Existen además dos scripts de bash para facilitar labores y una imagen png de la red de metro. Se ha usado la versión 3.8.3 de Python y las librerías "networkx" para creación y manipulación de grafos y "PyQt5" para el desarrollo del entorno gráfico.

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
- install_requirements: Instala automáticamente las librerías necesarias para ejecutar la práctica
- run: Ejecuta la práctica

Otros:
- requirements.txt : Archivo de pip para listar dependencias


