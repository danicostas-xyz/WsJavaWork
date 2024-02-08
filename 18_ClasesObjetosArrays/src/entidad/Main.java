package entidad;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos el array de usuarios
		Usuario[] arrayUsuarios = new Usuario[3];

		// Creamos las tres instancias de Usuario dentro del array de Usuarios
		arrayUsuarios[0] = new Usuario();
		arrayUsuarios[1] = new Usuario();
		arrayUsuarios[2] = new Usuario();

		// Pedimos los datos para asociarlos a los objetos creados arriba
		pideDatosUsuario(arrayUsuarios[0], sc);
		sc.nextLine();
		System.out.println("-----------------");
		pideDatosUsuario(arrayUsuarios[1], sc);
		sc.nextLine();
		System.out.println("-----------------");
		pideDatosUsuario(arrayUsuarios[2], sc);
		System.out.println("-----------------");

		for (int i = 0; i < arrayUsuarios.length; i++) {
			System.out.println("Valoraciones de " + arrayUsuarios[i].nombre + ": ");
			arrayUsuarios[i].printValoraciones();
			System.out.println("");

			System.out.println("Promedio de valoraciones: " + arrayUsuarios[i].promedioValoraciones());
			System.out.println("");

			System.out.println("Introduce una nota para ver si es superior a la media: ");
			int nota = sc.nextInt();
			System.out.println(((arrayUsuarios[i].notaEsMayorQueMedia(nota))) ? nota + "Es superior a la media"
					: nota + "Es inferior a la media");
			System.out.println("");

			System.out.println("La nota introducida (" + nota + ") es superior a "
					+ arrayUsuarios[i].contadorNotasMasAltasQue(nota) + " valoraciones reales");

		}

	}

	public static void pideDatosUsuario(Usuario usuario, Scanner sc) {
		System.out.println("Introduce los datos del usuario: ");
		System.out.print("- ID: ");
		usuario.id = sc.nextLine();
		System.out.println("- Nombre: ");
		usuario.nombre = sc.nextLine();
		usuario.valoraciones = new int[3];
		System.out.println("- Introduce la primera valoración: ");
		usuario.valoraciones[0] = sc.nextInt();
		System.out.println("- Introduce la segunda valoración: ");
		usuario.valoraciones[1] = sc.nextInt();
		System.out.println("- Introduce la tercera valoración: ");
		usuario.valoraciones[2] = sc.nextInt();
	}

}
