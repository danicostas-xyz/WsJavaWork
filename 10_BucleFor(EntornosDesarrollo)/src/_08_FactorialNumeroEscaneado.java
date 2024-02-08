import java.util.Scanner;

public class _08_FactorialNumeroEscaneado {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Factorial de un número");
		System.out.print("Introduce un número: ");
		int numero = sc.nextInt();

		// Hecho por mí. Creo una variable llamada resultado que adquiere el valor de
		// número inicialmente
		// Cuando entra en el bucle, se multiplica resultado * número siempre que
		// resultado y número no sean iguales (porque resultado vale lo mismo que número al principio
		
		// Lo hago así para multiplicar número x numero-1 x numero-2, etc.
		
//		int resultado = numero;
//		for (; numero >= 1; numero--) {
//			if (resultado != numero) {
//				resultado *= numero;
//			}
//		}
//		System.out.println(resultado);
		
		// Así lo hace Félix y es más sencillo.
		// Se crea una variable acumuladora con valor inicial 1.
		// Luego, en el for, se crea la variable contadora con valor = número (con el valor que se introduzca)
		// Luego se hace lo mismo que en el código de arriba pero sin hacer un if
		// No es necesario hacer if, porque la acumuladora vale 1 y sirve para la primera iteración, porque 1 x numero = numero
		// Y luego número ya vale -1
		
		// Todo esto se hace porque el factorial se calcula como 10x9x8x7... y no 10x10x9x8x7...

		int acumulador = 1;
		for (int i = numero; i >= 1; i--) {
			acumulador *= i;
		}
		System.out.println(acumulador);

	}

}
