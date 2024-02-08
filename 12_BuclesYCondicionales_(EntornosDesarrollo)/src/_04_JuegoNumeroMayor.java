import java.util.Scanner;

public class _04_JuegoNumeroMayor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("JUEGO DEL NÚMERO MAYOR");
		System.out.println("----------------------");
		System.out.println(
				"El siguiente juego te pedirá números enteros (sin decimales) y, cuando introduzcas un número negativo, te mostrará cuál de los números introducidos es el mayor");
		System.out.println("");

		System.out.print("Introduce el primer número: ");
		int numeroIntroducido = sc.nextInt();
		int numeroMayor = 0;

		while (numeroIntroducido <= 0) {
			System.out.println("El primer número ha de ser un número mayor que 0");
			System.out.print("Introduce de nuevo el primer número, por favor: ");
			numeroIntroducido = sc.nextInt();
			System.out.println("");
		}

		while (numeroIntroducido >= 0) {

			if (numeroIntroducido > numeroMayor) {
				numeroMayor = numeroIntroducido;
			}

			System.out.print("- Introduce otro número: ");
			numeroIntroducido = sc.nextInt();
			System.out.println("");

		}

		System.out.println("Pulsa enter para conocer cuál es el número más alto que has introducido");
		sc.nextLine();
		sc.nextLine();

		System.out.println("El número más alto introducido es: " + numeroMayor);

	}

}
