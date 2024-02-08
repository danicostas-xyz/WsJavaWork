
public class _01_Calculadora {

	public static void main(String[] args) {
		int resultado1 = suma(1, 5);
		System.out.println(resultado1);

		double resultado2 = suma(5.989, resultado1);
		System.out.println(resultado2);

		int resultado3 = resta(10, 5);
		System.out.println(resultado3);

		double resultado4 = resta(resultado2, resultado3);
		System.out.println(resultado4);

		int resultado5 = multiplicacion(resultado1, resultado3);
		System.out.println(resultado5);

		double resultado6 = multiplicacion(resultado4, resultado1);
		System.out.println(resultado6);

		int resultado7 = division(1000, resultado5);
		System.out.println(resultado7);

		double resultado8 = division(6.090875643, resultado2);
		System.out.println(resultado8);

	}

	public static int suma(int n1, int n2) {
		int resultado = n1 + n2;
		return resultado;
	}

	public static double suma(double n1, double n2) {
		double resultado = n1 + n2;
		return resultado;
	}

	public static int resta(int n1, int n2) {
		int resultado = n1 - n2;
		return resultado;
	}

	public static double resta(double n1, double n2) {
		double resultado = n1 - n2;
		return resultado;
	}

	public static int multiplicacion(int n1, int n2) {
		int resultado = n1 * n2;
		return resultado;
	}

	public static double multiplicacion(double n1, double n2) {
		double resultado = n1 * n2;
		return resultado;
	}

	public static int division(int n1, int n2) {
		int resultado = n1 / n2;
		return resultado;
	}

	public static double division(double n1, double n2) {
		double resultado = n1 / n2;
		return resultado;
	}

	/*
	 * [COMENTARIO DE CHATGPT SOBRE EL CÓDIGO]:
	 * 
	 * Este código es una implementación de una calculadora en Java. A continuación,
	 * se presentan algunos comentarios sobre el código:
	 * 
	 * 1. **Nombres de Clase y Métodos**: Los nombres de la clase
	 * (`_01_Calculadora`) y los métodos siguen una convención de nomenclatura
	 * adecuada. Sin embargo, es preferible utilizar nombres en inglés para mejorar
	 * la legibilidad y la colaboración.
	 * 
	 * 2. **Uso de Sobrecarga de Métodos**: El programa hace un buen uso de la
	 * sobrecarga de métodos para permitir operaciones tanto con enteros como con
	 * números de punto flotante.
	 * 
	 * 3. **Operaciones Matemáticas**: El código implementa las operaciones
	 * matemáticas comunes: suma, resta, multiplicación y división.
	 * 
	 * 4. **Manejo de Tipos de Datos**: El código maneja diferentes tipos de datos
	 * (enteros y números de punto flotante) adecuadamente al definir versiones
	 * sobrecargadas de los métodos para cada tipo.
	 * 
	 * 5. **Salida a Consola**: El programa imprime los resultados en la consola, lo
	 * cual es útil para verificar los cálculos.
	 * 
	 * 6. **Manejo de División Entera**: En la versión de `division(int n1, int
	 * n2)`, si `n2` es cero, esto podría causar una excepción de división por cero.
	 * Sería buena idea agregar un manejo de error para evitar esto.
	 * 
	 * 7. **División de Punto Flotante**: En la versión de `division(double n1,
	 * double n2)`, ten en cuenta que en casos de división por cero con números de
	 * punto flotante, el resultado puede ser "Infinity" o "NaN". Podrías querer
	 * agregar manejo de errores para estos casos.
	 * 
	 * 8. **Comentarios**: Aunque el código es relativamente sencillo, agregar
	 * comentarios explicativos sobre el propósito de cada método podría ser útil
	 * para alguien que revisa el código en el futuro.
	 * 
	 * En general, el código es limpio y bien organizado, y cumple su función de ser
	 * una calculadora funcional. Sin embargo, consideraría agregar manejo de
	 * errores para divisiones por cero y considerar la posibilidad de agregar
	 * comentarios para mejorar la comprensión del código.
	 */

}