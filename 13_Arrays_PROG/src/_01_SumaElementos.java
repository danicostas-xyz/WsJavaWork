import java.util.Scanner;

public class _01_SumaElementos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("LISTA DE NÚMEROS ENTEROS");
		System.out.println("------------------------");

		int[] arrayNumerosEnteros = _00_Funciones.creaArrayEnteros();

		System.out.println("");

		_00_Funciones.solicitaDatosArray(arrayNumerosEnteros);

		System.out.println("");
		System.out.println("Pulsa enter para mostrar la lista");
		sc.nextLine();

		int suma = 0;

		for (int i = 0; i < arrayNumerosEnteros.length; i++) {
			System.out.println("- " + arrayNumerosEnteros[i]);
			suma += arrayNumerosEnteros[i];
		}

		System.out.println("");
		System.out.println("Pulsa enter para conocer la suma de los elementos");
		sc.nextLine();

		System.out.println(suma);

	}

}
