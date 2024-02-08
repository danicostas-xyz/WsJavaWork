import java.util.Scanner;

public class _08_SueldoTrabajador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduce tu nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Introduce tu salario base: ");
		double salarioBase = sc.nextDouble();
		System.out.print("Introduce el número de horas extras realizadas: ");
		int horasExtra = sc.nextInt();
		
		System.out.println("");
		
		System.out.println("Pulsa enter para saber tu salario total: ");
		sc.nextLine();
		sc.nextLine();
		
		int salarioExtra = 40 * horasExtra;
		double salarioTotal = salarioBase + salarioExtra;
		
		System.out.println("- Salario Base: " + salarioBase + "€");
		System.out.println("- Salario Extra: " + salarioExtra + "€");
		System.out.println("- Salario Total: " + salarioTotal + "€");
	
	}

}
