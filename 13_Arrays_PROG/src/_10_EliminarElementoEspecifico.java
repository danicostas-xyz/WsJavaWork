import java.util.Scanner;

public class _10_EliminarElementoEspecifico {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("ELIMINAR ELEMENTO");
		System.out.println("-----------------");

		int[] arrayNumerosEnteros = { 5, 2, 3, 7, 9 };

		_00_Funciones.imprimeArray(arrayNumerosEnteros);

		System.out.println(
				"Introduce un número. Si introduces un número presente en el array anterior, se eliminará ese elemento del array");

		int seleccionUsuario = sc.nextInt();

		for (int i = 0; i < arrayNumerosEnteros.length; i++) {
			if (seleccionUsuario == arrayNumerosEnteros[i]) {
				arrayNumerosEnteros[i] = 0;
			}
		}

		System.out.println("");

		System.out.println("Array resultante:");

		_00_Funciones.imprimeArray(arrayNumerosEnteros);

	}

}
