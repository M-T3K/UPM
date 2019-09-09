
#include <stdio.h>
#include <string.h>
#include <libgen.h>
#include <stdlib.h>

#include "auxiliar.h"

void print_help() {

    printf("%s: Uso: bocabajo [ fichero... ]\n", argv0);
    printf("%s: Invierte el orden de las lineas de los ficheros (o de la entrada).\n", argv0);
}

char **store(char **contents, int *lines, FILE *file) {

    char buffer[BUFFER_SIZE];
    while (fgets(buffer, sizeof(buffer), file) != NULL) {

        // Para cada linea debemos asignar un espacio de memoria que sea minimo
        // igual al numero de lineas (*idx + 1) + 1
        contents = (char **)realloc(contents, sizeof(char *) * (*lines + 2));
        if (contents == NULL)
            Error(EX_OSERR, "No se pudo ubicar la memoria dinámica necesaria.");

        contents[(*lines)++] = strdup(buffer);
    }
    return contents;
}

void reverse_contents(char **contents, int *lines) {

    char buffer[BUFFER_SIZE];
    int i;
    for (i = *lines - 1; i >= 0; --i) {

        strcpy(buffer, contents[i]);
        if (buffer[strlen(buffer) - 1] != '\n')
            strcat(buffer, "\n");

        printf("%s", buffer);
    }
}

int main(int argc, char *argv[]) {

    argv0 = basename(argv[0]);
    char **contents = (char **)malloc(sizeof(char *));
    int lines = 0; // Number of lines read

    if (argc == 1) {

        contents = store(contents, &lines, stdin);
    }
    else if (strcmp(argv[1], "-h") == 0 || strcmp(argv[1], "--help") == 0) {

        print_help();
    }
    else {

        int i;
        for (i = 1; i < argc; ++i) {

            struct input_file input;
            input.name = argv[i];
            input.file = fopen(input.name, "r");

            if (input.file == NULL)
                Error(EX_NOINPUT, "El fichero \"%s\" no puede ser leído.", input.name);

            contents = store(contents, &lines, input.file);
            fclose(input.file);
        }
    }

    reverse_contents(contents, &lines);
    free(contents);

    return EX_OK;
}
