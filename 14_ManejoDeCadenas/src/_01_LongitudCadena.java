
public class _01_LongitudCadena {

	public static void main(String[] args) {
		System.out.println("LONGITUD DE CADENA INGRESADA");
		System.out.println("----------------------------");

		String cadena = _00_Funciones.solicitaCadena();

		int longitudCadena = cadena.length();

		System.out.println("La palabra " + cadena + " tiene una longitud de " + longitudCadena + " caracteres.");

	}

}
