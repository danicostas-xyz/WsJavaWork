
public class _02_NumerosPares2al20 {

	public static void main(String[] args) {
		System.out.println("Números pares del 2 al 20:");
		System.out.println();

		System.out.println("Utilizando el operador +=, que incrementa X a la variable que indiques");
		for (int i = 2; i <= 20; i += 2) {
			System.out.println(i);
		}
		System.out.println("");

		System.out.println("Utilizando un if que valore si el módulo de i entre 2 es 0");
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}

}
