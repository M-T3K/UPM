package aed.recursiveUtils;

import es.upm.aedlib.Position;
import es.upm.aedlib.positionlist.PositionList;
import es.upm.aedlib.positionlist.NodePositionList;

// @TODO : Comentar en formato JavaDOc
public class Recursion {
	
	// Metodos Auxiliares
	
	/**
	 * @param ch : 'char' a comprobar.
	 * @return 'true' si ch pertenece a {'(', '[', '{'}. 'false' en otro caso.
	 */
	private static boolean opens(char ch) {

		if(ch == '(' || ch == '[' || ch == '{') {
	
			return true;
		}
	
		return false;
	}
	// -------------------------------------------------------------	
	
	/**
	 * @param ch : 'char' a comprobar.
	 * @return 'true' si ch pertenece a {')', ']', '}'}. 'false' en otro caso.
	 */
	private static boolean closes(char ch) {
	
		if(ch == ')' || ch == ']' || ch == '}') {
	
			return true;
		}
	
		return false;
	}
	// -------------------------------------------------------------	
	
	/**
	 * @param ch1 : Primer 'char' a comprobar.
	 * @param ch2 : Segundo 'char' a comprobar..
	 * @return 'true' si ch1 y ch2 son un par que hace match.
	 */
	private static boolean matches(char ch1, char ch2) {

		if(((ch1 == '(' && ch2 == ')') || (ch2 == '(' && ch1 == ')'))
			|| ((ch1 == '[' && ch2 == ']') || (ch2 == '[' && ch1 == ']'))
			|| ((ch1 == '{' && ch2 == '}') || (ch2 == '{' && ch1 == '}'))) {

			return true;			
		}

		return false;
	}
	// -------------------------------------------------------------	

	/**
	 * PRE: val pertenece a [0, 2]
	 * @param val : Valor del tipo 'int' en base 3 del cual queremos obtener un char correspondiente.
	 * @return si val = 0 => '(', val = 1 => '[', val = 1 => '{'.
	 */
	private static char getCharFromValue(int val) {

		if(val == 0) {

			return '(';
		}
		else if(val == 1) {

			return '[';
		}
		else {
			return '{';
		}

	} 
	// -------------------------------------------------------------

	/**
	 * PRE: ch pertenece a {'(', '[', '}'}
	 * @param ch : Un 'char' del cual queremos obtener un valor en base 3.
	 * @return si ch = '(' => 0, ch = '[', ch = '{'
	 */
	private static int getValueFromChar(char ch) {

		return "([{".indexOf(ch);
	}
	// -------------------------------------------------------------

	/**
	 * @param alphabet : 'PositionList de Character' que representa el alfabeto que estamos usando.
	 * @param encodedText : 'PositionList de Integer' que representa cada una de las transformaciones a realizar.
	 * @param decodedText : 'PositionList de Character' en la que almacenaremos nuestro resultado.
	 * @param currentEnc  : 'Position de Integer' que representa por que elemento de 'encodedText' vamos.
	 * @param currentAlph : 'Position de Character' que representa por que elemento de 'alphabet' vamos.
	 * @return No devuelve nada (es void), ya que aprovechamos que Java pasa los objetos como copias, pero no los elementos de
	 * 			dentro del objeto.
	 */
	private static void decryptRec(PositionList<Character> alphabet, 
									PositionList<Integer> encodedText,
									PositionList<Character> decodedText,
									Position<Integer> currentEnc, 
									Position<Character> currentAlph) {

		currentEnc = encodedText.next(currentEnc);
		if(currentEnc == null || currentEnc.element() == null) {

			return;
		}
		currentAlph = getPosition(alphabet, currentAlph, currentEnc.element());

		decodedText.addLast(currentAlph.element());
		decryptRec(alphabet, encodedText, decodedText, currentEnc, currentAlph);

	}
	// -------------------------------------------------------------
	
	/**
	 * @param str : Expresion original del tipo 'String' que debemos comprobar.
	 * @param elems : Un 'int' que almacena en base 3 el anterior elemento.
	 * @param idx : Un 'int' que determina el indice por el que vamos de la expresion.
	 * @return 'true' si la expresion esta correctamente balanceada. 'false' si no lo esta.
	 */
	private static boolean isBalancedRec(String str, int elems, int idx) {

		// Si nos hemos pasado de la longitud del String, hemos acabado el proceso
		// comprobamos si hay un elemento guardado en elems. 
		// si no lo hay, elems = 1 (dado que empieza en 1)
		// el minimo que puede tener en caso de que haya 1 elemento es 4
		// ya que estamos en base 3
		if(idx >= str.length()) {

			return elems == 1;
		}
		
		char ch = str.charAt(idx);
		if(opens(ch)) {

			// si ch es un brace abierto, lo guardamos en elems en base 3
			elems = elems * 3 + getValueFromChar(ch);
			// y pasamos al siguiente elemento
			return isBalancedRec(str, elems, ++idx);
		}
		else if(closes(ch)) {

			// Si elems no tiene elemento y ch es un brace cerrado
			// es un brace que no tiene un match posible, por lo que
			// no esta balanceada la expresion
			if(elems == 1) {

				return false;
			}

			// Convertimos el ultimo elemento de base 3 a la nuestra
			// y comprobamos si tiene match con el actual
			// si hay match, hacemos que elems represente al anterior brace
			// que necesitaba match, y pasamos al siguiente elemento de la expresion
			// Si no hay match eso significa que la expresion no esta balanceada
			int prevElem = elems % 3;
			if(matches(getCharFromValue(prevElem), ch)) {

				elems = elems / 3;
				return isBalancedRec(str, elems, ++idx);
			}
			
			return false;
		}

		// En caso de que se trate de un caracter que no sea un brace, lo ignoramos
		return isBalancedRec(str, elems, ++idx);
	}
	// -------------------------------------------------------------		

	// Metodos Del Laboratorio

	/**
	 * @param l : PositionList de 'E'.
	 * @param pos : Position de 'E' a partir de la cual queremos obtener una nueva position.
	 * @param n : 'int' n que especifica la transformacion.
	 * @return Position de 'E'
	 */
	public static <E> Position<E> getPosition(PositionList<E> l, Position<E> pos, int n) {
	  
		if(n == 0) {
			
			return pos;
		}
		
		if(n < 0) {
			
			return getPosition(l, l.prev(pos), ++n);
		}
		
		return getPosition(l, l.next(pos), --n);
	}
	// -------------------------------------------------------------	

	/**
	 * @param alphabet : PositionList de 'Character' que represeta nuestro alfabeto.
	 * @param encodedText : PositionList de 'Integer' que especifica las transformaciones requeridas en cada Position.
	 * @return Un PositionList de Character decodificada basado en aplicar las transformaciones especificadas por encodedText en el alfabeto.
	 */
 	public static PositionList<Character> decrypt(PositionList<Character> alphabet, 
		  										PositionList<Integer> encodedText) {

		PositionList<Character> decodedText = new NodePositionList<Character>();
		
		Position<Integer> currentEnc  = encodedText.first();
		Position<Character> currentAlphabet = getPosition(alphabet, alphabet.first(), currentEnc.element());
		
		decodedText.addFirst(currentAlphabet.element());
		decryptRec(alphabet, encodedText, decodedText, currentEnc, currentAlphabet);
		  
		return decodedText;
  	}
	// -------------------------------------------------------------
  
 	/**
 	 * @param s : Expresion que debemos comprobar si esta Balanceada o no.
 	 * @return 'true' si lo esta y 'false' si no.
 	 */
	public static boolean isBalanced(String s) {
		
		// Para que la aritmetica modular funcion, elems debe estar inicializado a 
		// un minimo de 1
		return isBalancedRec(s, 1, 0);
	}
	// -------------------------------------------------------------

}
