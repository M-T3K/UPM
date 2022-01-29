import networkx as nx
from math import sin, cos, sqrt, atan2, radians 
import json

def parse(data):
    with open (data, 'r') as f:
        dataDict = json.load(f)
        f.close()
    return dataDict
# END
class AlgoritmoAestrella():
    def __init__(self, origen, destino, criterio):
        super().__init__()
        self.G = nx.Graph()

        self.criterio = criterio
        
        estaciones = parse('coord.json')

        self.nodos = []
        for n in estaciones:
            self.nodos.append(n['Name'])

        arist = parse('aristas.json')
        self.aristas = []
        for n in arist:
            self.aristas.append((n['Origen'],n['Destino'],n['Peso'][criterio])) # En 'Distancia' iria el criterio

        self.origen = origen #nodo origen
        self.destino = destino #nodo destino
        self.criterio = criterio
        self.listaAbierta = []
        self.listaCerrada = []
        self.actual = None
        self.pila = []

    def principal(self):
        self.G.add_nodes_from(self.nodos)
        self.G.add_weighted_edges_from(self.aristas)
        self.G.nodes[self.origen]['F'] = 0
        self.G.nodes[self.origen]['G'] = 0

        # Latitud y longitud
        coords = parse('coord.json')
        for n in coords:
            self.G.nodes[n['Name']]['Coord'] = [n['Lat'],n['Lon']]
            print(n['Name'], self.G.nodes[n['Name']]['Coord'])
        return self.algoritmo()


    def verticeMenorF(self): #hecho
        resultado = self.listaAbierta[0] #resultado a devolver, inicializo a primer vertice
        if len(self.listaAbierta) > 1:
            for i in self.listaAbierta:
                if self.G.nodes[i]['F'] < self.G.nodes[resultado]['F']:
                    resultado = i
        self.listaAbierta.remove(resultado)
        return resultado

    def setEcuacion(self,padre,hijo): #hecho
        #caculculo de la H
        distanciaH = self.getDistanciaH(hijo)
        #calculo de la G
        distanciaG =  self.G[padre][hijo]['weight']
        #asignar valores
        self.G.nodes[hijo]['G'] = self.G.nodes[padre]['G'] + distanciaG
        self.G.nodes[hijo]['H'] = self.G.nodes[padre]['G'] + distanciaH
        self.G.nodes[hijo]['F'] = self.G.nodes[hijo]['G'] + self.G.nodes[hijo]['H']

    def getDistanciaH(self,hijo): #TODO esto hay que modificarlo con el json
        R = 6371.0 #radio de la tierra
        coordDestino = self.G.nodes[self.destino]['Coord']
        # print("[%s]" % hijo)
        # for n in self.G.nodes:
        #     if hijo == n:
        #         print("%s <> %s" % (n, self.G.nodes[hijo]))
        # print("%s -> (%f, %f)" % (n['Name'], n['Name']['Coord'][0], n['Name']['Coord'][1]))
        print("getDistanciaH() -> float")
        print(hijo, self.G.nodes[hijo])
        coordHijo = self.G.nodes[hijo]['Coord']
        latDest = radians(coordDestino[0]) 
        lonDest = radians(coordDestino[1]) 
        latHijo = radians(coordHijo[0]) 
        lonHijo = radians(coordHijo[1]) 

        dlon = lonHijo - lonDest
        dlat = latHijo - latDest

        a = sin(dlat/2)**2 + cos(latDest) * cos(latHijo) * sin(dlon/2)**2 
        c = 2 * atan2(sqrt(a), sqrt(1 - a)) 

        distance = R * c 
        return distance

    def recursivo(self,node1,node2):
        self.pila.append(node1)
        if node1 != node2:
            self.recursivo(self.G.nodes[node1]['Padre'],node2)


    #repetir

    def algoritmo(self):
        
        #empezamos
        self.listaAbierta.append(self.origen)

        while(len(self.listaAbierta)>0):
            self.actual = self.verticeMenorF()
            self.listaCerrada.append(self.actual)
            if self.actual == self.destino:
                self.listaAbierta.clear()
            else:
                listaAdyacentes = list(self.G[self.actual])
                for adyacente in listaAdyacentes:
                    if self.listaAbierta.count(adyacente) == 0 and self.listaCerrada.count(adyacente) == 0:
                        #establecimiento de costes F,G y H
                        self.setEcuacion(self.actual,adyacente)
                        #adyacente apunta a su padre
                        self.G.nodes[adyacente]['Padre'] = self.actual
                        #añado adyacente a listaAbierta
                        self.listaAbierta.append(adyacente)
                    elif self.listaAbierta.count(adyacente)>0:
                        if self.G.nodes[adyacente]['G'] < self.G.nodes[self.actual]['G']:
                            #print(self.G.nodes[adyacente]['G'], self.G.nodes[self.actual]['G'])
                            #establezco costes F, G y H*
                            self.setEcuacion(self.actual,adyacente)
                            #hago que se apunte
                            self.G.nodes[adyacente]['Padre'] = self.actual
                

        self.recursivo(self.actual,self.origen)
        self.pila.reverse()

        cont = 0
        anterior = None
        posterior = None
        arist = parse('aristas.json')
        dist = 0
        time = 0
        trans = 0
        
        for i in self.pila:
            cont = cont + 1
            if cont != 1:
                posterior = i
                for n in arist:
                    if (n['Origen'] == anterior and n['Destino'] == posterior) or (n['Origen'] == posterior and n['Destino'] == anterior):
                        dist += n['Peso']['Distancia']
                        time += n['Peso']['Tiempo']
                        trans += n['Peso']['Transbordo']
                anterior = posterior

            else:
                anterior = i

        return self.pila, dist, time, trans
