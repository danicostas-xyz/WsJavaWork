import java.util.Scanner;

public class _11_PotenciaNumeroEscaneado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cálculo de una potencia");
		
		System.out.print("Introduce la base: ");
		int base = sc.nextInt();
		
		System.out.print("Introduce el exponente: ");
		int exponente = sc.nextInt();
		
		int resultado = potenciaNumero(base, exponente);
		
		System.out.println("El resultado es = " + resultado);
	}
	
	public static int potenciaNumero(int base, int exponente) {
		
		int resultado = 1;
		for (int i = exponente; i >= 1; i--) {
			resultado *= base;
			System.out.println(resultado);
		}
		
		return resultado;
	}

}
