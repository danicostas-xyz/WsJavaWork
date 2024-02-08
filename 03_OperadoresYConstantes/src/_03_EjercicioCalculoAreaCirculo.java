
public class _03_EjercicioCalculoAreaCirculo {

	public static void main(String[] args) {
		final double NUMERO_PI = 3.141592653589;
		double radio = 6.988;
		double area = areaCirculo(NUMERO_PI, radio);

		System.out.println("ÁREA DEL CÍRCULO:");
		System.out.println("Para círculo de radio " + radio + ":");
		System.out.println("Área: " + area);

	}

	public static double areaCirculo(double arg, double arg2) {
		return arg * (arg2 * arg2);
	}

}