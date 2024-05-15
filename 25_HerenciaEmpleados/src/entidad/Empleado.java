package entidad;

public class Empleado {
	
	// --- Atributos ---
	
	/**
	 * Atributo estático de la clase Empleado que sirve para que a cada instancia se
	 * le asocie un identificador único automático, incrementado en 1 cada vez que
	 * se instancie un nuevo objeto.
	 */
	
	private static int contadorId = 0;

	private int id = contadorId++;
	private String dni;
	private String nombre;
	private double sueldoBase;

	
	// --- Constructores ---
	
	public Empleado() {
		super();
	}

	public Empleado(String dni, String nombre, double sueldoBase) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}
	
	// --- Getters & Setters ---

	public static int getContadorId() {
		return contadorId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}

	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	
	// --- Métodos ---

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}

}
