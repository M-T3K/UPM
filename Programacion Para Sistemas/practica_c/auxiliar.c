/*
** auxiliar.c
*/

#include <errno.h>
#include <stdarg.h>
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#include "auxiliar.h"

const uint BUFFER_SIZE = 2049;
char *argv0 = "<argv0>";

void Error(int exitval, char *fmt, ...)
{
    va_list ap;
    char buff[80] = "¿?";
    char *name = buff;
    char *meaning;

    switch (exitval)
    {
    case EX_OK:
        name = "EX_OK";
        meaning = "terminación correcta";
        break;
    case EX_USAGE:
        name = "EX_USAGE";
        meaning = "uso incorrecto del mandato";
        break;
    case EX_DATAERR:
        name = "EX_DATAERR";
        meaning = "datos con formato incorrecto";
        break;
    case EX_NOINPUT:
        name = "EX_NOINPUT";
        meaning = "no se puede abrir la entrada";
        break;
    case EX_NOUSER:
        name = "EX_NOUSER";
        meaning = "usuario desconocido";
        break;
    case EX_NOHOST:
        name = "EX_NOHOST";
        meaning = "nombre de Host desconocido";
        break;
    case EX_UNAVAILABLE:
        name = "EX_UNAVAILABLE";
        meaning = "servicio no disponible";
        break;
    case EX_SOFTWARE:
        name = "EX_SOFTWARE";
        meaning = "error interno del software";
        break;
    case EX_OSERR:
        name = "EX_OSERR";
        meaning = "error en el sistema";
        break;
    case EX_OSFILE:
        name = "EX_OSFILE";
        meaning = "ausencia de fichero crítico del sistema";
        break;
    case EX_CANTCREAT:
        name = "EX_CANTCREAT";
        meaning = "imposible crear fichero de salida de usuario";
        break;
    case EX_IOERR:
        name = "EX_IOERR";
        meaning = "error en entrada/salida";
        break;
    case EX_TEMPFAIL:
        name = "EX_TEMPFAIL";
        meaning = "fallo temporal, reintente";
        break;
    case EX_PROTOCOL:
        name = "EX_PROTOCOL";
        meaning = "error remoto en protocolo";
        break;
    case EX_NOPERM:
        name = "EX_NOPERM";
        meaning = "permiso denegado";
        break;
    case EX_CONFIG:
        name = "EX_CONFIG";
        meaning = "configuración errónea";
        break;
    default:
        sprintf(name, "%d", exitval);
        meaning = "«sin significado establecido»";
    }

    fprintf(stderr, "%s: Error(%s), %s. \"%s\"\n", argv0, name, meaning, strerror(errno));

    fprintf(stderr, "%s+ ", argv0);
    va_start(ap, fmt);
    vfprintf(stderr, fmt, ap);
    va_end(ap);
    fprintf(stderr, "\n");

    exit(exitval);
}
