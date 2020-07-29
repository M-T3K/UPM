import sys
from PyQt5.QtWidgets import *
from PyQt5.Qt import *
from PyQt5.QtGui import QIcon, QPainter
from PyQt5.QtCore import pyqtSlot
from QImageLabel import QImageLabel
from AlgoritmoAestrella import AlgoritmoAestrella
from station import station
import json


# VARIABLES GLOBALES
g_Lines = ['Verde', 'Amarilla', 'Roja']
g_Criterios = ['Tiempo', 'Distancia', 'Transbordo']  # Alguno mas????: no

def parse(data):
    with open (data, 'r') as f:
        dataDict = json.load(f)
        f.close()
    return dataDict
# END

def getStationsFromFile(filename):
    data = parse(filename)
    line_colors = [l['color'] for l in data['lines']]
    line_nodes  = [l['nodes'] for l in data['lines']]
    list = []
    for i in range(3):
        nodes = []
        for n in line_nodes[i]:
            node = station(n['name'], n['x'], n['y'], n['rad'])
            nodes.append(node)
        # END
        list.append(nodes)
    # END
    return list
# END

class App(QDialog):

    def __init__(self):
        super().__init__()
        
        self.setWindowTitle('Buscametro 3000 / メトロ 3000')
        
        # Margins
        self.left = 10
        self.top = 10
        
        # Size, pongo las dimensiones a 0 para que automaticamente escoja las dimensiones minimas apropiadas
        # Y luego ademas desactivo el resizing para que siempre quede bonito  
        self.setGeometry(self.left, self.top, 0, 0)
        self.setFixedSize(self.size())

        # Modify these with the results from the A* Algorithm
        self.m_timeLabl  = QLabel('0 mins')
        self.m_distLabl  = QLabel('0 Km')
        self.m_transLabl = QLabel('0')

        # More global Widgets...
        self.m_fromLineBox = QComboBox()
        self.m_destLineBox = QComboBox()
        self.m_fromStationBox = QComboBox()
        self.m_destStationBox = QComboBox()
        self.m_critBox = QComboBox()
        self.err = QErrorMessage(self)

        # Algoritmo
        self.A = None

        windowLayout = QGridLayout()

        # Main Panel
        self.preparePanel()
        windowLayout.addWidget(self.panel, 0, 0)
        
        self.setLayout(windowLayout)
        self.show()
    # END
    
    def preparePanel(self):
        # Layout Stuff
        self.panel = QGroupBox()
        layout = QGridLayout()
        
        # Combo / Datos Requeridos
        combos = QGroupBox('Datos:')
        comboLayout = QGridLayout()
        
        self.x = 0
        self.y = 0
        station_data = getStationsFromFile('metro.json')

        # Creamos un array (stations) con los nombres de todas las estaciones
        self.stations = []
        for ln in station_data:
            names = ['Elija Estación...']
            for node in ln:
                names.append(node.name)
            # END
            self.stations.append(names)
        # END

        # Add items to ComboBoxes
        self.m_fromLineBox.addItems(g_Lines)
        self.m_destLineBox.addItems(g_Lines)
        self.m_fromStationBox.addItems(self.stations[0]) # Por defecto ponemos para la linea verde, ya se cambiara cuando se actualicen los comboboxes
        self.m_destStationBox.addItems(self.stations[0])
        self.m_critBox.addItems(g_Criterios)
        
        # Create Event Wrappers
        self.m_fromLineBox.currentIndexChanged.connect(self.onComboLineUpdate)
        self.m_destLineBox.currentIndexChanged.connect(self.onComboLineUpdate)
        self.m_fromStationBox.currentIndexChanged.connect(self.onComboUpdate) 
        self.m_destStationBox.currentIndexChanged.connect(self.onComboUpdate) 
        self.m_critBox.currentIndexChanged.connect(self.onComboUpdate) 

        comboLayout.addWidget(QLabel('Criterio: '),0,0)
        comboLayout.addWidget(self.m_critBox, 0, 1)
        comboLayout.addWidget(QLabel('Desde: '),1,0)
        comboLayout.addWidget(self.m_fromLineBox, 1, 1)
        comboLayout.addWidget(self.m_fromStationBox, 2, 1)
        comboLayout.addWidget(QLabel('Hasta: '),3,0)
        comboLayout.addWidget(self.m_destLineBox, 3, 1)
        comboLayout.addWidget(self.m_destStationBox, 4, 1)
        combos.setLayout(comboLayout)
        layout.addWidget(combos, 0, 0, 3, 3)

        # Resultados
        resultados = QGroupBox('Resultados:')
        resLayout = QGridLayout()
        resLayout.addWidget(QLabel('Tiempo:'),0,0)
        resLayout.addWidget(self.m_timeLabl, 0, 1)
        resLayout.addWidget(QLabel('Distancia:'),1,0)
        resLayout.addWidget(self.m_distLabl, 1, 1)
        resLayout.addWidget(QLabel('Transbordos:'), 2, 0)
        resLayout.addWidget(self.m_transLabl, 2, 1)

        resultados.setLayout(resLayout)
        layout.addWidget(resultados, 3, 0, 3, 3)

        # Metro
        
        self.metroimg = QImageLabel(self, 'metro.png', station_data)
        
        layout.addWidget(self.metroimg, 0, 4, 7, 5)

        # Boton de Busqueda
        searchButton = QPushButton('Buscar')
        searchButton.clicked.connect(self.onClick)
        layout.addWidget(searchButton,7,0, 1, 9)
        
        self.panel.setLayout(layout)
    # END

    # onComboLineUpdate event wrapper
    def onComboLineUpdate(self):
        self.m_fromStationBox.clear()
        self.m_destStationBox.clear()
        self.m_fromStationBox.addItems(self.stations[self.m_fromLineBox.currentIndex()])
        self.m_destStationBox.addItems(self.stations[self.m_destLineBox.currentIndex()])
    # END
    
    # onComboUpdate event wrapper
    def onComboUpdate(self):
        
        # @info Prevents error that occurred when both comboboxes were cleared
        if self.m_fromStationBox.count() < 1 or self.m_destStationBox.count() < 1:
            return

        fromLn = self.m_fromLineBox.currentIndex()
        destLn = self.m_destLineBox.currentIndex()
        fromIdx = self.m_fromStationBox.currentIndex()
        destIdx = self.m_destStationBox.currentIndex()
        
        if fromLn == destLn and fromIdx == destIdx and not fromIdx == 0:
            print("ERROR: Destination and Origin can't be the same!")
            self.err.showMessage("El punto de partida y el destino no pueden ser la misma estación.")
            self.m_destStationBox.setCurrentIndex(0)
        # END
        
        fromIdx -= 1
        destIdx -= 1
        
        if fromIdx >= 0:
            self.metroimg.setOrigin(fromLn, fromIdx)
        if destIdx >= 0:
            self.metroimg.setDest(destLn, destIdx)
        # END
        self.metroimg.repaint()
    # END

    def onClick(self):
        criterio = self.m_critBox.currentIndex()
        fromIdx = self.m_fromStationBox.currentIndex()
        destIdx = self.m_destStationBox.currentIndex()
        fromLn = self.m_fromLineBox.currentIndex()
        destLn = self.m_destLineBox.currentIndex()
        print("DEBUG: Realizando Busqueda con criterio %d, desde (L%d, S%d) hasta (L%d, S%d)" % (criterio, fromLn, fromIdx, destLn, destIdx))
        if fromIdx == 0 or destIdx == 0:
            print("ERROR: Must select stations!!")
            self.err.showMessage("Debe seleccionar una estación origen y un destino.")
            return

        origen = self.stations[fromLn][fromIdx]
        destino = self.stations[destLn][destIdx]
        self.A = AlgoritmoAestrella(origen, destino, g_Criterios[criterio])
        path, dist, time, trans = self.A.principal()
        
        print("DEBUG: result is ", path, dist, time, trans)
        self.metroimg.resetSelection()
        for i in range(len(path) - 2):
            name = path[i + 1]
            self.metroimg.selectStation(name)
        # END
        self.m_timeLabl.setText("%d mins." % time)
        self.m_distLabl.setText("%s Km" % f'{dist:.3f}')
        self.m_transLabl.setText("%d" % trans)

        self.metroimg.repaint()
    # END
# END

# Main Entry Point
if __name__ == '__main__':
    app = QApplication(sys.argv)
    ex = App()
    sys.exit(app.exec_())