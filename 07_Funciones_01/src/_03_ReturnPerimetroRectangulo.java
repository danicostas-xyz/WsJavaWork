import java.util.Scanner;

public class _03_ReturnPerimetroRectangulo {

	public static void main(String[] args) {
			solicitaPerimetroPorConsola();
			solicitaPerimetroPorConsola();
	}
	
	public static double perimetroRectangulo (double base, double altura) {
		double perimetro = 2 * (base + altura);
		return perimetro;
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
		double perimetro = perimetroRectangulo(base, altura);
		System.out.println(perimetro);
	}

}
