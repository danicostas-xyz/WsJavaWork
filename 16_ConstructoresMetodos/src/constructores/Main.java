package constructores;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creación objeto con el Constructor 1:

		Videojuego userVideogame = new Videojuego();

		System.out.println("Introduce los datos del Videojuego");
		System.out.println("----------------------------------");
		System.out.print("- ID: ");
		int userVideogameId = sc.nextInt();
		System.out.print("- Nombre: ");
		sc.nextLine();
		String userVideogameName = sc.nextLine();
		System.out.print("- Puntuación (sobre 10, valor entero): ");
		int userVideogameScore = sc.nextInt();
		System.out.print("- Precio en Euros: ");
		double userVideogamePrice = sc.nextDouble();
		System.out.print("- Si es de segunda mano, escribe y. Si es nuevo, escribe n: ");
		sc.nextLine();
		String userVideogameSecondHand = sc.nextLine();

		userVideogame.id = userVideogameId;
		userVideogame.name = userVideogameName;
		userVideogame.score = userVideogameScore;
		userVideogame.priceInEuros = userVideogamePrice;

		if (userVideogameSecondHand.equals("y")) {
			userVideogame.isSecondHand = true;
		} else {
			userVideogame.isSecondHand = false;
		}

		// Creación objeto con el Constructor 2:

		Videojuego superMario64 = new Videojuego(89129, "Super Mario 64", 10, 59.99, "23/06/1996", true);

		// Creación objeto con el Constructor 3:

		Videojuego doomEternal = new Videojuego("Doom Eternal", "20/20/2020");
		doomEternal.id = 12312312;
		doomEternal.score = 8;
		doomEternal.priceInEuros = 35.90;
		doomEternal.isSecondHand = false;

		System.out.println("");
		System.out.println("Pulsa enter para mostrar todos los videojuegos");
		sc.nextLine();

		userVideogame.printData();
		System.out.println("¿Es jugable?");
		userVideogame.printIfPlayable();
		System.out.println("");

		superMario64.printData();
		System.out.println("¿Es jugable?");
		superMario64.printIfPlayable();
		System.out.println("");

		doomEternal.printData();
		System.out.println("¿Es jugable?");
		doomEternal.printIfPlayable();
		System.out.println("");

		System.out.println("OTROS MÉTODOS:");
		System.out.println("--------------");

		System.out.print("Precio en libras del " + doomEternal.name + ": ");
		doomEternal.printPriceInPounds();
		System.out.println("");

		System.out.println("Nombre y Puntuación del " + superMario64.name + ": ");
		superMario64.printNameAndScore();
		System.out.println("");

		System.out.println("Fecha del juego introducido por el usuario: " + userVideogame.creationDate);
		System.out.print("Fecha con formato americano: ");
		userVideogame.printDateYearMonthDay();
		System.out.println("");

		System.out.println("Como el " + superMario64.name
				+ " es de segunda mano, le aplicamos un descuento, quedando su precio original de "
				+ superMario64.priceInEuros + "€ en: " + superMario64.priceWithDiscount());
		System.out.println("");

		System.out.println("El juego introducido por el usuario tiene una nota de " + userVideogame.score
				+ ". Los números desde esa nota hasta el número 10 son: ");
		userVideogame.printValuesFromScoreTo10();
		System.out.println("");

		if (userVideogame.checkifMoreExpensiveThan(doomEternal.priceInEuros)) {
			System.out.println("El juego introducido por el usuario tiene un precio mayor que el " + doomEternal.name);
		} else {
			System.out.println("El juego introducido por el usuario tiene un precio menor que el " + doomEternal.name);
		}

	}

}
