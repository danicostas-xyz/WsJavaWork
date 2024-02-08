import java.util.Scanner;

public class _05_ReemplazoCaracteres {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("REEMPLAZO DE CARACTERES");
		System.out.println("-----------------------");

		String cadena = _00_Funciones.solicitaCadena();

		System.out.println("");
		System.out.print("Inserta el carácter que quieres reemplazar: ");
		String caracterAReemplazar = sc.nextLine();
		System.out.print("Inserta el nuevo carácter: ");
		String caracterNuevo = sc.nextLine();

		String cadenaNueva = cadena.replace(caracterAReemplazar, caracterNuevo);

		System.out.println("Texto nuevo: " + cadenaNueva);

	}

}
