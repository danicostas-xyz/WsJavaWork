
public class _06_EnterosAChar {

	public static void main(String[] args) {
		int numero = 9773;
		int numero2 = 165535;
		int numero3 = 65;

		char caracter = (char) numero;
		System.out.println(caracter);

		char caracter2 = (char) numero2;
		System.out.println(caracter2);

		char caracter3 = (char) numero3;
		System.out.println(caracter3);

		// A la inversa que cuando haces casting a un caracter para obtener la posición
		// decimal en la tabla UTF-8, aquí hacemos casting a un número int para obtener
		// un caracter UTF-8.

		// En el caso de números int mayores que 65535, tendremos char overflow y el
		// caracter utf-8 será el que esté en la posición del número que que de la
		// operación entre (numeroGrande / 65536)

	}

}
