package entidad;

public class Programador extends Empleado {

	// --- Atributos ---

	/* No tiene atts específicos. Hereda todos de la clase Empleado */

	// --- Constructores ---

	public Programador() {
		super();
	}
	
	public Programador(String dni, String nombre, double sueldoBase) {
		super(dni, nombre, sueldoBase);
	}

	// --- Métodos ---

	@Override
	public String toString() {
		return "Programador [getId()=" + getId() + ", getDni()=" + getDni() + ", getNombre()=" + getNombre()
				+ ", getSueldoBase()=" + getSueldoBase() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
