package entidad;

public class Empleado {
	/**
	 * Atributo estático de la clase Empleado que sirve para que a cada instancia se
	 * le asocie un identificador único automático, incrementado en 1 cada vez que
	 * se instancie un nuevo objeto
	 */
	static int contadorId = 0;

	private String id;
	private String dni;
	private String nombre;
	private double sueldoBase;

	public Empleado() {
		super();
	}

	public Empleado(String id, String dni, String nombre, double sueldoBase) {
		super();
		this.id = id;
		this.dni = dni;
		this.nombre = nombre;
		this.sueldoBase = sueldoBase;
	}

	public static int getContadorId() {
		return contadorId;
	}

	public static void setContadorId(int contadorId) {
		Empleado.contadorId = contadorId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", dni=" + dni + ", nombre=" + nombre + ", sueldoBase=" + sueldoBase + "]";
	}

}
