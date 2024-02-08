import java.util.Scanner;

public class _04_CategoriaEdad {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce tu edad");
		int numero = sc.nextInt();
		String edad = rangoEdad(numero);
		System.out.println("Tienes " + numero + " años, por lo que eres un " + edad);

	}

	public static String rangoEdad(int n1) {
		String edad = "";

		if (n1 >= 0 && n1 <= 12) {
			edad = "Niño";
		} else if (n1 >= 13 && n1 <= 19) {
			edad = "Adolescente";
		} else if (n1 >= 20 && n1 <= 64) {
			edad = "Adulto";
		} else if (n1 >= 65) {
			edad = "Adulto Mayor";
		}

		return edad;
	}

}
