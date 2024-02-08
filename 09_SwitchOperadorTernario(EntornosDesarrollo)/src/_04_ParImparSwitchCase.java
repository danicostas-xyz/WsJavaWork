import java.util.Scanner;

public class _04_ParImparSwitchCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce un número para comprobar si es par o impar: ");
		int numero = sc.nextInt();
		System.out.println("El número " + numero + " es " + parImpar(numero));

	}
	
	public static String parImpar(int n1) {
		String resultado = "";
		int calculo = n1 % 2;
		
		switch(calculo) {
		case 0:
			resultado = "par";
			break;
		default:
			resultado = "impar";
		}

		return resultado;
	}

}
