
public class _02_MayusMinus {

	public static void main(String[] args) {
		System.out.println("MAYÚSCULAS Y MINÚSCULAS");
		System.out.println("-----------------------");

		String cadena = _00_Funciones.solicitaCadena();

		String cadenaMayus = cadena.toUpperCase();
		String cadenaMinus = cadena.toLowerCase();

		System.out.println("Cadena en mayúsculas: " + cadenaMayus);
		System.out.println("Cadena en minúsculas: " + cadenaMinus);

	}

}
