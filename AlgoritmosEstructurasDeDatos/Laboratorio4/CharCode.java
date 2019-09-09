package aed.huffman;

/**
 * Defines a mapping between a character and a (string) code.
 */
public class CharCode {
	
	private Character ch;
	private String code;

	/**
	 * Provides a mapping between a character and a (string) code.
	 */
	public CharCode(int ch, String code) {
		this.ch = (char)ch;
		this.code = code;
	}

	/**
	 * Returns the character in a character-code pair.
	 */
	public Character getCh() {
		return ch;
	}

	/**
	 * Returns the code in a character-code pair.
	 */
	public String getCode() {
		return code;
	}

	public String toString() {
		return ch+"=>\""+code+"\"";
	}
}
