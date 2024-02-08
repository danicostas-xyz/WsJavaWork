import java.util.Scanner;

public class _04_InvertirArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("INVERTIR UN ARRAY");
		System.out.println("-----------------------------------");

		int[] arrayNumerosEnteros = _00_Funciones.creaArrayEnteros();

		System.out.println("");

		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros);

		System.out.println("");
		System.out.println("Pulsa enter para mostrar el array invertido");
		sc.nextLine();

		for (int i = arrayNumerosEnteros.length - 1; i >= 0; i--) {
			System.out.println("- " + arrayNumerosEnteros[i]);
		}

	}

}
