
public class _07_CadenasAEntero {

	public static void main(String[] args) {
		String nombre = "Daniel Costas";
		// int nombreInt = (int) nombre; NO ES POSIBLE HACER UN CASTING DE STRING A INT.
		// (Además de que no tiene sentido).

		int numero = 896;

		// Sin embargo, sí podemos pasar de int a string utilizando el método toString()
		// de la clase Integer, que está codificada en java.lang
		String numeroString = Integer.toString(numero);
		System.out.println(numeroString);

		// int resultado = numero + numeroString; AQUÍ COMPROBAMOS QUE NO SE PUEDE HACER
		// LA SUMA PORQUE NUMERO ES UN INT Y NUMEROSTRING, AUNQUE ES UN NÚMERO, ES UN
		// STRING
	}

}
