import java.util.Scanner;

public class _02_PerimetroRectangulo {

	public static void main(String[] args) {
		solicitaPerimetroPorConsola();
		solicitaPerimetroPorConsola();
	}
	
	public static void perimetroRectangulo(double base, double altura) {
		double perimetro = 2 * (base + altura);
		System.out.println("El rectángulo con base " + base + " y altura " + altura + " es de " + perimetro + "cm");
	}
	
	public static void solicitaPerimetroPorConsola() {
		Scanner sc = new Scanner(System.in);
		System.out.println("CÁLCULO DEL PERÍMETRO DE UN RECTÁNGULO");
		System.out.println("--");
		System.out.print("Introduce la base del rectángulo en cm ");
		double base = sc.nextDouble();
		System.out.print("Introduce la altura del rectángulo en cm ");
		double altura = sc.nextDouble();
		System.out.println("--");
		System.out.println("Datos introducidos:");
		System.out.println("Base: " + base);
		System.out.println("Altura: " + altura);
		System.out.println("--");
		System.out.println(
				"Pulsa enter para calcular el perímetro del rectángulo con base " + base + "cm y altura " + altura + "cm");
		sc.nextLine();
		sc.nextLine();
		perimetroRectangulo(base, altura);
		sc.close();
	}

}
