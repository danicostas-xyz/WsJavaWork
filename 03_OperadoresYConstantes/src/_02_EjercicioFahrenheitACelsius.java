
public class _02_EjercicioFahrenheitACelsius {

	public static void main(String[] args) {
		
		double fahrenheit = 75.5;
		double celsius = fahrenheitACelsius(fahrenheit);
		
		System.out.println("CONVERSIÓN DE FAHRENHEIT A CELSIUS:");
		System.out.println("La temperatura " + fahrenheit + "ºF equivale a " + celsius + "ºC");
	}
	
	public static double fahrenheitACelsius(double temperatura) {
		return (temperatura - 32) * 5 / 9;
	}

}
