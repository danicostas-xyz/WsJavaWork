import java.util.Scanner;

public class _03_CalculadoraSimpleSwitchCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CALCULADORA");
		System.out.println("-----------");
		System.out.print("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		System.out.println("");
		
		System.out.println("- Pulsa 1 para sumar");
		System.out.println("- Pulsa 2 para restar");
		System.out.println("- Pulsa 3 para multiplicar");
		System.out.println("- Pulsa 4 para dividir");
		System.out.println("- Pulsa 5 para conocer el resto de la división del primer número por el segudo");
		
		int operacion = sc.nextInt();
		
		calculadora(numero1, numero2, operacion);
	}

	public static int suma(int n1, int n2) {
		return n1 + n2;
	}

	public static int resta(int n1, int n2) {
		return n1 - n2;
	}

	public static int division(int n1, int n2) {
		return n1 / n2;
	}

	public static int multiplicacion(int n1, int n2) {
		return n1 * n2;
	}

	public static int modulo(int n1, int n2) {
		return n1 % n2;
	}

	public static void calculadora(int numero1, int numero2, int operacion) {
		int resultado = 0;
		switch (operacion) {
		case 1:
			resultado = suma(numero1, numero2);
			System.out.println(numero1 + " + " + numero2 + " = " + resultado);
			break;
		case 2:
			resultado = resta(numero1, numero2);
			System.out.println(numero1 + " - " + numero2 + " = " + resultado);
			break;
		case 3:
			resultado = multiplicacion(numero1, numero2);
			System.out.println(numero1 + " x " + numero2 + " = " + resultado);
			break;
		case 4:
			resultado = division(numero1, numero2);
			System.out.println(numero1 + " / " + numero2 + " = " + resultado);
			break;
		case 5:
			resultado = modulo(numero1, numero2);
			System.out.println("La división de " + numero1 + " / " + numero2 + " da " + resultado + " como resto.");
			break;
		default:
			System.out.println(
					"No has introducido un valor correcto (entre 1 y 5) para hacer una operación. Vuelve a ejecutar el programa y elige una operación correcta");
			break;
		}
	}
}
