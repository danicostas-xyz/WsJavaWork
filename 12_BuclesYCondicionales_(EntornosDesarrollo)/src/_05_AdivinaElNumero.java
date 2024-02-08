import java.util.Random;
import java.util.Scanner;

public class _05_AdivinaElNumero {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		System.out.println("JUEGO: ADIVINA EL NÚMERO DEL 1 AL 10");
		System.out.println("-------------------------");
		System.out.println("Adivina el número");
		System.out.println("- Introduce números hasta acertar");
		System.out.println("- Cada vez que introduzcas un número se indicará si te has pasado o te has quedado corto");
		System.out.println("");

		int numeroRandom = r.nextInt(10) + 1;

		System.out.print("Respuesta: ");
		int numeroUsuario = sc.nextInt();

		int acumulador = 1;

		while (numeroRandom != numeroUsuario) {
			acumulador++;
			if (numeroUsuario < numeroRandom) {
				System.out.print("Más!: ");
				numeroUsuario = sc.nextInt();
			} else {
				System.out.print("Menos!: ");
				numeroUsuario = sc.nextInt();
			}
		}

		System.out.println("Correcto!. Has acertado el número en el " + acumulador + "º intento!");

	}

}
