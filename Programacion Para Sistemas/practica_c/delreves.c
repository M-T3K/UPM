
#include <stdio.h>
#include <string.h>
#include <sysexits.h>
#include <libgen.h>

#include "auxiliar.h"

// Como viene especificado que el maximo sean 2048, si incluimos '\n' tenemos 2049

void istrrev(char *str) {

    size_t len = strlen(str);
    char *end = str + len - 1;

    if (*end == '\n')
        --end;
    uint i;
    for (i = 0; i < len / 2; ++i)   {

        char tmp = str[i];
        str[i] = *end;
        *end-- = tmp;
    }
}

void print_help()   {

    printf("%s: Uso: delreves [ fichero... ]\n", argv0);
    printf("%s: Invierte el contenido de las lineas de los ficheros (o de la entrada).\n", argv0);
}

void reverse_lines(FILE *file)  {

    char buffer[BUFFER_SIZE]; // Creamos el BUFFER
    while (fgets(buffer, BUFFER_SIZE, file) != NULL)    {

        istrrev(buffer);
        printf("%s", buffer);
    }
}

int main(int argc, char *argv[]) {

    argv0 = basename(argv[0]); // "delreves" o el nombre del programa

    // HANDLE INPUT
    if (argc == 1) {

        reverse_lines(stdin);
    }
    else if ((strcmp(argv[1], "-h") == 0) || strcmp(argv[1], "--help") == 0) {

        print_help();
    }
    else {

        int i;
        for (i = 1; i < argc; ++i)  {

            struct input_file input;
            input.name = argv[i];
            input.file = fopen(input.name, "r");

            if (input.file == NULL) {

                Error(EX_NOINPUT, "El fichero \"%s\" no puede ser leído.", input.name);
            }

            reverse_lines(input.file);

            fclose(input.file);
        }
    }

    return EX_OK;
}