package _02_DoWhile;

import java.util.Scanner;

public class _05_CalculoPotenciaNumero {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("CÁLCULO DE LA POTENCIA DE UN NÚMERO");

		System.out.print("Introduce la base: ");
		int base = sc.nextInt();
		System.out.print("Introduce el exponente: ");
		int exponente = sc.nextInt();

		int resultado = potencia(base, exponente);

		System.out.println(base + "^" + exponente + " = " + resultado);

	}

	public static int potencia(int base, int exponente) {
		int i = 1;
		int resultado = base;

		do {
			resultado *= base;
			i++;

		} while (i < exponente);

		return resultado;
	}

}
