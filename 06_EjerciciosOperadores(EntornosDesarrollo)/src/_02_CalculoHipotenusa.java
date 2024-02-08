import java.util.Scanner;

public class _02_CalculoHipotenusa {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("CÁLCULO DE LA HIPOTENUSA DE UN TRIÁNGULO RECTÁNGULO DADOS SUS CATETOS");
		System.out.println("------------------------------------------------");
		
		System.out.println("Por favor, introduce la longitud en cm del cateto A:");
		double catetoA = scanner.nextDouble();
		
		System.out.println("Por favor, introduce la longitud en cm del cateto B:");
		double catetoB = scanner.nextDouble();
		
		double hipotenusa = Math.sqrt((catetoA * catetoA) + (catetoB * catetoB));
		System.out.println("------------");
		System.out.println("Cateto A: " + catetoA + "cm");
		System.out.println("Cateto B: " + catetoB + "cm");
		System.out.println("------------");
		System.out.println("Pulsa enter para calcular la hipotenusa del triángulo");
		
		scanner.nextLine(); // LIMPIA EL BUFFER
		scanner.nextLine(); // HACE LA PAUSA HASTA RECIBIR UN SALTO DE LÍNEA
		
		// Hay que duplicar el nextLine(); porque el Scanner de Java tiene un bug:
		// cuando se pasa de un scanner que recoge un número (double, int, etc) a un
		// scanner que recoge un String, el primer nextLine() limpia el buffer y el
		// segundo es el que hace realmente la pausa.
		
		System.out.println("La hipotenusa del triángulo es: " + hipotenusa + "cm");

	}

}
