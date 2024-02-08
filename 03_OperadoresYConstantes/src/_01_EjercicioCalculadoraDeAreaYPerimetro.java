
public class _01_EjercicioCalculadoraDeAreaYPerimetro {

	public static void main(String[] args) {

		// Declaro las variables longitud y ancho y en base a ellas asigno a las
		// variables área y perímetro un valor retornado de las funciones creadas más
		// abajo para el cálculo de dichas unidades.

		// RECTÁNGULO 1
		
		int longitudRectangulo = 30;
		int anchoRectangulo = 15;
		int areaRectangulo = areaRectangulo(longitudRectangulo, anchoRectangulo);
		int perimetroRectangulo = perimetroRectangulo(longitudRectangulo, anchoRectangulo);

		System.out.println("RECTÁNGULO 1:");
		System.out.println("Para un rectángulo de longitud " + longitudRectangulo + " metros y ancho " + anchoRectangulo
				+ " metros:");
		System.out.println("- Área: " + areaRectangulo + "m2");
		System.out.println("- Perímetro: " + perimetroRectangulo + " metros");
		System.out.println("");
		
		// RECTÁNGULO 2
		
		longitudRectangulo = 534;
		anchoRectangulo = 232;
		areaRectangulo = areaRectangulo(longitudRectangulo, anchoRectangulo);
		perimetroRectangulo = perimetroRectangulo(longitudRectangulo, anchoRectangulo);
		
		System.out.println("RECTÁNGULO 2:");
		System.out.println("Para un rectángulo de longitud " + longitudRectangulo + " metros y ancho " + anchoRectangulo
				+ " metros:");
		System.out.println("- Área: " + areaRectangulo + "m2");
		System.out.println("- Perímetro: " + perimetroRectangulo + " metros");
		System.out.println("");
		
	}

	// Defino las funciones para el cálculo de area y perímetro.

	public static int areaRectangulo(int longitud, int ancho) {
		return longitud * ancho;
	}

	public static int perimetroRectangulo(int longitud, int ancho) {
		return (2 * (longitud + ancho));
	}
}
