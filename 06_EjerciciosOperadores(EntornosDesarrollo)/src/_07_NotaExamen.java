import java.util.Scanner;

public class _07_NotaExamen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int valorCorrecta = 5;
		int valorIncorrecta = -1;
		int valorBlanco = 0;

		System.out.println("CÁLCULO DE EXAMEN TIPO TEST DE 20 PREGUNTAS. NOTA SOBRE 100");
		System.out.println("--------------------------------------------------------------");

		System.out.println("- Cada pregunta correcta vale 5 puntos");
		System.out.println("- Cada pregunta incorrecta vale -1 punto");
		System.out.println("- Cada pregunta correcta vale 0 puntos");
		System.out.println("--------------------------------------------------------------");

		System.out.print("Número de respuestas correctas: ");
		int respuestasCorrectas = sc.nextInt();

		System.out.print("Número de respuestas incorrectas: ");
		int respuestasIncorrectas = sc.nextInt();

		System.out.print("Número de respuestas en blanco: ");
		int respuestasBlanco = sc.nextInt();
		System.out.println("--------------------------------------------------------------");

		int notaFinal = (valorCorrecta * respuestasCorrectas) + (valorIncorrecta * respuestasIncorrectas)
				+ (valorBlanco * respuestasBlanco);

		System.out.println("Pulsa enter para saber la nota final:");
		sc.nextLine();
		sc.nextLine();

		String resultado = "";

		if (notaFinal >= 100) {
			resultado = "Matrícula de Honor";
		} else if (notaFinal >= 90) {
			resultado = "Sobresaliente";
		} else if (notaFinal >= 70) {
			resultado = "Notable";
		} else if (notaFinal >= 60) {
			resultado = "Bien";
		} else if (notaFinal >= 50) {
			resultado = "Suficiente";
		} else if (notaFinal < 50) {
			resultado = "Suspenso";
		}

		System.out.print("La nota final es " + notaFinal + " " + "(" + resultado + ")");
	}

}
