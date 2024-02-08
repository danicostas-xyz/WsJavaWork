import java.util.Scanner;

public class _07_CalculoDescuentoCompra {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¡BIENVENIDO AL PANEL DE OFERTAS DE CARREFOUR+!");
		System.out.println("----------------------------------------------");
		System.out.print("Introduce el importe de tu última compra para verificar si entra en la promoción: ");
		double importe = sc.nextDouble();
		System.out.println("Tu última compra ha sido de " + importe
				+ "€. Pulsa enter para comprobar si tienes derecho a descuento.");
		sc.nextLine();
		sc.nextLine();
		calculoDescuento(importe);
	}

	public static void calculoDescuento(double importe) {
		double porcentajeDescuento = 0;
		String cadenaDescuento = "";

		if (importe >= 100) {
			porcentajeDescuento = 0.10;
			cadenaDescuento = "10%";
		} else if (importe < 100 && importe >= 50) {
			porcentajeDescuento = 0.05;
			cadenaDescuento = "5%";
		}

		double cantidadDescuento = importe * porcentajeDescuento;
		double precioFinal = importe - cantidadDescuento;

		if (importe >= 50) {
			System.out.println("¡Felicidades! Tu compra tiene derecho a descuento.");
			System.out.println("- Importe sin descuento: " + importe + "€");
			System.out.println("- Descuento: " + cadenaDescuento + " = " + cantidadDescuento + "€");
			System.out.println("- Importe final: " + importe + " - " + cantidadDescuento + " = " + precioFinal + "€");
		} else {
			System.out.println(
					"Lo sentimos, no has llegado al mínimo necesario para aplicar un descuento... ¡Esperamos verte pronto!");
		}
	}
}
