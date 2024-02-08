import java.util.Scanner;

public class _09_UnirArrays {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("UNIFICADOR DE 2 ARRAY");
		System.out.println("---------------------");

		System.out.println("- PRIMER ARRAY: ");
		int[] arrayNumerosEnteros = _00_Funciones.creaArrayEnteros();
		System.out.println("");
		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros);

		System.out.println("- SEGUNDO ARRAY: ");
		int[] arrayNumerosEnteros2 = _00_Funciones.creaArrayEnteros();
		System.out.println("");
		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros2);

		int[] arrayUnificado = new int[arrayNumerosEnteros.length + arrayNumerosEnteros2.length];
		
		for (int i = 0; i < arrayUnificado.length; i++) {
			if (i <= arrayNumerosEnteros.length - 1) {
				arrayUnificado[i] = arrayNumerosEnteros[i];
			} else {
				arrayUnificado[i] = arrayNumerosEnteros2[i - arrayNumerosEnteros.length];
			}
		}
		
		System.out.println("Pulsa enter para mostrar la unificación de los dos array");
		sc.nextLine();
		
		for (int i = 0; i < arrayUnificado.length; i++) {
			System.out.println("- " + arrayUnificado[i]);
		}
		
		

	}

}
