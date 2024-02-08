import java.util.Scanner;

public class _03_CalculoSumaRestaMultiplicacionDivision {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("CÁLCULO DE SUMA, RESTA, MULTIPLICACIÓN Y DIVISIÓN DE 2 NÚMEROS");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Por favor, introduce un número");
		double numero1 = scan.nextDouble();
		System.out.println("Por favor, introduce otro número");
		double numero2 = scan.nextDouble();
		
		double suma = numero1 + numero2;
		double resta1 = numero1 - numero2;
		double resta2 = numero2 - numero1;
		double multiplicacion = numero1 * numero2;
		double division1 = numero1 / numero2;
		double division2 = numero2 / numero1;
		
		System.out.println("--------------------------------------------------------------");
		System.out.println("NÚMEROS INTRODUCIDOS EN EL SISTEMA:");
		System.out.println("- Número 1: " + numero1);
		System.out.println("- Número 2: " + numero2);
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Pulsa enter para calcular la suma");
		scan.nextLine();
		scan.nextLine();
		System.out.println(numero1 + " + " + numero2 + " = " + suma);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para calcular la resta de " + numero1 + " - " + numero2);
		scan.nextLine();
		System.out.println(numero1 + " - " + numero2 + " = " + resta1);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para calcular la resta de " + numero2 + " - " + numero1);
		scan.nextLine();
		System.out.println(numero2 + " - " + numero1 + " = " + resta2);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para calcular la multiplicación");
		scan.nextLine();
		System.out.println(numero1 + " x " + numero2 + " = " + multiplicacion);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para calcular la división de " + numero1 + " / " + numero2);
		scan.nextLine();
		System.out.println(numero1 + " / " + numero2 + " = " + division1);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para calcular la división de " + numero2 + " / " + numero1);
		scan.nextLine();
		System.out.println(numero2 + " / " + numero1 + " = " + division2);

	}

}
