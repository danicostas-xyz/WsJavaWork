import java.util.Scanner;

public class _03_SumaNumerosPositivos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("SUMA DE NÚMEROS POSITIVOS");
		System.out.println("-------------------------");

		System.out.println("1. Introduce números positivos enteros (sin decimales)");
		System.out.println("2. El programa irá sumando esos números hasta que introduzcas un valor negativo");
		System.out.println(
				"3. ¿Quieres que se muestre por pantalla el acumulado temporal o que se muestre solo al final?\n");
		System.out.println("\t- Pulsa 1 para mostrar el acumulado");
		System.out.println("\t- Pulsa 2 si solo quieres ver el resultado al final");

		int seleccionUsuario = sc.nextInt();

		while (seleccionUsuario < 1 || seleccionUsuario > 2) {
			System.out.println(
					"Número introducido incorrecto.\nIntroduce 1 para mostrar el acumulado temporal o 2 para ver el resultado al final");
			seleccionUsuario = sc.nextInt();
		}

		System.out.println(
				"Introduce un número positivo para sumarlo al acumulado o uno negativo para finalizar el programa");

		int acumulado = 0;
		int numeroIntroducido = sc.nextInt();

		while (numeroIntroducido > 0) {
			acumulado += numeroIntroducido;

			if (seleccionUsuario == 1) {
				System.out.println("- Acumulado parcial: " + acumulado);
			}

			System.out.println("Introduce otro número");
			numeroIntroducido = sc.nextInt();
		}

		System.out.println("El total de los números introducidos es: " + acumulado);

	}

}
