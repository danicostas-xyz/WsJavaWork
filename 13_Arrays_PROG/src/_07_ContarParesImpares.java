
public class _07_ContarParesImpares {

	public static void main(String[] args) {
		System.out.println("CONTAR PARES E IMPARES");
		System.out.println("-----------------------------------");

		int[] arrayNumerosEnteros = _00_Funciones.creaArrayEnteros();
		System.out.println("");
		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros);

		int acumuladorPares = 0;
		int acumuladorImpares = 0;

		for (int i = 0; i < arrayNumerosEnteros.length; i++) {
			if (arrayNumerosEnteros[i] % 2 == 0) {
				acumuladorPares++;
			} else {
				acumuladorImpares++;
			}
		}

		System.out.println("");

		System.out.println("- Número de pares: " + acumuladorPares);
		System.out.println("- Número de impares: " + acumuladorImpares);
	}

}
