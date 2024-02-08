package _01_While;

public class _04_Suma100PrimerosNumeros {

	public static void main(String[] args) {
		
		int i = 1;
		int acumulado = 0;
		
		System.out.println("Suma de los primeros 100 números");
		
		while (i <= 100) {
			acumulado += i;
			System.out.println(i);
			i++;
		}
		
		System.out.print("Total: " + acumulado);

	}

}
