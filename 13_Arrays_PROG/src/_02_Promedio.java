import java.util.Scanner;

public class _02_Promedio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("PROMEDIO DE NÚMEROS REALES DE LISTA");
		System.out.println("-----------------------------------");
		
		double[] arrayNumerosReales = _00_Funciones.creaArrayReales();

		_00_Funciones.solicitaDatosArray(arrayNumerosReales);

		System.out.println("");
		System.out.println("Pulsa enter para mostrar la lista");
		sc.nextLine();
		sc.nextLine();

		double suma = 0;

		for (int i = 0; i < arrayNumerosReales.length; i++) {
			System.out.println("- " + arrayNumerosReales[i]);
			suma += arrayNumerosReales[i];
		}

		double promedio = suma / arrayNumerosReales.length;

		System.out.println("");
		System.out.println("Pulsa enter para conocer la media aritmética de los números de la lista");
		sc.nextLine();
		System.out.println(promedio);

	}

}
