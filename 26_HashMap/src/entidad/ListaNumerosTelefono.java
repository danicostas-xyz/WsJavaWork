package entidad;

import java.util.HashMap;
import java.util.Scanner;

public class ListaNumerosTelefono {

	public static void main(String[] args) {
		HashMap<String, String> listin = new HashMap<>();
		Scanner sc = new Scanner(System.in);

		System.out.println("LISTÍN NÚMEROS TELÉFONO");
		System.out.println("-----------------------");

		for (int i = 0; i < 5; i++) {
			System.out.print("Introduce el nombre " + (i + 1) + ": ");
			String nombre = sc.nextLine();
			System.out.print("Introduce el número " + (i + 1) + ": ");
			String numero = sc.nextLine();
			System.out.println("");

			listin.put(nombre, numero);
		}

		System.out.println("");
		System.out.println("Pulsa enter para mostrar la lista de teléfonos: ");
		sc.nextLine();

		listin.forEach((k, v) -> {
			System.out.print("- Nombre: " + k);
			System.out.println(" - Nº Teléfono: " + v);
		});

	}

}
