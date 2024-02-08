import java.util.Scanner;

public class _03_MayorElemento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("NÚMERO MAYOR DE NÚMEROS DE UNA LISTA");
		System.out.println("-----------------------------------");

		int[] arrayNumerosEnteros = _00_Funciones.creaArrayEnteros();

		System.out.println("");

		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros);

		System.out.println("");
		System.out.println("Pulsa enter para mostrar la lista");
		sc.nextLine();
		sc.nextLine();

		int numeroMayor = 0;

		for (int i = 0; i < arrayNumerosEnteros.length; i++) {
			System.out.println("- " + arrayNumerosEnteros[i]);

			if (arrayNumerosEnteros[i] > numeroMayor) {
				numeroMayor = arrayNumerosEnteros[i];
			}
		}

		System.out.println("");
		System.out.println("Pulsa enter para mostrar el número más alto");
		sc.nextLine();

		System.out.println(numeroMayor);

	}

}
