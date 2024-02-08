
public class _04_EjercicioInteresSimple {

	public static void main(String[] args) {
		double capitalInicial = 10_000.50;
		double tasaDiaria = 0.04 / 365; // Interés: 4% TAE diarizado
		int dias = 365;
		double interes = calculoInteres (capitalInicial, tasaDiaria, dias);
		
		System.out.println(interes);
				
	}
	
	public static double calculoInteres(double arg, double arg2, int arg3) {
		return arg * arg2 * arg3;
	}

}
