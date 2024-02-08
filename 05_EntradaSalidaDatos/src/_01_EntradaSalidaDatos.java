import java.util.Scanner;

public class _01_EntradaSalidaDatos {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Instanciamos un nuevo objeto de la clase Scanner

		System.out.println("Introduce un número entero y un número float: ");
		int numeroInt = scanner.nextInt();
		float numeroFloat = scanner.nextFloat(); // Para introducir por consola un número double hay que poner una ",".
		float sumaIntFloat = (float) numeroInt + numeroFloat;
		System.out.println("La suma de " + numeroInt + " + " + numeroFloat + " es igual a : " + sumaIntFloat);

		System.out.println("--");

		System.out.println("Introduce un número long y un número double: ");
		long numeroLong = scanner.nextLong();
		double numeroDouble = scanner.nextDouble();
		double sumaLongDouble = (double) numeroLong + numeroDouble;
		System.out.println("La suma de " + numeroLong + " + " + numeroDouble + " es igual a : " + sumaLongDouble);

		System.out.println("--");

		System.out.println("Escribe dos números enteros");
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		while (n1 < n2) {
			System.out.println(n1 + " es menor que " + n2);
			System.out.println("Por favor, introduzca 2 números otra vez, el primero mayor que el segundo");
			n1 = scanner.nextInt();
			n2 = scanner.nextInt();
		}
		System.out.println(n1 + " es mayor que " + n2);
		System.out.println("Gracias por introducir el primer número más grande que el segundo");

		System.out.println("--");

		System.out.println("Escribe un valor booleano");
		boolean booleano = scanner.nextBoolean();

		System.out.println("--");

		// System.out.println("Escribe un char");
		// char caracter = scanner.nextChar(); NO EXISTE EL MÉTODO NEXT.CHAR

		System.out.println("Escribe un byte");
		byte byte1 = scanner.nextByte();

		System.out.println("El programa ha finalizado");

	}

}
