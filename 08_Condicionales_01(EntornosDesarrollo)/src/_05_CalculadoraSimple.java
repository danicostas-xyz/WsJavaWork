import java.util.Scanner;

public class _05_CalculadoraSimple {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("CALCULADORA");
		System.out.println("------------------------------------------------");
		System.out.print("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		System.out.println("");
		System.out.println("¿Qué operación deseas realizar?");
		System.out.println("------------------------------------------------");
		System.out.println("- Para sumar, pulse 1");
		System.out.println("- Para restar, pulse 2");
		System.out.println("- Para multiplicar, pulse 3");
		System.out.println("- Para dividir, pulse 4");
		System.out.println("- Para conocer el resto de una división, pulse 5");
		System.out.println("------------------------------------------------");
		int operacion = sc.nextInt();
		calculo(numero1, numero2, operacion);
	}

	public static void calculo(int numero1, int numero2, int operacion) {

		int resultado = 0;
		if (operacion == 1) {
			resultado = suma(numero1, numero2);
			System.out.println("Has seleccionado suma (1). " + numero1 + " + " + numero2 + " = " + resultado);
		} else if (operacion == 2) {
			resultado = resta(numero1, numero2);
			System.out.println("Has seleccionado resta (2). " + numero1 + " - " + numero2 + " = " + resultado);
		} else if (operacion == 3) {
			resultado = multiplicacion(numero1, numero2);
			System.out.println("Has seleccionado multiplicación (3). " + numero1 + " x " + numero2 + " = " + resultado);
		} else if (operacion == 4) {
			resultado = division(numero1, numero2);
			System.out.println("Has seleccionado división (4). " + numero1 + " / " + numero2 + " = " + resultado);
		} else if (operacion == 5) {
			resultado = modulo(numero1, numero2);
			System.out.println("Has seleccionado módulo (5). La división de " + numero1 + " / " + numero2
					+ " arroja un resto de: " + resultado);
		}

	}

	public static int suma(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}

	public static int resta(int n1, int n2) {
		int resultado = n1 - n2;
		return resultado;
	}

	public static int multiplicacion(int n1, int n2) {
		int resultado = n1 * n2;
		return resultado;
	}

	public static int division(int n1, int n2) {
		int resultado = n1 / n2;
		return resultado;
	}

	public static int modulo(int n1, int n2) {
		int resultado = n1 % n2;
		return resultado;
	}

}
