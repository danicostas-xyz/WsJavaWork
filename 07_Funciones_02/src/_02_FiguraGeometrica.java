
public class _02_FiguraGeometrica {

	public static void main(String[] args) {
		double radio = 6.59;
		double areaCirculo = calculoArea(radio);
		System.out.println("Radio Círculo = " + radio);
		System.out.println("Área Círculo = " + areaCirculo);

		System.out.println("");

		double areaCuadrado = calculoArea(10.50, 45.65, 4);
		System.out.println("Área cuadrado = " + areaCuadrado);

		double areaTriangulo = calculoArea(54.78, 100, 3);
		System.out.println("Área triángulo = " + areaTriangulo);
	}

	public static double calculoArea(double base, double altura, int lados) {

		double area = 0;
		if (lados == 3) {
			area = (base * altura) / 2;
		} else if (lados == 4) {
			area = base * altura;
		}

		return area;
	}

	public static double calculoArea(double radio) {

		final double PI = 3.14159265358979323;
		double area = PI * (radio * radio);
		return area;
	}

	/*
	 * [COMENTARIO DE CHATGPT SOBRE EL CÓDIGO]:
	 * 
	 * El código proporcionado es un programa en Java que calcula áreas de
	 * diferentes figuras geométricas (círculo, cuadrado y triángulo) utilizando
	 * métodos sobrecargados.
	 * 
	 * Aquí están algunas observaciones sobre el código:
	 * 
	 * - Nombres de Clase y Métodos: Los nombres de las clases y los métodos están
	 * en español y siguen una convención de nomenclatura adecuada. Sin embargo,
	 * generalmente se recomienda usar nombres en inglés para facilitar la
	 * comprensión y colaboración con programadores de diferentes partes del mundo.
	 * 
	 * - Uso de Sobrecarga de Métodos: El programa hace un buen uso de la sobrecarga
	 * de métodos. Esto significa que hay dos métodos con el mismo nombre
	 * (calculoArea), pero con diferentes listas de parámetros. Esto es válido en
	 * Java y permite que se utilice el mismo nombre de método para realizar tareas
	 * similares pero en contextos diferentes.
	 * 
	 * - Constante PI: El valor de PI está definido como una constante (final double
	 * PI = 3.14159265358979323;). Esto es una buena práctica ya que PI es un valor
	 * constante y no debería cambiar durante la ejecución del programa.
	 * 
	 * - Manejo de Casos: El método calculoArea que toma tres argumentos (base,
	 * altura y lados) está diseñado para manejar tanto cuadrados como triángulos.
	 * Sin embargo, si se pasa un valor de lados diferente de 3 o 4, la función
	 * devuelve 0. Sería buena idea agregar algún tipo de manejo de error o mensaje
	 * de advertencia si se pasa un valor de lados que no sea válido.
	 * 
	 * - Salida a Consola: El programa imprime los resultados en la consola, lo cual
	 * es útil para verificar los cálculos.
	 * 
	 * - Uso de Comentarios: El código no contiene comentarios, lo que puede hacer
	 * que sea más difícil de entender para alguien que no esté familiarizado con el
	 * código.
	 * 
	 * - En general, el código parece estar bien estructurado y hace un buen uso de
	 * los conceptos de programación en Java. Sin embargo, siempre es recomendable
	 * agregar comentarios para explicar el propósito de cada método y cualquier
	 * consideración importante en el código. Además, se puede considerar agregar
	 * manejo de errores para casos inesperados.
	 */

}
