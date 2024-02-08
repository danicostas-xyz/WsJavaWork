import java.util.Scanner;

public class _01_MayorMenorOperadorTernario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Introduce el primer número: ");
		int n1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int n2 = sc.nextInt();
		mayorMenor(n1, n2);
	}

	public static void mayorMenor(int n1, int n2) {

		// String respuesta = (n1 > n2) ? (n1 + "es mayor que " + n2) : (n1 + "es menor
		// que " + n2);
		// System.out.println(respuesta);

		// Se puede hacer directamente en una sola línea, sin necesidad de usar una
		// variable, aunque quizá no sea lo más legible
		System.out.println((n1 > n2) ? (n1 + " es mayor que " + n2) : (n1 + " no es mayor que " + n2));

		// OJO: En este caso solo podemos tener dos opciones, por lo que no es válido
		// para hacer una comparación de si un número es mayor o menor a otro (porque
		// también puede ser que los números sean iguales).
	}

}
