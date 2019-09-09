#include <stdio.h>
#include <string.h>
#include <sysexits.h>
#include <ctype.h>
#include <libgen.h>
#include <stdlib.h>

#include "auxiliar.h"

void print_help() {

    printf("%s: Uso: %s [ hasta [ desde [ paso ]]]\n", argv0, argv0);
    printf("%s: Genera la secuencia de números en el intervalo y paso indicados.\n", argv0);
}

uint parse_max(char *str) {

    char *txt;                       // Parte de texto
    int num = strtol(str, &txt, 10); // Parte Numerica

    if (*txt != '\0' || num < 0)
        num = 100;

    return num;
}

double check_double(char *str, uint *is_valid) {

    char *txt;                      // Parte de texto
    double num = strtod(str, &txt); // Parte Numerica

    if (str == NULL || (*str == '\0') || (*txt != '\0'))
        *is_valid = 0;

    return num;
}

void handle_argument(double *arg, const char *arg_name, uint is_valid, double val) {

    if (!is_valid)
        Error(EX_USAGE, "El parámetro \"%s\" no es un número real válido.", arg_name);

    *arg = val;
}

void secuencia(double from, double dx, double to, uint max) {

    uint c;
    for (c = 1; (from <= to && dx > 0) || (from >= to && dx < 0); ++c, from += dx) {

        if (c > max)
            Error(EX_NOPERM, "Se intentó superar el lı́mite de salida.");

        printf("\t%g\n", from);
    }
}

int main(int argc, char *argv[]) {

    argv0 = basename(argv[0]); // "secuencia" o el nombre del programa

    if (argc > 4) {

        Error(EX_USAGE, "El número de argumentos no es correcto.");
    }
    else if ((argc == 2) && ((strcmp(argv[1], "-h") == 0) || strcmp(argv[1], "--help") == 0)) {

        print_help();
    }
    else {

        uint MAX_OUTPUT = 100;

        // Inicializamos a los valores por defecto
        char *max_env = getenv("MAXOUTPUT");

        if (max_env != NULL && max_env[0] != '\0') {

            MAX_OUTPUT = parse_max(max_env);
        }

        // Inicializamos con los valores por defecto
        double desde = 1.0;
        double paso = 1.0;
        double hasta = 10.0;

        int i;
        for (i = 1; (i < argc) && (argv[i] != NULL); ++i) {

            char *arg = argv[i];
            uint is_valid = 1;
            double value = check_double(arg, &is_valid);

            if (i == 1)
                handle_argument(&hasta, "hasta", is_valid, value);
            if (i == 2)
                handle_argument(&desde, "desde", is_valid, value);
            if (i == 3)
                handle_argument(&paso, "paso", is_valid, value);
            if (paso == 0)
                Error(EX_USAGE, "El parámetro \"paso\" no puede valer 0.");
        }
        if (((hasta < desde) && (paso > 0)) || ((hasta > desde) && (paso < 0)))
            Error(EX_USAGE, "El signo de \"paso\" no permite recorrer el intervalo en el sentido \"desde\" a \"hasta\".");

        secuencia(desde, paso, hasta, MAX_OUTPUT);
    }

    return EX_OK;
}