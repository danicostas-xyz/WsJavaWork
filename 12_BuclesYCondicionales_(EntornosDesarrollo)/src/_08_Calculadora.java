import java.util.Scanner;

public class _08_Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("CALCULADORA");
		System.out.println("-----------");
		System.out.println("");

		int seleccionUsuario = 0;

		do {
			menuCalculadora();

			seleccionUsuario = sc.nextInt();

			while (seleccionUsuario < 1 || seleccionUsuario > 5) {
				System.out.println("Número introducido incorrecto.");
				menuCalculadora();
				seleccionUsuario = sc.nextInt();
			}

			int numero1 = 0;
			int numero2 = 0;
			int resultado = 0;
			switch (seleccionUsuario) {
			case 1:
				System.out.println("Has seleccionado suma.");
				System.out.print("Introduce el primer número: ");
				numero1 = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				numero2 = sc.nextInt();
				resultado = suma(numero1, numero2);
				break;
			case 2:
				System.out.println("Has seleccionado resta.");
				System.out.print("Introduce el primer número: ");
				numero1 = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				numero2 = sc.nextInt();
				resultado = resta(numero1, numero2);
				break;
			case 3:
				System.out.println("Has seleccionado multiplicacion.");
				System.out.print("Introduce el primer número: ");
				numero1 = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				numero2 = sc.nextInt();
				resultado = multiplicacion(numero1, numero2);
				break;
			case 4:
				System.out.println("Has seleccionado division.");
				System.out.print("Introduce el primer número: ");
				numero1 = sc.nextInt();
				System.out.print("Introduce el segundo número: ");
				numero2 = sc.nextInt();
				resultado = division(numero1, numero2);
				break;
			}

			if (seleccionUsuario != 5) {
				System.out.println("Pulsa enter para conocer el resultado");
				sc.nextLine();
				sc.nextLine();
				System.out.println("Resultado: " + resultado);
				System.out.println("");

				System.out.println("Pulsa enter para continuar");
				sc.nextLine();
				System.out.println("");
			}

		} while (seleccionUsuario != 5);

		System.out.println("Fin del programa");

		sc.close();
	}

	public static void menuCalculadora() {

		System.out.println("- Para sumar, introduce 1");
		System.out.println("- Para restar, introduce 2");
		System.out.println("- Para multiplicar, introduce 3");
		System.out.println("- Para dividir, introduce 4");
		System.out.println("- Para salir del programa, introduce 5");
	}

	public static int suma(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}

	public static double suma(double n1, double n2) {
		double resultado = n1 + n2;
		return resultado;
	}

	public static int resta(int n1, int n2) {
		int resultado = n1 - n2;
		return resultado;
	}

	public static double resta(double n1, double n2) {
		double resultado = n1 - n2;
		return resultado;
	}

	public static int multiplicacion(int n1, int n2) {
		int resultado = n1 * n2;
		return resultado;
	}

	public static double multiplicacion(double n1, double n2) {
		double resultado = n1 * n2;
		return resultado;
	}

	public static int division(int n1, int n2) {
		int resultado = n1 / n2;
		return resultado;
	}

	public static double division(double n1, double n2) {
		double resultado = n1 / n2;
		return resultado;
	}

}
