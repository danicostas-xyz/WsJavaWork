import java.util.Scanner;

public class _06_ParImpar {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número para saber si es par o impar: ");
		int numero = sc.nextInt();
		String parImpar = parImpar(numero);
		System.out.println("El número introducido es " + parImpar);

	}

	public static String parImpar(int n1) {

		String resultado = "";

		if (n1 % 2 == 0) {
			resultado = "Par";
		} else {
			resultado = "Impar";
		}

		return resultado;
	}
}
