package entidad;

public class Coche {

	// 1. Atributos

	int id;
	String marca;
	String modelo;
	double precio_base;
	String fecha_matriculacion;
	int kilometros;

	// 2. Constructores

	public Coche() {
		this.marca = "";
		this.modelo = "";
	}

	public Coche(int id, String marca, String modelo, double precio_base, String fecha_matriculacion, int kilometros) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.precio_base = precio_base;
		this.fecha_matriculacion = fecha_matriculacion;
		this.kilometros = kilometros;
	}

	// 3. Métodos

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", precio_base=" + precio_base
				+ ", fecha_matriculacion=" + fecha_matriculacion + ", kilometros=" + kilometros + "]";
	}

	public void printPrecio() {
		System.out.println("Precio base : " + this.marca + " " + this.modelo + ": " + this.precio_base);
	}

	public void printFechaMatriculacion() {
		System.out.println("Fecha matriculación: " + this.fecha_matriculacion);
	}

	public void compruebaSiEsBisiesto() {
		String[] fechaDividida = this.fecha_matriculacion.split("/");
		int anio = Integer.parseInt(fechaDividida[3]);

		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)))
			System.out.println("El año es bisiesto");
		else
			System.out.println("El año no es bisiesto");
	}

	public double precioEnFuncionDeKilometros() {
		double precioEnFuncionDeKilometros = this.precio_base;

		if (this.kilometros <= 10000) {
			return precioEnFuncionDeKilometros;
		} else if (this.kilometros >= 10000 && this.kilometros <= 50000) {
			return precioEnFuncionDeKilometros * 0.8;
		} else {
			return precioEnFuncionDeKilometros * 0.5;
		}
	}

	public String compruebaKilometrosNumeroPrimo() {
		int contador = 0;

		for (int i = 1; i <= (this.kilometros / 2); i++) {
			if (this.kilometros % i == 0) {
				contador++;
			}
		}

		return (contador == 1) ? "No es primo" : "Es primo";
	}

	public int kilometrosRestantesPara200k() {
		return (200000 - this.kilometros);
	}

	public String numeroCaracteresMarcaYModelo() {
		int numeroCaracteresMarca = this.marca.length();
		int numeroCaracteresModelo = this.modelo.length();

		return "Número de caracteres de la marca del coche" + numeroCaracteresMarca
				+ ".\nNumero de caracteres del modelo del coche: " + numeroCaracteresModelo;

	}

	public String diferenciaKilometraje(int kilometrajeOtroCoche) {
		int diferencia = this.kilometros - kilometrajeOtroCoche;

		if (diferencia > 0) {
			return "El coche " + this.marca + " " + this.modelo + " tiene " + diferencia + " kilometros más.";
		} else {
			return "El coche " + this.marca + " " + this.modelo + " tiene " + diferencia + " kilometros menos.";
		}
	}

	public String cocheMasCaro(double precioOtroCoche) {
		if (this.precioEnFuncionDeKilometros() > precioOtroCoche) {
			return "El coche " + this.marca + " " + this.modelo + " es más caro";
		} else {
			return "El coche " + this.marca + " " + this.modelo + " es más barato";
		}
	}

}
