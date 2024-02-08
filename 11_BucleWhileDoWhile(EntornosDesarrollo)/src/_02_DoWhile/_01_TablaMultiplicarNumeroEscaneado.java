package _02_DoWhile;

import java.util.Scanner;

public class _01_TablaMultiplicarNumeroEscaneado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número para mostrar su tabla de multiplicar: ");
		int numero = sc.nextInt();

		int i = 1;

		do {
			int resultado = numero * i;
			System.out.println(numero + " X " + i + " = " + resultado);
			i++;
		} while (i <= 10);
	}

}
