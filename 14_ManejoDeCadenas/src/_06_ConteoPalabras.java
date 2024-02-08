
public class _06_ConteoPalabras {

	public static void main(String[] args) {
		System.out.println("CONTEO DE PALABRAS");
		System.out.println("------------------");

		String cadena = _00_Funciones.solicitaCadena();

		String[] palabrasCadena = cadena.split(" ");

		int numeroPalabras = palabrasCadena.length; // Método length array no lleva paréntesis.
		int numeroCaracteres = cadena.length(); // Nótese que el método length del string es con paréntesis();

//		habría que recorrer el array que devuelve el split para hacer un if y si no i no es igual a espacio, entonces se cuenta la palabra
		
		System.out.println("Número de palabras introducidas: " + numeroPalabras);
		System.out.println("Número de caracteres: " + numeroCaracteres);

	}

}
