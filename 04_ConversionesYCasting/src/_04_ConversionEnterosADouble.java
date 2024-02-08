
public class _04_ConversionEnterosADouble {

	public static void main(String[] args) {
		int numeroEntero = 678;
		double numeroDouble = (double) numeroEntero;
		
		System.out.println(numeroDouble);
		
		// En este caso no hace falta hacer un casting y no perdemos información.
		// Sin embargo, si hacemos una división de ints que den decimales, sí que es interesante arrojar un dato double casteando el resultado.
		
		// Aquí vemos que el resultado es 75, aún cuando el resultado real es 75.33333
		int resultado = numeroEntero / 9;
		System.out.println(resultado);
		
		// En este caso, aunque estamos asignando a un dato double la división, el resultado es 75.0 porque no estamos casteando la expresión numeroEntero / 9
		double resultadoDouble = numeroEntero / 9;
		System.out.println(resultadoDouble);
		
		// En este caso, al castear a double numeroEntero, se asigna a resultadoDouble el resultado correcto: 75.33333
		resultadoDouble = (double) numeroEntero / 9;
		System.out.println(resultadoDouble);

	}

}
