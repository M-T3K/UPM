#!/bin/bash

echo "Poblando Primer Pipeline"
mysql --local-infile=1 -u root bakedb < ppln_one.sql

echo "Poblando Segundo Pipeline"
mysql --local-infile=1 -u root shopsdb < ppln_two.sql