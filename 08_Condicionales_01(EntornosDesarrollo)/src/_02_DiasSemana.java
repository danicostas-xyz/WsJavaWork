import java.util.Scanner;

public class _02_DiasSemana {

	public static void main(String[] args) {
		numeroDiaSemana();

	}

	public static void numeroDiaSemana() {
		String dia = "";
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingresa un número para conocer el día de la semana correspondiente: ");
		int n1 = 0;
		do {
			n1 = sc.nextInt();
			if (n1 == 1) {
				dia = "Lunes";
			} else if (n1 == 2) {
				dia = "Martes";
			} else if (n1 == 3) {
				dia = "Miércoles";
			} else if (n1 == 4) {
				dia = "Jueves";
			} else if (n1 == 5) {
				dia = "Viernes";
			} else if (n1 == 6) {
				dia = "Sábado";
			} else if (n1 == 7) {
				dia = "Domingo";
			} else {
				System.out.print(
						"Por favor, introduce un número del 1 al 7 para conocer el día de la semana correspondiente: ");
			}
		} while (n1 < 1 || n1 > 7);

		System.out.println("Pulsa enter para saber qué día es");
		sc.nextLine();
		sc.nextLine();

		System.out.println("El día " + n1 + " es el " + dia);

	}

}
