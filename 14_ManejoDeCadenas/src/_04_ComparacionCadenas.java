import java.util.Scanner;

public class _04_ComparacionCadenas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("COMPARACIÓN DE CADENAS");
		System.out.println("----------------------");

		System.out.println("");
		System.out.print("Usuario: ");
		String usuario = (sc.nextLine()).trim();
		System.out.print("Password: ");
		String password = (sc.nextLine()).trim();

		boolean acceso = false;
		if (usuario.equalsIgnoreCase("Capi") && password.equals("odioAironMan69")) {
			acceso = true;
			System.out.println("Bienvenido a nuestro programa, Capi");
		}

		int intentos = 3;
		while (!acceso) {
			intentos--;
			if (intentos > 0) {
				System.out.println("Usuario y/o password incorrectos, vuelva a intentarlo");
				System.out.print("Usuario: ");
				usuario = sc.nextLine();
				System.out.print("Password: ");
				password = sc.nextLine();
			} else {
				System.out.println("Has introducido mal los datos 3 veces. Usuario bloqueado.");
				break;
			}
		}
	}

}
