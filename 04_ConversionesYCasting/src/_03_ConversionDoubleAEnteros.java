
public class _03_ConversionDoubleAEnteros {

	public static void main(String[] args) {
		double numeroDouble = 78.098237234;
		int numeroEntero = (int) numeroDouble;

		System.out.println(numeroEntero);

		// De la misma manera que en la conversión de float a int perdíamos información,
		// casteando un double para tener un dato int también perdemos información. Como
		// int no admite decimales, perdemos el 0.98 del dato double.

		// Además, en este caso estamos pasando de un dato double, que tiene 64 bits, a
		// uno int, que tiene 32 bits, por lo que aunque el double no tuviese decimales,
		// podría darse la situación de que sobrepase el límite de capacidad de 32 bits
		// del int y ocasione un "integer overflow"

	}

}
