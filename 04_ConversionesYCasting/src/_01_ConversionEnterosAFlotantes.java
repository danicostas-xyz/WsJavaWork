
public class _01_ConversionEnterosAFlotantes {

	public static void main(String[] args) {
		int numeroEntero = 89;
		float numeroFloat = (int) numeroEntero;

		System.out.println(numeroFloat);

		// En este caso hacer un casting no tiene demasiado sentido porque un número
		// entero casteado a float siempre va a dar 0 como primer y único decimal,
		// porque los números enteros no tienen decimales.

		// Sin embargo, si hacemos una operación con dos int que dé como resultado un
		// número con decimales, sí que puede ser interesante castear la expresión en un
		// float.
		
		
		int numeroEntero2 = 7;
		System.out.println(numeroEntero / numeroEntero2);
		// 89 / 7 = 12.7142857142... Aquí se arroja como resultado 12 porque en int no hay decimales.
		
		float resultado = numeroEntero / numeroEntero2; 
		System.out.println(resultado); 
		// Aunque asignamos a un float la división, no se muestran los decimales porque se hace la operación con dos números int.
		
		float resultado2 = (float) numeroEntero / (float) numeroEntero2;
		System.out.println(resultado2);
		// Aquí sí que obtenemos el resultado correcto porque primero casteamos los dos datos int a float y luego los dividimos.

	}

}
