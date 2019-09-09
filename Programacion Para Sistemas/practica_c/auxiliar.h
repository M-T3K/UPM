
/*
** auxiliar.h
*/

#ifndef _AUXILIAR_H_
#define _AUXILIAR_H_

#include <sysexits.h>

#define uint unsigned int

extern const uint BUFFER_SIZE;    
extern char * argv0;

// Usamos esta estructura para almacenar los archivos que recibimos como input
struct input_file
{
    char *name;
    FILE *file;
};

/*
 * Muestra por el estándar error un mensaje de error
 * con el formato adecuado, y termina llamando a exit().
 */
void Error(int exitval, char * fmt, ...);

/*
 * Intenta interpretar como double el texto de tira.
 * Devuelve: conseguido (1) o no (0).
 */
int Toma_Double(double * valor, char * tira);

/*
 * Intenta interpretar como long el texto de tira.
 * Devuelve: conseguido (1) o no (0).
 */
int Toma_Long(long * valor, char * tira);

/*
 *
 * Reverses a String (char *) 
 */
void istrrev(char *str);

#endif /* _AUXILIAR_H_ */


