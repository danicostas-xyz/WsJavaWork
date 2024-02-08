import java.util.Scanner;

public class _04_MediaTresNumeros {

	public static void main(String[] args) {
		System.out.println("CALCULADORA DE MEDIA DE TRES NÚMEROS");
		System.out.println("--------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Por favor, introduce el primer número:");
		double numero1 = sc.nextDouble();
		
		System.out.println("Por favor, introduce el segundo número:");
		double numero2 = sc.nextDouble();
		
		System.out.println("Por favor, introduce el tercer número:");
		double numero3 = sc.nextDouble();
		
		double media = (numero1 + numero2 + numero3) / 3;
		
		System.out.println("");
		System.out.println("--------");
		System.out.println("- Número 1: " + numero1);
		System.out.println("- Número 2: " + numero2);
		System.out.println("- Número 3: " + numero3);
		System.out.println("--------");
		System.out.println("");
		
		System.out.println("Pulsa enter para calcular la media");
		
		sc.nextLine(); // LIMPIA EL BUFFER
		sc.nextLine(); // PARA HASTA RECIBIR SALTO DE LÍNEA
		
		System.out.println("Media: " + media);
		
	}

}
