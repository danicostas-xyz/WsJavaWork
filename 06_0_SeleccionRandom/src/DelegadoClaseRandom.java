import java.util.Scanner;

public class DelegadoClaseRandom {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String [] chicosDaw = {"Chico1", "Chico2", "Chico3", "Chico4", "Chico5"};
		String [] chicasDaw = {"Chica1", "Chica2", "Chica3", "Chica4", "Chica5"};
		
		String [] chicosDam = {"Chico1", "Chico2", "Chico3", "Chico4", "Chico5"};
		String [] chicasDam = {"Chica1", "Chica2", "Chica3", "Chica4", "Chica5"};
		
		double numeroRandomChicosDaw = chicosDaw.length * Math.random();
		numeroRandomChicosDaw = Math.floor(numeroRandomChicosDaw);
		
		double numeroRandomChicasDaw = chicasDaw.length * Math.random();
		numeroRandomChicasDaw = Math.floor(numeroRandomChicasDaw);
		
		double numeroRandomChicosDam = chicosDam.length * Math.random();
		numeroRandomChicosDam = Math.floor(numeroRandomChicosDam);
		
		double numeroRandomChicasDam = chicasDam.length * Math.random();
		numeroRandomChicasDam = Math.floor(numeroRandomChicasDam);
		
		double numeroRandom2 = 1 * Math.random();
		
		String delegadoDaw;
		String subdelegadoDaw;
		String delegadoDam;
		String subdelegadoDam;
		
		if(numeroRandom2 < 0.5) {
			delegadoDaw = chicosDaw[(int)numeroRandomChicosDaw];
			subdelegadoDaw = chicasDaw[(int)numeroRandomChicasDaw];
			delegadoDam = chicosDam[(int)numeroRandomChicosDaw];
			subdelegadoDam = chicasDam[(int)numeroRandomChicasDaw];
		}else {
			delegadoDaw = chicasDaw[(int)numeroRandomChicasDaw];
			subdelegadoDaw = chicosDaw[(int)numeroRandomChicosDaw];
			delegadoDam = chicasDam[(int)numeroRandomChicasDaw];
			subdelegadoDam = chicosDam[(int)numeroRandomChicosDaw];
		}
		
		System.out.println("Pulsa enter para saber quién es el delegado de DAW");
		sc.nextLine();
		System.out.println("Delegado: " + delegadoDaw);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para saber quién es el subdelegado de DAW");
		sc.nextLine();
		System.out.println("Subdelegado: " + subdelegadoDaw);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para saber quién es el delegado de DAM");
		sc.nextLine();
		System.out.println("Delegado: " + delegadoDam);
		
		System.out.println("");
		
		System.out.println("Pulsa enter para saber quién es el subdelegado de DAM");
		sc.nextLine();
		System.out.println("Subdelegado: " + subdelegadoDam);

	}

}
