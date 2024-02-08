package constructores;

public class Videojuego {

	// 1. Atributos

	int id;
	String name;
	int score;
	double priceInEuros;
	String creationDate;
	boolean isSecondHand;

	// 2. Constructores

	public Videojuego() {
		creationDate = "01/01/1970";
	}

	public Videojuego(int id, String name, int score, double priceInEuros, String creationDate, boolean isSecondHand) {
		this.id = id;
		this.name = name;
		this.score = score;
		this.priceInEuros = priceInEuros;
		this.creationDate = creationDate;
		this.isSecondHand = isSecondHand;
	}

	public Videojuego(String nombre, String creationDate) {
		this.name = nombre;
		this.creationDate = creationDate;
	}

	// 3. Métodos

	public void printData() {
		System.out.println(this.name.toUpperCase());
		System.out.println("-----------------------");
		System.out.println("- ID: " + this.id);
		System.out.println("- NOTA: " + this.score);
		System.out.println("- PRECIO: " + priceInEuros + "€");
		System.out.println("- FECHA CREACIÓN: " + creationDate);
		System.out.println((this.isSecondHand) ? "Juego Seminuevo" : "Juego Nuevo");
	}

	public void printNameAndScore() {
		System.out.println(this.name.toUpperCase() + ": " + this.score + "/10");
	}

	public void printPriceInPounds() {
		double precioEnLibras = this.priceInEuros * 0.86;
		System.out.println(precioEnLibras);
	}

	public void printDateYearMonthDay() {
		String fechaYearMonthDay = "";
		String[] fecha = this.creationDate.split("/");
		fechaYearMonthDay = fecha[2] + "/" + fecha[1] + "/" + fecha[0];
		System.out.println(fechaYearMonthDay);
	}

	public double priceWithDiscount() {
		double priceWithDiscount = this.priceInEuros;

		if (isSecondHand) {
			priceWithDiscount = (this.priceInEuros - (this.priceInEuros * 0.3));
		}

		return priceWithDiscount;
	}

	public void printIfPlayable() {
		if (score >= 5) {
			System.out.println("Juego con nota superior o igual a 5. Juego jugable");
		} else {
			System.out.println("Juego con nota inferior a 5. No jugable.");
		}
	}

	public void printValuesFromScoreTo10() {
		System.out.println("Números entre la nota (" + this.score + ") y 10");

		for (int i = this.score; i <= 10; i++) {
			System.out.println("-" + i);
		}
	}

	/**
	 * Este método devuelve true si el precio que pasemos por parámetro (de otro
	 * objeto) es menor que el del objeto que lo invoca
	 * 
	 * @param price
	 * @return Este método devuelve true si el precio que pasemos por parámetro (de
	 *         otro objeto) es menor que el del objeto que lo invoca
	 */
	public boolean checkifMoreExpensiveThan(double price) {
		boolean isMoreExpensive = false;

		if (this.priceInEuros > price) {
			isMoreExpensive = true;
		}

		return isMoreExpensive;
	}

}
