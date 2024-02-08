package _02_DoWhile;

import java.util.Scanner;

public class _03_FactorialNumeroEscaneado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número para conocer su factorial: ");
		int numero = sc.nextInt();

		int resultado = factorial(numero);
		System.out.println("Factorial de " + numero + " = " + resultado);

	}

	public static int factorial(int numero) {

		int resultado = 1;

		do {
			resultado *= numero;
			numero--;
		} while (numero >= 1);

		return resultado;
	}

}
