
public class _05_ConversionCharAEnteros {

	public static void main(String[] args) {
		char caracter = '&';
		char numero = 65535;
		char u0040 = 64;

		// El tipo de dato char tiene 16 bits y está orientado a ser utilizado para
		// codificar caracteres en UTF-8.
		// Con char podemos poner hasta el número 65535 como máximo.
		// También se puede poner entre comillas simples un caracter literal.

		int conversion = (int) numero;
		System.out.println(conversion);

		int conversion2 = (int) u0040;
		System.out.println(conversion2);

		// Como podemos ver aquí, no tiene sentido hacer un casting de un char a int
		// siempre que esté declarado como un número, porque da el mismo resultado.
		// Aunque sería útil si queremos usar más profundidad de bits. Pero los char no
		// están pensados para asignar números literales
		
		int conversion3 = (int) caracter;
		System.out.println("El caracter " + caracter + " está en la posición " + conversion3 + " de la tabla UTF-8.");
		
		// La utilidad real de hacer casting de un tipo char a int es cuando asignamos a
		// la variable un caracter literal entre comillas simples, porque nos dará como
		// resultado el número decimal int correspondiente a su codificación unicode.

	}

}
