import java.util.Scanner;

public class _02_ConversorTemperatura {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Conversor de temperatura");
		System.out.println("------------------------");

		int repetirPrograma;

		do {
			System.out.println("¿Qué tipo de conversión quieres hacer?");
			System.out.println("Pulsa 1 para convertir de Celsius a Fahrenheit");
			System.out.println("Pulsa 2 para convertir de Fahrenheit a Celsius");

			int seleccionUsuario = sc.nextInt();

			while (seleccionUsuario > 2 || seleccionUsuario < 1) {
				System.out.println("Por favor, introduce un número correcto");
				System.out.println("Pulsa 1 para convertir de Celsius a Fahrenheit");
				System.out.println("Pulsa 2 para convertir de Fahrenheit a Celsius");
				seleccionUsuario = sc.nextInt();
			}

			if (seleccionUsuario == 1) {
				System.out.println("Has elegido convertir de Celsius a Fahrenheit");
				System.out.print("Introduce la temperatura que quieras pasar de Celsius a Fahrenheit: ");
				double temperaturaIntroducida = sc.nextDouble();
				double temperaturaConvertida = celsiusAFahrenheit(temperaturaIntroducida);

				System.out.println("");
				System.out.println("Pulsa enter para hacer el cálculo");
				System.out.println("");
				sc.nextLine();
				sc.nextLine();

				System.out.println(temperaturaIntroducida + "ºC = " + temperaturaConvertida + "ºF");

			} else {
				System.out.println("Has elegido convertir de Fahrenheit a Celsius");
				System.out.print("Introduce la temperatura que quieras pasar de Fahrenheit a Celsius: ");
				double temperaturaIntroducida = sc.nextDouble();
				double temperaturaConvertida = fahrenheitACelsius(temperaturaIntroducida);

				System.out.println("");
				System.out.println("Pulsa enter para hacer el cálculo");
				System.out.println("");
				sc.nextLine();
				sc.nextLine();

				System.out.println(temperaturaIntroducida + "ºF = " + temperaturaConvertida + "ºC");
			}

			System.out.println(
					"¿Quieres hacer otro cálculo?\nPulsa 1 para hacer un nuevo cálculo o 2 si quieres finalizar el programa");
			repetirPrograma = sc.nextInt();

			while (repetirPrograma > 2 || repetirPrograma < 1) {
				System.out.println("Por favor, introduce un número correcto");
				System.out.println("Pulsa 1 para realizar un nuevo cálculo");
				System.out.println("Pulsa 2 para finalizar el programa");
				repetirPrograma = sc.nextInt();
			}

		} while (repetirPrograma == 1);

		System.out.println("Programa finalizado.");

	}

	public static double celsiusAFahrenheit(double celsius) {
		double fahrenheit = ((celsius * 9 / 5) + 32);
		return fahrenheit;
	}

	public static double fahrenheitACelsius(double fahrenheit) {
		double celsius = (fahrenheit - 32) * 5 / 9;
		return celsius;
	}

}
