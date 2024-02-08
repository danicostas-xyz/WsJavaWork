
public class _07_InversionCadenas {
	public static void main(String[] args) {
		System.out.println("INVERSIÓN DE CADENAS");
		System.out.println("--------------------");

		String cadena = _00_Funciones.solicitaCadena();
		StringBuilder cadenaInvertida = new StringBuilder();

		for (int i = cadena.length() - 1; i >= 0; i--) {
			cadenaInvertida.append(cadena.charAt(i));
		}

		System.out.println(cadenaInvertida);
	}

	/*
	 * En este caso estaba haciendo el bucle para hacer un syso del resultado, pero
	 * quería almacenarlo en algún sitio. Probé con el String, haciendo un String
	 * nuevo y dándole como valor el charAt(i) en cada iteración, pero no
	 * funcionaba. Así que pregunto a chatGPT y me dice que hay una clase llamada
	 * StringBuilder que permite construir Strings de forma dinámica y modificarlo.
	 * 
	 * Correcto, StringBuilder y String son dos clases diferentes en Java. La
	 * principal diferencia radica en su mutabilidad.
	 * 
	 * String es inmutable, lo que significa que no se puede modificar después de
	 * haberse creado. Cualquier operación que parezca modificar una cadena en
	 * realidad crea una nueva cadena.
	 * 
	 * StringBuilder es mutable, lo que significa que puedes modificar el contenido
	 * sin crear un nuevo objeto en cada operación. Es más eficiente cuando
	 * necesitas realizar muchas operaciones de concatenación o modificación en una
	 * cadena.
	 * 
	 * En el ejemplo anterior, se utiliza StringBuilder para construir la cadena
	 * invertida de manera eficiente. Una vez que se ha invertido la cadena, se
	 * puede obtener el resultado final llamando al método toString() de
	 * StringBuilder, que devuelve una instancia de String. Esto permite almacenar y
	 * manipular la cadena invertida como un objeto de tipo String.
	 */
}
