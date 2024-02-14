
public class Trabajador {
	String nombre;
	String dni;
	double salario;

	public Trabajador() {
		super();
	}

	public Trabajador(String nombre, String dni, double salario) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.salario = salario;
	}

	// 1. Tendrán la opción de mostrar todos sus datos por pantalla (mediante el método
	// toString())
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", dni=" + dni + ", salario=" + salario + "]";
	}
	
	// 2. Tendrán la opción de devolver si un DNI es valido. Se puede hacer que tenga 9 caracteres o se puede investigar como hacer expresiones regulares en java. También se puede hacer una validación programática para verificar la última letra del DNI.
	
	
	// 3. Los objetos tendrán la opción de devolver si un trabajador gana más que otro trabajador pasado por parámetro.
	
	
	// 4. Tendrán la opción de devolver si un trabajador es igual a otro. Un trabajador es exactamente igual a otro si tiene todos sus atributos iguales.

}
