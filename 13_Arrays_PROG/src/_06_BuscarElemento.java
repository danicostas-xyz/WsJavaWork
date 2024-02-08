import java.util.Scanner;

public class _06_BuscarElemento {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("BUSCAR ELEMENTO");
		System.out.println("---------------");

		int[] arrayNumerosEnteros = { 1, 4, 5, 10 };

		System.out.print("Introduce un número del 1 al 10 para saber si está en el array: ");

		int seleccionUsuario = sc.nextInt();

		while (seleccionUsuario < 1 || seleccionUsuario > 10) {
			System.out.println("Introduce un número correcto");
			System.out.println("Introduce un número del 1 al 10");
			seleccionUsuario = sc.nextInt();
		}

		boolean respuesta = false;

		for (int i = 0; i < arrayNumerosEnteros.length; i++) {
			if (seleccionUsuario == arrayNumerosEnteros[i]) {
				respuesta = true;
			}
		}

		if (respuesta) {
			System.out.println("El número " + seleccionUsuario + " está dentro del array");
		} else {
			System.out.println("El número " + seleccionUsuario + " no está dentro del array");
		}

	}

}
