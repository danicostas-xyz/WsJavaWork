import java.util.Scanner;

public class _03_SolicitaDosNumerosEnteros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		twoIntNumbers();
		String respuesta = "y";

		while (respuesta.equals("y")) {
			System.out.println("Quieres calcular otros 2 números?");
			System.out.print("Pulsa 'y' para hacer un nuevo cálculo o 'n' para parar el programa ");
			respuesta = sc.nextLine();
			if (respuesta.equals("y")) {
				twoIntNumbers();
			} else if (respuesta.equals("n")) {
				System.out.println("Programa finalizado");
			}
		}

		// Esto valdría pero solo para una vez. El código anterior, con while(), permite
		// que se vuelva a repetir siempre que la respuesta sea "y".
//		if (respuesta.equals("y")) {
//			twoIntNumbers();
//		} else if (respuesta.equals("n")) {
//			System.out.println("Programa finalizado");
//		}

	}

	public static void twoIntNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"INTRODUCE 2 NÚMEROS ENTEROS PARA HACER 4 OPERACIONES (SUMA, RESTA, MULTIPLICACION Y DIVISION)");
		System.out.println(
				"---------------------------------------------------------------------------------------------");
		System.out.print("Introduce el primer número: ");
		int n1 = sc.nextInt();
		System.out.print("Introduce el segundo número: ");
		int n2 = sc.nextInt();

		System.out.println("");

		System.out.println("NÚMEROS INTRODUCIDOS: ");
		System.out.println("Número 1: " + n1);
		System.out.println("Número 2: " + n2);

		System.out.println("");

		System.out.println("Pulsa enter para hacer los cálculos");

		sc.nextLine();
		sc.nextLine();

		int suma = _01_Calculadora.suma(n1, n2);
		int resta = _01_Calculadora.resta(n1, n2);
		int multiplicacion = _01_Calculadora.multiplicacion(n1, n2);
		int division = _01_Calculadora.division(n1, n2);

		System.out.println(n1 + " + " + n2 + " = " + suma);
		System.out.println(n1 + " - " + n2 + " = " + resta);
		System.out.println(n1 + " x " + n2 + " = " + multiplicacion);
		System.out.println(n1 + " / " + n2 + " = " + division);

		System.out.println("");

	}

	/*
	 * [COMENTARIO DE CHATGPT SOBRE EL CÓDIGO]:
	 * 
	 * El código que proporcionaste es una implementación de una calculadora
	 * interactiva que permite al usuario ingresar dos números enteros y realizar
	 * varias operaciones con ellos (suma, resta, multiplicación y división). Luego,
	 * el programa pregunta si el usuario desea realizar otro cálculo o finalizar el
	 * programa. La lógica de repetición se maneja mediante un bucle while.
	 * 
	 * A continuación, algunas observaciones sobre el código:
	 * 
	 * - Estructura del Programa: La estructura general del programa es clara y
	 * fácil de seguir. La lógica de la aplicación es intuitiva y se ejecuta en un
	 * bucle hasta que el usuario decida detenerla.
	 * 
	 * - Uso de un Bucle While: El uso de un bucle while es apropiado para este
	 * escenario, ya que permite que el programa continúe ejecutándose mientras el
	 * usuario desee realizar más cálculos.
	 * 
	 * - Manejo de Respuestas del Usuario: La forma en que manejas las respuestas
	 * del usuario es correcta. El programa continuará solicitando más cálculos
	 * mientras el usuario ingrese "y" y finalizará si el usuario ingresa "n".
	 * 
	 * - Método twoIntNumbers: El método twoIntNumbers está bien diseñado y realiza
	 * correctamente las operaciones matemáticas.
	 * 
	 * - Escaneo de la Entrada del Usuario: Estás creando múltiples instancias de
	 * Scanner en tu programa. Esto no es necesario. Puedes crear una instancia de
	 * Scanner y reutilizarla para todas las entradas del usuario.
	 * 
	 * - Manejo de Errores: Sería bueno agregar manejo de errores en caso de que el
	 * usuario ingrese algo que no sea un número entero cuando se solicitan los dos
	 * números.
	 * 
	 * En general, el código es funcional y bien estructurado. Sin embargo,
	 * consideraría las sugerencias sobre el escaneo de la entrada del usuario y el
	 * manejo de errores. ¡Sigue adelante!
	 */

}
