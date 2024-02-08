import java.util.Scanner;

public class _09_08_FactorialNumeroEscaneado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce un número para conocer su factorial: ");
		int numero = sc.nextInt();
		
		System.out.println("Resultado = " + factorial(numero));

	}
	
	public static int factorial(int numero) {
		
		int acumulado = 1;
		for (int i = numero; i >= 1; i--) {
			acumulado *= i;
		}
	
		return acumulado;
	}

}
