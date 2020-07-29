-- DECLARE @DirKev varchar(1000)
-- SET @DirKev = '/home/kal/Programming/IS1/Practica2/filt_bakeries.csv


DROP SCHEMA IF EXISTS bakedb;
CREATE SCHEMA bakedb;
USE bakedb;

CREATE TABLE panaderias (
    id VARCHAR(255) UNIQUE NOT NULL,
    lon VARCHAR(255),
    lat VARCHAR(255),
    name VARCHAR(255),
    PRIMARY KEY (id)
);

LOAD DATA LOCAL INFILE '/home/tumamaesunapatata/Proyectos/IS1/Practica2/filt_bakeries.csv' 
INTO TABLE panaderias IGNORE 1 LINES (id,lon,lat,name);
