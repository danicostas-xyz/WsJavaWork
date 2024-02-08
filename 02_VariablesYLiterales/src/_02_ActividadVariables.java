
/* # Comentarios sobre el ejercicio:
 * 
 * - Ya sé que no hemos visto ni las estructuras de control ni las funciones
 * pero quería hacer un código que cambiase las variables en base a una función
 * y no cambiarlas directamente en el código. 
 * Sé hacerlo más o menos porque es parecido a JavaScript.
 * 
 * - Primero creo 3 variables distintas de los tipos que hemos visto.
 * - Luego, hago el experimento con funciones y else-if
 * 
 * - Empecé declarando las variables dentro del main y la función miFunción
 * también dentro, pero comprobé que no se puede declarar una función dentro
 * del main, así que la llevé fuera.
 * 
 * - Luego, con la función fuera, quería llamar a las variables que estaban
 * dentro del main, pero no funcionaba. Eclipse me decía que para eso tenía
 * que ponerles el modificador static.
 * 
 * - Pero después entendí que lo mejor era declarar las variables directamente
 * en la funcion miFuncion, para no tener que utilizar el modificador static.
 * 
 * - Finalmente, otro error que he tenido ha sido en el else-if, que me iba
 * siempre por el camino del else, porque en vez de poner arg == false 
 * estaba usando el operador de asignación (arg = false).
 * 
 * 
 * */

public class _02_ActividadVariables {

	public static void main(String[] args) {

		// EJEMPLOS DE VARIABLES:

		// int

		int numero1 = 60;
		int numero2 = 56;
		int numero3 = 67;

		System.out.println("- SUMA DE NÚMEROS ENTEROS:");
		System.out.print(numero1 + " + " + numero2 + " + " + numero3 + " = ");
		System.out.println(numero1 + numero2 + numero3);

		// long

		long numeroGrande1 = 902234L;
		long numeroGrande2 = 2323948723L;
		long numeroGrande3 = 2234273L;

		System.out.println("- SUMA DE NÚMEROS GRANDES: ");
		System.out.print(numeroGrande1 + " + " + numeroGrande2 + " + " + numeroGrande3 + " = ");
		System.out.println(numeroGrande1 + numeroGrande2 + numeroGrande3);
		System.out.println();

		// float

		float numeroDecimalPequenho1 = 1.45F;
		float numeroDecimalPequenho2 = 7.45F;
		float numeroDecimalPequenho3 = 1.005F;

		System.out.println("- SUMA DE NÚMEROS DECIMALES PEQUEÑOS: ");
		System.out.print(numeroDecimalPequenho1 + " + " + numeroDecimalPequenho2 + " + " + numeroDecimalPequenho3 + " = ");
		System.out.println(numeroDecimalPequenho1 + numeroDecimalPequenho2 + numeroDecimalPequenho3);
		System.out.println();

		// double

		double numeroDecimalGrande1 = 197.34534;
		double numeroDecimalGrande2 = 10.409203402;
		double numeroDecimalGrande3 = 122_234.389232;

		System.out.println("- SUMA DE NÚMEROS DECIMALES GRANDES: ");
		System.out.print(numeroDecimalGrande1 + " + " + numeroDecimalGrande2 + " + " + numeroDecimalGrande3 + " = ");
		System.out.println(numeroDecimalGrande1 + numeroDecimalGrande2 + numeroDecimalGrande3);
		System.out.println();

		// string

		String nombre1 = "Daniel";
		String apellido1 = "Costas";
		String apellido2 = "Rodríguez";

		System.out.println("- NOMBRE COMPLETO:");
		System.out.println(nombre1 + " " + apellido1 + " " + apellido2);
		System.out.println();

		// boolean

		boolean hombre = true;
		boolean espanhol = true;
		boolean dam = false;

		System.out.println("- CARACTERÍSTICAS:");
		System.out.println("· Hombre = " + hombre);
		System.out.println("· Español = " + espanhol);
		System.out.println("· DAM = " + dam);
		System.out.println();

		// byte

		byte byte1 = 8;
		byte byte2 = 16;
		byte byte3 = 32;

		System.out.println("- BYTES:");
		System.out.println(byte1 + " " + byte2 + " " + byte3);
		System.out.println();

		// char

		char caracter1 = 'a';
		char caracter2 = 'b';
		char caracter3 = 'c';

		System.out.println("- CARACTERES:");
		System.out.println(caracter1 + " " + caracter2 + " " + caracter3);
		System.out.println();
		
		// Experimento con funciones y else - if, cambiando el valor de variables

		String trabajador = miFuncion(false);
		System.out.println(trabajador);

		trabajador = miFuncion(true);
		System.out.println(trabajador);

	}

	public static String miFuncion(boolean arg) {

		int numeroEmpleado = 82326;
		String nombre = "Daniel Costas";
		double salario;
		boolean ett;
		String tipoContrato;
		String resultado;

		// Creo un if - else para asignar las variables salario, resultado, ett y
		// tipoContrato en función del valor de arg.

		if (arg == false) {
			ett = false;
			salario = 1000.50;
			tipoContrato = "indefinido";
			resultado = "ETT = " + ett + " | Empleado: " + nombre + ". Número empleado: " + numeroEmpleado
					+ ". Contrato " + tipoContrato + ". Salario: " + salario;
		} else {
			ett = true;
			salario = 900.50;
			tipoContrato = "temporal";
			resultado = "ETT = " + ett + " | Empleado: " + nombre + ". Número empleado: " + numeroEmpleado
					+ ". Contrato " + tipoContrato + ". Salario: " + salario;
		}

		return resultado;
	}

}
