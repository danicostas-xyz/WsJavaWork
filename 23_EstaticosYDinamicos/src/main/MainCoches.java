package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidad.Coche;

public class MainCoches {

	ArrayList<Coche> listaCoches = new ArrayList<Coche>();
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		MainCoches main = new MainCoches();
		main.arrancarPrograma();
	}

	public void arrancarPrograma() {
		asciiArt();
		int seleccionUsuario;

		do {
			printMenu();
			seleccionUsuario = sc.nextInt();

			switch (seleccionUsuario) {
			case 1:
				crearCoche();
				break;
			case 2:
				mostrarDatos();
				break;
			case 3:
				mostrarContadorID();
				break;
			case 4:
				resetearContadorID();
				break;
			default:
				finalizarPrograma();
				break;
			}

		} while (seleccionUsuario != 5);

	}

	public void printMenu() {
		System.out.println("");
		System.out.println("-----------------------------");
		System.out.println("- Selecciona una opción");
		System.out.println("-----------------------------");
		System.out.println("1. Crear coche");
		System.out.println("2. Mostrar coche");
		System.out.println("3. Mostrar contadorID");
		System.out.println("4. Resetear contadorID");
		System.out.println("5. Salir del programa");
		System.out.println("-----------------------------");
		System.out.println("");
	}

	public void crearCoche() {
		Coche coche = new Coche();
		System.out.println("1. CREAR COCHE");
		System.out.print("- Introduce la matrícula: ");
		sc.nextLine();
		coche.setMatricula(sc.nextLine());
		System.out.println("- Introduce la marca: ");
		coche.setMarca(sc.nextLine());
		listaCoches.add(coche);
	}

	public void mostrarDatos() {
		if (listaCoches.size() > 0) {
			System.out.println("Lista de coches: ");
			for (Coche c : listaCoches) {
				System.out.println(c);
			}
		} else {
			System.out.println("No hay coches para mostrar.");
		}
	}

	public void mostrarContadorID() {
		System.out.println("Contador ID actual: " + Coche.getContadorID());
	}

	public void resetearContadorID() {
		Coche.resetContadorID();
		System.out.println("Contador ID reseteado a 0");
	}

	public void finalizarPrograma() {
		System.out.println("Fin del programa. Vuelve a ejecutar para reiniciar.");
	}
	
	public void asciiArt() {
		System.out.println("                              _.-=\"_-         _\r\n"
				+ "                         _.-=\"   _-          | ||\"\"\"\"\"\"\"---._______     __..\r\n"
				+ "             ___.===\"\"\"\"-.______-,,,,,,,,,,,,`-''----\" \"\"\"\"\"       \"\"\"\"\"  __'\r\n"
				+ "      __.--\"\"     __        ,'                   o \\           __        [__|\r\n"
				+ " __-\"\"=======.--\"\"  \"\"--.=================================.--\"\"  \"\"--.=======:\r\n"
				+ "]       [w] : /        \\ : |== ------------------ ==|    : /        \\ :  [w] :\r\n"
				+ "V___________:|          |: |===| Muñón Factory SL |==|    :|          |:   _-\"\r\n"
				+ " V__________: \\        / :_|== ------------------ ==/_____: \\        / :__-\"\r\n"
				+ " -----------'  \"-____-\"  `-------------------------------'  \"-____-\"");
	}

}
