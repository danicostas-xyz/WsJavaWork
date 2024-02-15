
public class Worker {
	String name;
	String dni;
	double salary;

	public Worker() {
		super();
	}

	public Worker(String name, String dni, double salary) {
		super();
		this.name = name;
		this.dni = dni;
		this.salary = salary;
	}

	// 1. Tendrán la opción de mostrar todos sus datos por pantalla (mediante el
	// método
	// toString())
	@Override
	public String toString() {
		return "Trabajador [nombre=" + name + ", dni=" + dni 
				+ ", salario=" + salary + "]";
	}

	// 2. Tendrán la opción de devolver si un DNI es valido. Se puede hacer que
	// tenga 9 caracteres o se puede investigar como hacer expresiones regulares en
	// java. También se puede hacer una validación programática para verificar la
	// última letra del DNI.

	public boolean returnIfDniValid() {
		boolean flag = false;

		if (this.dni.length() == 9) {
			flag = true;
		}

		return flag;
	}

	// 3. Los objetos tendrán la opción de devolver si un trabajador gana más que
	// otro trabajador pasado por parámetro.

	public boolean returnIfMoreSalary(Worker worker) {
		boolean flag = false;

		if (this.salary > worker.salary) {
			flag = true;
		}

		return flag;
	}

	// 4. Tendrán la opción de devolver si un trabajador es igual a otro. Un
	// trabajador es exactamente igual a otro si tiene todos sus atributos iguales.

	public boolean returnIfSameWorker(Worker worker) {
		boolean flag = false;

		if (this.name.equals(worker.name) && this.dni.equals(worker.dni) 
				&& this.salary == worker.salary) {
			flag = true;
		}

		return flag;
	}

}
