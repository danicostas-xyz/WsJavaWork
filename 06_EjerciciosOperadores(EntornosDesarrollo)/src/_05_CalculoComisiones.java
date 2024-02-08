import java.util.Scanner;

public class _05_CalculoComisiones {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÁLCULO DE COMISIONES Y DE SUELDO TOTAL");
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("");
		
		System.out.print("Por favor, introduzca su sueldo base: ");
		double sueldoBase = sc.nextDouble();
		
		System.out.print("Introduzca el número de ventas cerradas en el mes: ");
		int ventas = sc.nextInt();
		
		double comision = (sueldoBase * 0.1) * ventas;
		double sueldoTotal = sueldoBase + comision;
		
		System.out.println("");
		System.out.println("---------");
		System.out.println("- Sueldo Base: " + sueldoBase + "€");
		System.out.println("- Ventas Cerradas: " + ventas);
		System.out.println("---------");
		System.out.println("");
		
		System.out.println("Pulsa enter para calcular sus comisiones de este mes y su sueldo total:");
		
		sc.nextLine();
		sc.nextLine();
		
		System.out.println("- Total Comisiones: " + comision + "€");
		System.out.println("- Sueldo Total: " + sueldoTotal + "€");
	
	}
}
