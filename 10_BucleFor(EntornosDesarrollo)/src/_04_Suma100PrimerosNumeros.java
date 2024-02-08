
public class _04_Suma100PrimerosNumeros {

	public static void main(String[] args) {
		int suma = 0;
		for (int i = 1; i <= 100; i++) {
			
			suma += i;
			System.out.println(i);
		}
		
		System.out.println("= " + suma);
	}

}
