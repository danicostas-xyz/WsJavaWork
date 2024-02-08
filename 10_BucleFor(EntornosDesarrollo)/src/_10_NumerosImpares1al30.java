
public class _10_NumerosImpares1al30 {

	public static void main(String[] args) {

		System.out.println("Números impares del 1 al 30 usando el operador de incremento += 2");

		for (int i = 1; i <= 30; i += 2) {
			System.out.println(i);
		}

		System.out.println("Números impares del 1 al 30 usando un if que verifique el modulo de x % 2 != 0");

		for (int i = 1; i <= 30; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
}
