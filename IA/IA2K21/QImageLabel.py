# QImageLabel class 
# Objetivo: Tener un QLabel con una imagen que permita dibujado
from PyQt5.QtWidgets import QLabel
from PyQt5.QtGui import QIcon, QPixmap, QPainter
from PyQt5.Qt import *
import math

class QImageLabel(QLabel):
    def __init__(self, parent, imgpath, stations):
        super().__init__(parent)

        pic = QPixmap(imgpath).scaled(900, 900) # Reescalamos la imagen
        
        self.setPixmap(pic)
        self.mousePressEvent = self.onImageMouseEvent

        # Initial Circle Location, set to negative so that it doesn't show
        self.x = -1000
        self.y = -1000
        # Test
        self.parent = parent

        self.origin = None
        self.dest = None

        self.stations = stations
    # END

    def setOrigin(self, ln, n):
        if self.origin != None:
            self.origin.isOrigin = False
        for i in range(len(self.stations)):
            line = self.stations[i]
            for j in range(len(line)):
                st = line[j]
                if i == ln and j == n:
                    st.isOrigin = True
                    self.origin = st
                    return
                # END
            # END
        # END
    # END

    def setDest(self, ln, n):
        if self.dest != None:
            self.dest.isDest = False
        for i in range(len(self.stations)):
            line = self.stations[i]
            for j in range(len(line)):
                st = line[j]
                if i == ln and j == n:
                    st.isDest = True
                    self.dest = st
                    return
                # END
            # END
        # END
    # END
    def resetSelection(self):
        for ln in self.stations:
            for st in ln:
                st.selected = False
            # END
        # END
    # END

    def selectStation(self, stationName):
        for ln in self.stations:
            for st in ln:
                if st.name == stationName:
                    st.selected = True
                # END
            # END
        # END
    # END

    # Paint Event para el dibujado de todo lo que haga falta
    def paintEvent(self, ev):
        super().paintEvent(ev)
        # Dibujamos un circulo
        paint = QPainter()
        paint.begin(self)
        paint.setRenderHint(QPainter.Antialiasing)
        for line in self.stations: 
            for st in line:
                center = QPoint(st.x, st.y)
                # Painting of the Circle
                color = Qt.gray
                innerColor = Qt.white
                if st.isOrigin:
                    color = QColor(0, 148, 252)
                    innerColor = QColor(0, 148, 252)
                elif st.isDest:
                    color = QColor(0, 148, 252)
                    innerColor = QColor(84, 185, 255)
                elif st.selected:
                    color = QColor(84, 185, 255)
                # END
                pen = QPen(color, 5)
                paint.setBrush(innerColor)
                paint.setPen(pen)
                paint.drawEllipse(center, st.rad, st.rad)
            # END
        # END
        paint.end()
    # END

    # onImageMouse event wrapper
    def onImageMouseEvent(self, ev):
        self.x = ev.pos().x()
        self.y = ev.pos().y()

        # DEBUG: Painting a circle on click, printing coords
        print(self.x, self.y)

        for line in self.stations:
            for st in line:
                center = QPoint(st.x, st.y)
                # Painting of the Circle
                d = math.sqrt((self.x - center.x())*(self.x - center.x()) + (self.y - center.y())*(self.y - center.y()))
                if d < st.rad:
                    print("DEBUG: Selected node")
                    if self.origin == None and not st.isDest:
                        self.origin = st
                        st.isOrigin = True
                    elif self.dest == None and not st.isOrigin:
                        self.dest = st
                        print(st.name)
                        st.isDest = True
                    elif self.dest != None:
                        self.dest.isDest = False
                        self.dest = None
                    else:
                        self.origin.isOrigin = False
                        self.origin = None
                    
                    self.resetSelection()
                # END
            # END
        # END
        foundOrigin = False
        foundDest = False
        for i in range(len(self.stations)):
            line = self.stations[i]
            for j in range(len(line)):
                st = line[j]
                if st.isOrigin and not foundOrigin:
                    self.parent.m_fromLineBox.setCurrentIndex(i)
                    self.parent.m_fromStationBox.setCurrentIndex(j + 1)
                    foundOrigin = True
                elif st.isDest and not foundDest:
                    self.parent.m_destLineBox.setCurrentIndex(i)
                    self.parent.m_destStationBox.setCurrentIndex(j + 1)
                    foundDest = True
                # END
            # END
        # END
        if not foundOrigin:
            self.parent.m_fromLineBox.setCurrentIndex(0)
            self.parent.m_fromStationBox.setCurrentIndex(0)
        if not foundDest:
            self.parent.m_destLineBox.setCurrentIndex(0)
            self.parent.m_destStationBox.setCurrentIndex(0)

        # Any of these 2 functions can get the job done
        self.repaint()
        # self.update()

        # @bug @hack
        # Debido a como funciona QT, al ser 2 elementos distintos, las cajas no se actualizan como deberian,
        # y nos vemos obligados a hacer esto 2 veces para forzar a QT a registrar el cambio
        for i in range(len(self.stations)):
            line = self.stations[i]
            for j in range(len(line)):
                st = line[j]
                if st.isOrigin:
                    self.parent.m_fromLineBox.setCurrentIndex(i)
                    self.parent.m_fromStationBox.setCurrentIndex(j + 1)
                elif st.isDest:
                    self.parent.m_destLineBox.setCurrentIndex(i)
                    self.parent.m_destStationBox.setCurrentIndex(j + 1)
                # END
            # END
        # END
        self.repaint()
    # END

# END

def count_selected(stations):
    count = 0
    for i in stations:
        for j in i:
            if j.selected:
                count += 1
            # END
        # END
    # END
    return count
# END