-- DECLARE @DirKev varchar(1000)
-- SET @DirKev = '/home/kal/Programming/IS1/Practica2/filt_bakeries.csv


DROP SCHEMA IF EXISTS shopsdb;
CREATE SCHEMA shopsdb;
USE shopsdb;

CREATE TABLE tiendas (
    id VARCHAR(255) UNIQUE NOT NULL,
    lon VARCHAR(255),
    lat VARCHAR(255),
    name VARCHAR(255),
    website VARCHAR(255),
    PRIMARY KEY (id)
);

LOAD DATA LOCAL INFILE '/home/eresfe@/Proyectos/IS1/Practica2/filt_shops.csv' 
INTO TABLE tiendas IGNORE 1 LINES (id,lon,lat,name,website);
