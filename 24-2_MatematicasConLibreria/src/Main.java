import java.util.Scanner;

import entidad.Matematica;

public class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("  -----------  ");
		System.out.println("| CALCULADORA |");
		System.out.println("  -----------  ");

		printMenu();
		System.out.println("Fin del programa");

	}

	public static void printMenu() {
		int seleccion = 0;
		int resultado = 0;

		do {
			System.out.println("");
			System.out.println("Elige la operación a realizar: ");
			System.out.println("");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir del programa");
			System.out.println("");

			seleccion = Integer.parseInt(sc.nextLine());
			System.out.println("");

			int n1 = 0;
			int n2 = 0;

			if (seleccion != 5) {
				System.out.print("Introduce el primer número: ");
				n1 = Integer.parseInt(sc.nextLine());

				System.out.print("Introduce el segundo número: ");
				n2 = Integer.parseInt(sc.nextLine());

				resultado = calculo(n1, n2, seleccion);

				System.out.println("");
				System.out.println("Resultado = " + resultado);
			}

		} while (seleccion != 5);

	}

	public static int calculo(int n1, int n2, int seleccion) {
		int resultado = 0;

		switch (seleccion) {
		case 1:
			resultado = Matematica.sumar(n1, n2);
			break;
		case 2:
			resultado = Matematica.restar(n1, n2);
			break;
		case 3:
			resultado = Matematica.multiplicar(n1, n2);
			break;
		case 4:
			resultado = Matematica.dividir(n1, n2);
			break;
		}

		return resultado;

	}

}
