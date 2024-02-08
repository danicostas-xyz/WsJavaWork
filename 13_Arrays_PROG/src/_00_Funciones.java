import java.util.Scanner;

public class _00_Funciones {
	static Scanner sc = new Scanner(System.in);
	
	public static int[] creaArrayEnteros() {
		System.out.print("Introduce el número de elementos del array: ");
		int longitudArray = sc.nextInt();
		
		int[] arrayNumerosEnteros = new int[longitudArray];
		
		return arrayNumerosEnteros;
	}
	
	public static double[] creaArrayReales() {
		System.out.print("Introduce el número de elementos del array: ");
		int longitudArray = sc.nextInt();
		
		double[] arrayNumerosReales = new double[longitudArray];
		
		return arrayNumerosReales;
	}
	
	
	public static void imprimeArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("- " + array[i]);
		}
	}
	
	public static void imprimeArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("- " + array[i]);
		}
	}
	
//	public static void imprimeListaYSuma(int[] array, int suma) {
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("- " + array[i]);
//			suma += array[i];
//		}
//	}
//	
//	public static void imprimeListaYSuma(double[] array, double suma) {
//		for (int i = 0; i < array.length; i++) {
//			System.out.println("- " + array[i]);
//			suma += array[i];
//		}
//	}
	
	public static void solicitaDatosArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce el " + (i + 1) + "º número de la lista: ");
			int elementoArray = sc.nextInt();
			array[i] = elementoArray;
		}
	}
	
	public static void solicitaDatosArray(double[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("Introduce el " + (i + 1) + "º número de la lista: ");
			double elementoArray = sc.nextDouble();
			array[i] = elementoArray;
		}
	}
}
