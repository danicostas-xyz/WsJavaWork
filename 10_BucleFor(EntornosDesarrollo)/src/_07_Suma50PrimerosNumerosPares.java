
public class _07_Suma50PrimerosNumerosPares {

	public static void main(String[] args) {
		
		int suma = 0;
		
		for (int i = 2; i <= 50; i += 2) {
			suma += i;	
			System.out.println(i);
		}
		System.out.println("Total: " + suma);
	}
}
