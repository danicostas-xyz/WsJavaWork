import java.util.Scanner;

public class _01_PerimetroAreaRectangulo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CÁLCULO DE ÁREA Y PERÍMETRO DE UN RECTÁNGULO");
		System.out.println("------------------------------------------------");
		
		System.out.println("Por favor, introduce la base del rectángulo en cm:");
		double base = sc.nextDouble();
		
		System.out.println("Por favor, introduce la altura del rectángulo en cm:");
		double altura = sc.nextDouble();
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		
		System.out.println("------------");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("------------");
		System.out.println("Pulsa enter para calcular el área del rectángulo con base " + base + " y altura " + altura);
		
		sc.nextLine();
		sc.nextLine();
		
		System.out.println("Área: " + area + "cm2");
		System.out.println("Pulsa enter para calcular el perímetro del rectángulo con base " + base + " y altura " + altura);
		
		sc.nextLine();
		
		System.out.println("Perímetro " + perimetro + "cm");

	}

}
