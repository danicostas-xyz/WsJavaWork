
public class _08_Palindromo {

	public static void main(String[] args) {
		System.out.println("PALÍNDROMO");
		System.out.println("----------");

		String cadena = _00_Funciones.solicitaCadena();
		StringBuilder cadenaBuilder = new StringBuilder();

		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaBuilder.append(cadena.charAt(i));
		}

		String cadenaInvertida = cadenaBuilder.toString();

		if (cadena.equals(cadenaInvertida)) {
			System.out.println("La palabra " + cadena + " es palíndroma");
		} else {
			System.out.println("La palabra " + cadena + " no es palíndroma");
		}

	}

}
