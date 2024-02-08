import java.util.Scanner;

public class _00_Funciones {

	static Scanner sc = new Scanner(System.in);

	public static String solicitaCadena() {
		System.out.println("Introduce una cadena de texto");
		String cadena = sc.nextLine();
		return cadena;
	}

}
