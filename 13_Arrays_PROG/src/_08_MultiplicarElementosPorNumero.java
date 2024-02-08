
public class _08_MultiplicarElementosPorNumero {

	public static void main(String[] args) {
		System.out.println("MULTIPLICADOR DE NÚMEROS DE LISTA");
		System.out.println("---------------------------------");

		int[] arrayNumerosEnteros = _00_Funciones.creaArrayEnteros();
		System.out.println("");
		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros);

		int acumulador = 1;

		for (int i = 0; i < arrayNumerosEnteros.length; i++) {
			acumulador *= arrayNumerosEnteros[i];
		}

		System.out.println("Multiplicación de todos los números introducidos = " + acumulador);

	}

}
