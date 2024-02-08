import java.util.Scanner;

public class _09_ConteoCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("CONTEO CARACTERES");
		System.out.println("-----------------");

		String cadena = _00_Funciones.solicitaCadena();

		System.out.println("Qué caracter quieres contar?");
		char seleccionUsuario = (sc.nextLine()).charAt(0);

		// Más abajo, en el for donde comparo la selección del
		// usuario en cada iteración del bucle que recorre el String
		// con el caracter del String en la posición (i), necesito
		// tener un caracter. Si aquí creo un String luego no lo
		// puedo comparar abajo con el caracter, porque
		// string.charAt(i) me devuelve un char. Y aquí no hay
		// ningún método del scanner que me devuelva un char, por lo
		// que la solución es crear un char cuyo valor sea
		// sc.nextLine(), que devuelve un String, al cual le pasamos
		// el método charAt()

		int acumulador = 0;
		for (int i = 0; i < cadena.length(); i++) {

			if (seleccionUsuario == cadena.charAt(i)) {
				acumulador++;
			}
		}

		System.out.println("El caracter " + seleccionUsuario + " se repite " + acumulador + " veces.");

	}

}
