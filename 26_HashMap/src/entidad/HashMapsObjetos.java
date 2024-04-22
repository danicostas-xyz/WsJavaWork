package entidad;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapsObjetos {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("LISTA DE PERSONAS");
		System.out.println("-----------------");
		System.out.println();

		printMenu();

		HashMap<String, Persona> mapPersona = new HashMap<>();

		int opcion = Integer.parseInt(sc.nextLine());

		do {
			switch (opcion) {
			case 1:
				crearPersona(mapPersona);
				printMenu();
				opcion = Integer.parseInt(sc.nextLine());
				break;
			case 2:
				mostrarPersonas(mapPersona);
				printMenu();
				opcion = Integer.parseInt(sc.nextLine());
				break;
			case 3:
				buscarPersona(mapPersona);
				printMenu();
				opcion = Integer.parseInt(sc.nextLine());
				break;
			case 4:
				break;
			}
		} while (opcion != 4);

		System.out.println("Programa finalizado");
	}

	public static void printMenu() {
		System.out.println("Seleccione una opción:");
		System.out.println("----------------------");
		System.out.println("1. Introducir Persona");
		System.out.println("2. Mostrar Personas");
		System.out.println("3. Buscar persona por nombre");
		System.out.println("4. Salir del programa");
	}

	public static void crearPersona(HashMap<String, Persona> mapPersona) {
		Persona persona = new Persona();
		System.out.print("- Nombre: ");
		String sNombre = sc.nextLine();
		persona.setNombre(sNombre);
		System.out.print("- Edad: ");
		persona.setEdad(Integer.parseInt(sc.nextLine()));
		System.out.print("- Peso: ");
		persona.setPeso(Integer.parseInt(sc.nextLine()));

		mapPersona.put(sNombre.toLowerCase(), persona);

	}

	private static void mostrarPersonas(HashMap<String, Persona> mapPersona) {
		mapPersona.forEach((k, v) -> {
			System.out.println(k + ":");
			System.out.println("-----------");
			System.out.println("- Nombre: " + v.getNombre());
			System.out.println("- Edad: " + v.getEdad());
			System.out.println("- Peso: " + v.getPeso());
		});
	}

	private static void buscarPersona(HashMap<String, Persona> mapPersona) {
		System.out.println("Introduce un nombre para buscarlo en la lista: ");
		String nombre = sc.nextLine();
		if (mapPersona.containsKey(nombre.toLowerCase())) {
			Persona p = mapPersona.get(nombre.toLowerCase());
			System.out.println("Datos de " + nombre);
			System.out.println("- Nombre: " + p.getNombre());
			System.out.println("- Edad: " + p.getEdad());
			System.out.println("- Peso: " + p.getPeso());

		} else {
			System.out.println("La persona introducida no existe");
		}

	}

}
