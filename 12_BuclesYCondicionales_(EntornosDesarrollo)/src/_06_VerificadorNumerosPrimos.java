import java.util.Scanner;

public class _06_VerificadorNumerosPrimos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("VERIFICADOR DE NÚMEROS PRIMOS");
		System.out.println("-----------------------------");
		System.out.println("");

		System.out.println("- Introduce un número entero positivo para saber si es primo");
		System.out.println("- Para finalizar el programa, introduce un número negativo");
		System.out.println("");

		System.out.print("Introduce un número: ");

		int numeroEscaneado = sc.nextInt();
		int acumulador = 0;

		while (numeroEscaneado > 0) {

			for (int i = 1; i <= numeroEscaneado; i++) {
				if (numeroEscaneado % i == 0) {
					acumulador++;
				}
			}

			if (acumulador == 2) {
				System.out.println("El número " + numeroEscaneado + " es un número primo.");
			} else if (acumulador == 1) {
				System.out.println("El número 1 no es primo porque solo tiene un divisor.");
			} else {
				System.out.println("El número " + numeroEscaneado + " no es un número primo.");
			}

			acumulador = 0;

			System.out.println("");
			System.out.print("Introduce otro número: ");
			numeroEscaneado = sc.nextInt();
		}

		System.out.println("Fin del programa");

	}

}
