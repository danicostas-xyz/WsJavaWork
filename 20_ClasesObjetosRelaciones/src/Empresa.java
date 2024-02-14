import java.util.Arrays;

public class Empresa {
	String nombre;
	String nif;
	Trabajador[] trabajadores;

	public Empresa() {
		super();
	}

	public Empresa(String nombre, String nif, Trabajador[] trabajadores) {
		super();
		this.nombre = nombre;
		this.nif = nif;
		this.trabajadores = trabajadores;
	}

	// 1. Tendrán la opción de mostrar todos sus datos por pantalla (mediante el método
	// toString()). Esto incluye todos los trabajadores con sus datos.

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", nif=" + nif + ", trabajadores=" + Arrays.toString(trabajadores) + "]";
	}

	// 2. Tendrán la opción de mostrar todos los datos de sus trabajadores.
	// 3. Tendrán la opción de saber si existe un trabajador en la empresa, pasándole un DNI por parámetro.
	// 4. Tendrán la opción de devolver el numero de trabajadores que tienen.
	// 5. Tendrán la opción de devolver el salario total que se gasta en sus trabajadores.
	// 6. Tendrán la opción de devolver cuantos trabajadores ganan más de 3000€
	// 7. Tendrán la opción de devolver cuantos trabajadores ganan menos del SMI.
	// 8. Tendrán la opción de devolver cuantos trabajadores ganan más que una cantidad pasada por parámetro.
	// 9. Tendrán la opción de devolver si todos los trabajadores tienen un DNI valido.
	// 10.Tendrán la opción de devolver si una empresa pasada por parámetro es exactamente igual a la  misma. Un empresa es exactamente igual si tiene el mismo nombre y el mismo NIF


}
