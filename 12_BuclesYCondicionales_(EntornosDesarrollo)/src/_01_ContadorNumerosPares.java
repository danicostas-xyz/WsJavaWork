import java.util.Scanner;

public class _01_ContadorNumerosPares {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CONTADOR DE NÚMEROS PARES ENTRE UN RANGO DE NÚMEROS");
		System.out.println("---------------------------------------------------");

		System.out.print("Introduce el primer número: ");
		int numero1 = sc.nextInt();

		System.out.print("Introduce el segundo número: ");
		int numero2 = sc.nextInt();

		while (numero2 <= numero1) {
			System.out.println("Por favor, introduce un número mayor que " + numero1);
			numero2 = sc.nextInt();
		}

		System.out.println("");
		System.out.println("Los números pares entre " + numero1 + " y " + numero2 + " son: ");
		System.out.println();

		mostrarResultados(numero1, numero2);

		int contador = contadorPares(numero1, numero2);

		System.out.println("");
		System.out.println("Pulsa enter para conocer cuántos números pares hay entre " + numero1 + " y " + numero2);
		sc.nextLine();
		sc.nextLine();
		System.out.println("Hay " + contador + " números pares entre " + numero1 + " y " + numero2);

	}

	public static int contadorPares(int numero1, int numero2) {
		int contador = 0;

		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 == 0) {
				contador++;
			}
		}

		return contador;
	}

	public static void mostrarResultados(int numero1, int numero2) {
		int contador = 0;

		for (int i = numero1; i <= numero2; i++) {
			if (i % 2 == 0) {
				System.out.println("- " + i);
			}
		}

	}

}
