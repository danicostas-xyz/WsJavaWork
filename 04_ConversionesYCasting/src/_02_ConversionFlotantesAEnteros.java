
public class _02_ConversionFlotantesAEnteros {

	public static void main(String[] args) {
		float numeroFloat = 98.920F;
		int numeroEntero = (int) numeroFloat;

		System.out.println(numeroEntero);

		// Puede ser necesario hacer un casting en este caso si queremos trabajar con
		// números enteros en lugar de con floats, pero en este caso perdemos
		// información, porque un número int no tiene decimales ni redondea y al hacer
		// casting de 98.92 nos da como resultado 98, con lo que perdemos el 0.92
		// restante que es una cantidad significativa como para ser obviada.

	}

}
