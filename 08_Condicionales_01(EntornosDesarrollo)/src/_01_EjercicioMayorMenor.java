import java.util.Scanner;

public class _01_EjercicioMayorMenor {

	public static void main(String[] args) {
		solicitaNumero();
	}

	public static void solicitaNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa dos números");
		System.out.print("Número 1: ");
		int n1 = sc.nextInt();
		System.out.print("Número 2: ");
		int n2 = sc.nextInt();
		System.out.println("Pulsa enter para conocer cuál es mayor ");
		sc.nextLine();
		sc.nextLine();

		mayorMenor(n1, n2);
	}

	public static void mayorMenor(int n1, int n2) {
		if (n1 > n2) {
			System.out.println(n1 + " es mayor que " + n2);
		} else if (n1 < n2) {
			System.out.println(n1 + " es menor que " + n2);
		} else {
			System.out.println("Los dos números son iguales");
		}
	}
}
