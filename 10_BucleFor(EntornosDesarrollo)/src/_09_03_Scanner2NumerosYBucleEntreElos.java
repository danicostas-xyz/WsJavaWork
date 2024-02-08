import java.util.Scanner;

public class _09_03_Scanner2NumerosYBucleEntreElos {

	public static void main(String[] args) {
		solicitaNumeros();
	}
	
	public static void solicitaNumeros() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Introduce un número: ");
		int numero1 = sc.nextInt();

		System.out.print("Introduce otro número: ");
		int numero2 = sc.nextInt();

		while (numero2 <= numero1) {
			System.out.println("Por favor, introduce un número mayor que " + numero1);
			numero2 = sc.nextInt();
		}
		
		imprimeRango(numero1, numero2);
	}

	public static void imprimeRango(int numero1, int numero2) {
		System.out.println("Los números entre " + numero1 + " y " + numero2 + " son: ");
		for (; numero1 <= numero2; numero1++) {
			System.out.println(numero1);
		}
	}

}
