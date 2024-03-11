package entidad;

public class Coche {

	// Attributes
	private int id;
	private String matricula;
	private String marca;

	private static int contadorID;

	private static final String marca1 = "Toyota";
	private static final String marca2 = "Renault";

	// Constructors
	public Coche() {
		super();
		this.id = contadorID++;
	}

	// Methods
	@Override
	public String toString() {
		return "Coche [id=" + id + ", matricula=" + matricula + ", marca=" + marca + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public static String getMarca1() {
		return marca1;
	}

	public static String getMarca2() {
		return marca2;
	}

	public static int getContadorID() {
		return contadorID;
	}

	public static void resetContadorID() {
		contadorID = 0;
	}

}
