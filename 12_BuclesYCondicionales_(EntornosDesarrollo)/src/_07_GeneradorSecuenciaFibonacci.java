import java.util.Scanner;

public class _07_GeneradorSecuenciaFibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("GENERADOR DE SECUENCIA FIBONACCI");
		System.out.println("--------------------------------");
		System.out.println("Introduce un número para generar la secuencia Fibonacci de los N primeros números: ");

		int numero = sc.nextInt();
		int valor1 = 0;
		int valor2 = 1;
		int suma;

		for (int i = 0; i < numero; i++) {
			suma = valor1 + valor2;
			System.out.println(valor1 + "");
			valor1 = valor2;
			valor2 = suma;
		}
	}

}
