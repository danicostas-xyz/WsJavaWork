import java.util.Scanner;

public class _03_ExtraccionSubcadena {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("EXTRACCIÓN DE SUBCADENA");
		System.out.println("-----------------------");

		String cadena = _00_Funciones.solicitaCadena();

		System.out.println("Introduce el índice donde quieres empezar a cortar y el índice donde quieres parar");
		System.out.println("NOTA: El primer carácter empieza en 0");
		System.out.print("Índice 1: ");
		int indice1 = sc.nextInt();
		System.out.print("Índice 2: ");
		int indice2 = sc.nextInt();

		String subcadena = cadena.substring(indice1, (indice2 + 1));

		System.out.println(subcadena);
	}

}
