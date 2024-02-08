import java.util.Scanner;

public class _03_AprobadoSuspenso {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu nota, de 0 a 100");
		int numero = sc.nextInt();
		String nota = correccionExamen(numero);
		System.out.println("El resultado de tu examen es: " + nota);

	}

	public static String correccionExamen(int n1) {
		
		String nota = "";

		if (n1 == 100) {
			nota = "Matrícula de Honor";
		} else if (n1 >= 90) {
			nota = "Sobresaliente";
		} else if (n1 >= 70) {
			nota = "Notable";
		} else if (n1 >= 60) {
			nota = "Bien";
		} else if (n1 >= 50) {
			nota = "Aprobado";
		} else if (n1 < 50) {
			nota = "Suspenso";
		}

		return nota;
	}

}
