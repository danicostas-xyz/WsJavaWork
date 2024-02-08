
public class _06_EjercicioCalculoIndiceMasaCorporal {

	public static void main(String[] args) {
		double altura = 1.83;
		double peso = 79.50;
		final double IMC = peso / (altura * altura);

		System.out.println(IMC);
		System.out.println(calculoImc(peso, altura));
	}

	public static double calculoImc(double peso, double altura) {
		return peso / (altura * altura);
	}

}
