#!/bin/bash

# Códigos de error
# No tiene

# Recupera los parámetros
domain=$(head -1 $1)

# Comprueba si 'nis' está instalado, y si no, lo instala
is_installed=$(dpkg -l | grep -w nis)
if [ "$?" -ne 0 ]; then
    export DEBIAN_FRONTEND="noninteractive"
    apt-get -qq -y install nis > /dev/null
fi

# https://www.linuxquestions.org/questions/debian-26/debian-nis-not-respecting-etc-defaultdomain-662580/
# @info tenemos que hacer esto porque sino NIS no guarda el domainname
mkdir ~/cctmp/ 2&>/dev/null
touch ~/cctmp/defaultdomain
echo $domain > ~/cctmp/defaultdomain
sudo mv ~/cctmp/defaultdomain /etc/defaultdomain


# https://ilearnedhowto.wordpress.com/2017/05/15/how-to-install-a-cluster-with-nis-and-nfs-in-ubuntu-16-04/


# Modifica el fichero /etc/default/nis en sus líneas NISSERVER(XXXX->master), NISCLIENT(XXXX->false)
sudo sed -i 's/NISSERVER=.*$/NISSERVER=master/' /etc/default/nis
sudo sed -i 's/NISCLIENT=.*$/NISCLIENT=false/' /etc/default/nis

# @info
# Realmente a ser una practica, el fichero ypserv.securenets se deja por defecto, 
# lo cual permite acceso a cualquiera (lo cual es malo pero nos da igual para estos propositos)
# Si se quiere cambiar, con ajustar estas dos lineas nos lo deberiamos ahorrar
# Queremos configurarlo de tal forma que solo las ip del cluster puedan entrar

# sudo sed -i 's/^\(0.0.0.0[\t ].*\)$/#\1/' /etc/ypserv.securenets
# sudo echo "255.255.255.0 10.0.0.0" >> /etc/ypserv.securenets

serv_ip=$(hostname -I) # Obtenemos la IP del servidor
serv_name=$(hostname) # Obtenemos el nombre de la maquina servidor

# Se añade la información del servidor al fichero /etc/hosts
cp /etc/hosts ~/cctmp/hosts.bk
sudo echo "${serv_ip} ${serv_name}" >> ~/cctmp/hosts.bk
sudo mv ~/cctmp/hosts.bk /etc/hosts

# Elimina el directorio temporal
sudo rm -r ~/cctmp

# Inicia el servicio ypinit y reinicia NIS para que se efectúen los cambios
echo "$serv_name" | sudo /usr/lib/yp/ypinit -m #> /dev/null # Ejecutamos en Modo Master
sudo service rpcbind restart # Reiniciamos el Proceso de Binding
sudo service nis restart    # Ejecutamos NIS
