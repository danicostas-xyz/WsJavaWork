import java.util.Arrays;

public class Company {
	String name;
	String nif;
	Worker[] workers;

	public Company() {
		super();
	}

	public Company(String name, String nif, Worker[] workers) {
		super();
		this.name = name;
		this.nif = nif;
		this.workers = workers;
	}

	// 1. Tendrán la opción de mostrar todos sus datos por pantalla (mediante el
	// método
	// toString()). Esto incluye todos los trabajadores con sus datos.

	@Override
	public String toString() {
		return "Empresa [nombre=" + name + ", nif=" + nif 
				+ ", trabajadores=" + Arrays.toString(workers) + "]";
	}

	// 2. Tendrán la opción de mostrar todos los datos de sus trabajadores.
	
	public void printWorkers() {
		for (Worker worker : this.workers) {
			System.out.println(worker);
		}
	}

	// 3. Tendrán la opción de saber si existe un trabajador en la empresa,
	// pasándole un DNI por parámetro.
	
	public boolean returnIfWorkerExists(String dni) {
		boolean flag = false;
		
		for (Worker worker : this.workers) {
			if (worker.dni.equals(dni)) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}

	// 4. Tendrán la opción de devolver el numero de trabajadores que tienen.
	
	public int returnNumberOfWorkers() {
		if (this.workers != null) {
			return workers.length;
		} else {
			return 0;
		}
	}

	// 5. Tendrán la opción de devolver el salario total que se gasta en sus
	// trabajadores.
	
	public double returnWorkersTotalSalary() {
		double totalSalary = 0;
		
		for (Worker worker : this.workers) {
			totalSalary += worker.salary;
		}
		
		return totalSalary;
	}

	// 6. Tendrán la opción de devolver cuantos trabajadores ganan más de 3000€.

	public int returnNumberOfWorkersAbove3000() {
		int counter = 0;
		
		for (Worker worker : this.workers) {
			if (worker.salary > 3000) {
				counter++;
			}
		}
		
		return counter;
	}
	
	// 7. Tendrán la opción de devolver cuantos trabajadores ganan menos del SMI.

	// 8. Tendrán la opción de devolver cuantos trabajadores ganan más que una
	// cantidad pasada por parámetro.

	// 9. Tendrán la opción de devolver si todos los trabajadores tienen un DNI
	// valido.

	// 10.Tendrán la opción de devolver si una empresa pasada por parámetro es
	// exactamente igual a la misma. Un empresa es exactamente igual si tiene el
	// mismo nombre y el mismo NIF

}
