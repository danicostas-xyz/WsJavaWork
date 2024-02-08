import java.util.Scanner;

public class _06_CalificacionFinalAsignatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("CÁLCULO DE NOTA FINAL DE ASIGNATURA");
		System.out.println("--------------------------------------------------------------");
		System.out.println("La nota final se calcula de la siguiente manera:");
		System.out.println("");
		System.out.println("- 55%: Promedio de la nota de los 3 exámenes parciales");
		System.out.println("- 30%: Nota del examen final");
		System.out.println("- 15%: Nota del trabajo final");
		System.out.println("");
		
		System.out.println("----------");
		System.out.print("Nota del primer examen parcial: ");
		double primerExamenParcial = sc.nextDouble();
		System.out.print("Nota del segundo examen parcial: ");
		double segundoExamenParcial = sc.nextDouble();
		System.out.print("Nota del tercer examen parcial: ");
		double tercerExamenParcial = sc.nextDouble();
		double mediaParciales = (primerExamenParcial + segundoExamenParcial + tercerExamenParcial) / 3;
		System.out.println("");
		System.out.println("- Media de los exámenes parciales: " + mediaParciales);
		System.out.println("");
		
		System.out.print("Nota del examen final: ");
		double examenFinal = sc.nextDouble();
		
		System.out.print("Nota del trabajo final: ");
		double trabajoFinal = sc.nextDouble();
		
		System.out.println("");
		System.out.println("Pulsa enter para el cálculo de la nota final de la asignatura:");
		sc.nextLine();
		sc.nextLine();
		
		double notaFinal = (mediaParciales * 0.55) + (examenFinal * 0.30) + (trabajoFinal * 0.15);
		
		System.out.println("Nota final: " + notaFinal);
	
	}

}
