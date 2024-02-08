import java.util.Scanner;

public class _09_05_TablaMultiplicar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();
		tablaMultiplicar(numero);
	}
	
	public static void tablaMultiplicar(int numero) {
		for (int i = 1; i <= 10; i++) {
			int multiplicacion = numero * i;
			System.out.println(numero + " X " + i + " = " + multiplicacion);
		}
	}
}
