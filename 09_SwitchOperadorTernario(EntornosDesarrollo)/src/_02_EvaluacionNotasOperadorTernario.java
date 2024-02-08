import java.util.Scanner;

public class _02_EvaluacionNotasOperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce tu nota de 0 a 100 para saber el resultado del examen: ");
		int nota1 = sc.nextInt();
		evaluacionNotas(nota1);

	}
	
	public static void evaluacionNotas(int nota) {
		String resultado = (nota >= 50) ? "Aprobado" : "Suspenso";
		System.out.println("El resultado del examen es " + resultado);
		
		// No podemos tener varias opciones para definir si el aprobado es suficiente, bien, notable, sobresaliente, etc.
		
	}

}
