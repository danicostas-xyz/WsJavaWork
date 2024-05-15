package negocio;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import entidad.Director;
import entidad.Empleado;
import entidad.JefeProyecto;
import entidad.Programador;

public class Main {

	static Scanner sc = new Scanner(System.in);
	static ArrayList<Empleado> listaEmpleadosGeneral = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("--------------------");
		System.out.println("COVISIAN ESPAÑA S.A.");
		System.out.println("--------------------");
		System.out.println("");

		boolean programaFinalizado = false;
		int opcion = 0;

		do {
			printMenu();

			System.out.println("");
			System.out.println("Seleccione una opción");
			System.out.println("");

			opcion = validarOpcionUsuario(1, 5);

			switch (opcion) {
			case 1:
				darAltaEmpleado();
				break;
			case 2:
				mostrarEmpleados();
				break;
			case 3:
				calcularSalarioEmpleado();
				break;
			case 4:
				calcularCosteTotalEmpresa();
				break;
			case 5:
				System.out.println("Programa finalizado");
				programaFinalizado = true;
			}
		} while (!programaFinalizado);

	}

	private static void printMenu() {
		System.out.println("1. Dar de alta empleado");
		System.out.println("2. Mostrar empleados");
		System.out.println("3. Calcular salario de empleado");
		System.out.println("4. Calcular costes totales de la empresa");
		System.out.println("5. Salir del programa");
	}

	private static void darAltaEmpleado() {

		int opcion = 0;

		System.out.println("");
		System.out.println("¿Qué tipo de empleado quieres dar de alta?");
		System.out.println("");
		System.out.println("1. Programador");
		System.out.println("2. Jefe de Proyecto");
		System.out.println("3. Director");
		System.out.println("");

		opcion = validarOpcionUsuario(1, 3);

		switch (opcion) {
		case 1:
			crearProgramador();
			break;
		case 2:
			crearJefeProyecto();
			break;
		case 3:
			crearDirector();
			break;
		}

	}

	private static void crearDirector() {

		System.out.println("Director");
		System.out.println("----------------");

		System.out.print("- Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("- DNI: ");
		String dni = sc.nextLine();
		System.out.print("- Sueldo Base: ");
		Double sueldoBase = Double.parseDouble(sc.nextLine());
		System.out.println("");
		ArrayList<Empleado> listaEmpleadosDirector = new ArrayList<>();
		ArrayList<Empleado> listaClonada = (ArrayList<Empleado>) listaEmpleadosGeneral.clone();

		System.out.println(
				"A continuación se muestran todos los empleados, seleccione, uno a uno, cuáles quiere que sean subordinados del director "
						+ nombre);
		System.out.println("");

		int opcion = 0;

		do {

			if (!listaClonada.isEmpty()) {
				for (int i = 0; i < listaClonada.size(); i++) {
					System.out.println((i + 1) + ". " + listaClonada.get(i).getNombre());
				}

				System.out.print("Escribe el número del empleado que quieres seleccionar.");
				System.out.print("Selecciona 0 si no quieres seleccionar más empleados: ");
				opcion = validarOpcionUsuario(0, listaClonada.size());

				if (opcion != 0) {
					listaEmpleadosDirector.add(listaClonada.get(opcion - 1));
					listaClonada.remove(opcion - 1);
				}

			} else {
				System.out.println("Ya no hay más empleados para añadir a la lista del director.");
				listaClonada = null;
				opcion = 0;
			}

		} while (opcion != 0);

		Director d = new Director();
		d.setDni(dni);
		d.setNombre(nombre);
		d.setSueldoBase(sueldoBase);
		d.setListaEmpleadosDirector(listaEmpleadosDirector);

	}

	private static void crearJefeProyecto() {

		System.out.println("Jefe de Proyecto");
		System.out.println("----------------");

		System.out.print("- Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("- DNI: ");
		String dni = sc.nextLine();
		System.out.print("- Sueldo Base: ");
		Double sueldoBase = Double.parseDouble(sc.nextLine());
		System.out.print("- Incentivo: ");
		Double incentivo = Double.parseDouble(sc.nextLine());

		JefeProyecto jP = new JefeProyecto(dni, nombre, sueldoBase, incentivo);

		listaEmpleadosGeneral.add(jP);

	}

	private static void crearProgramador() {

		System.out.println("Programador");
		System.out.println("-----------");

		System.out.print("- Nombre: ");
		String nombre = sc.nextLine();
		System.out.print("- DNI: ");
		String dni = sc.nextLine();
		System.out.print("- Sueldo Base: ");
		Double sueldoBase = Double.parseDouble(sc.nextLine());

		Programador p = new Programador(dni, nombre, sueldoBase);

		listaEmpleadosGeneral.add(p);

	}

	private static int validarOpcionUsuario(int minimo, int maximo) {
		int opcion = 0;
		opcion = Integer.parseInt(sc.nextLine());

		while (opcion < minimo || opcion > maximo) {
			System.out.println("Introduce un número entre " + minimo + " y " + maximo);
			opcion = Integer.parseInt(sc.nextLine());
			System.out.println("");
		}

		return opcion;
	}

	private static void mostrarEmpleados() {
		System.out.println("A continuación se muestran todos los empleados.");
		System.out.println("En el caso de los directores, se mostrarán también los empleados a su cargo.");
		System.out.println("");

		int contador = 1;
		for (Empleado e : listaEmpleadosGeneral) {
			System.out.println(contador + ". " + e);
			if (e instanceof Director) {
				Director dir = (Director) e;
				System.out.println("\tEmpleados a cargo: ");
				for (Empleado emp : dir.getListaEmpleadosDirector()) {
					System.out.println("\t" + "-" + emp);
				}
			}
		}

	}

	private static void calcularSalarioEmpleado() {
		System.out.println("Seleccione un empleado para ver su salario total: ");
		int i = 1;
		for (Empleado e : listaEmpleadosGeneral) {
			System.out.println(i + ". " + e.getNombre());
		}

		System.out.print("Escribe el número del empleado que quieres seleccionar: ");
		int opcion = validarOpcionUsuario(1, listaEmpleadosGeneral.size());

		System.out.println("Salario total de " + listaEmpleadosGeneral.get(opcion - 1) + ": "
				+ listaEmpleadosGeneral.get(opcion - 1).getSueldoBase());

	}

	private static void calcularCosteTotalEmpresa() {

		double costeTotalEmpresa = 0;

		for (Empleado e : listaEmpleadosGeneral) {

			if (e instanceof Director) {
				Director dir = (Director) e;
				costeTotalEmpresa += dir.getSalarioTotal();
			} else if (e instanceof JefeProyecto) {
				JefeProyecto jP = (JefeProyecto) e;
				costeTotalEmpresa += jP.getSalarioTotal();
			} else {
				costeTotalEmpresa += e.getSueldoBase();
			}

		}

		System.out.println("Coste total de los empleados: ");
		System.out.println("- " + costeTotalEmpresa + "€");

	}

}
