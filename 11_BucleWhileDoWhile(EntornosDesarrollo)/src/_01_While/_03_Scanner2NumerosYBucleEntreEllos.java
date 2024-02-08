package _01_While;
import java.util.Scanner;

public class _03_Scanner2NumerosYBucleEntreEllos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce el primer número: ");
		int numero1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int numero2 = sc.nextInt();
		
		while (numero2 <= numero1 ) {
			System.out.println("Por favor, introduce un número mayor que " + numero1);
			numero2 = sc.nextInt();
		}
		
		System.out.println("Los números entre " + numero1 + " y " + numero2 + " son: ");
		while (numero1 <= numero2) {
			System.out.println(numero1);
			numero1++;
		}

	}

}
