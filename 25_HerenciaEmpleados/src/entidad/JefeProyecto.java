package entidad;

public class JefeProyecto extends Empleado {

	// --- Atributos ---

	private double incentivo;
	private double salarioTotal = incentivo + this.getSueldoBase();

	// --- Constructores ---

	public JefeProyecto() {
		super();
	}
	
	public JefeProyecto(String dni, String nombre, double sueldoBase, double incentivo) {
		super(dni, nombre, sueldoBase);
		this.incentivo = incentivo;
	}

	// --- Getters & Setters ---
	
	public double getIncentivo() {
		return incentivo;
	}

	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}

	public double getSalarioTotal() {
		return salarioTotal;
	}

	public void setSalarioTotal(double salarioTotal) {
		this.salarioTotal = salarioTotal;
	}

	// --- Métodos ---

	@Override
	public String toString() {
		return "JefeProyecto [incentivo=" + incentivo + ", getId()=" + getId() + ", getDni()=" + getDni()
				+ ", getNombre()=" + getNombre() + ", getSueldoBase()=" + getSueldoBase() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
