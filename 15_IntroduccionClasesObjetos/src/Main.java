
public class Main {

	public static void main(String[] args) {
		
		// Instanciamos el primer coche: Ferrari F40
		Coche ferrariF40 = new Coche();
		
		ferrariF40.marca = "Ferrari";
		ferrariF40.modelo = "F40";
		ferrariF40.matricula = "3592 BS";
		ferrariF40.peso = 1100;
		ferrariF40.antiguedad = 37;
		ferrariF40.esElectrico = false;
		
		// Instanciamos el segundo coche: Tesla CyberTruck
		Coche cybertruck = new Coche();
		
		cybertruck.marca = "Tesla";
		cybertruck.modelo = "CyberTruck";
		cybertruck.matricula = "8810 MMX";
		cybertruck.peso = 2000;
		cybertruck.antiguedad = 1;
		cybertruck.esElectrico = true;
		
		// Instanciamos el tercer coche: Porsche Panamera GTS
		Coche panameraGTS = new Coche();
		
		panameraGTS.marca = "Porsche";
		panameraGTS.modelo = "Panamera GTS";
		panameraGTS.matricula = "5465 LPY";
		panameraGTS.peso = 2095;
		panameraGTS.antiguedad = 3;
		panameraGTS.esElectrico = false;
		
		System.out.println("---------------------------");
		imprimirCoche(ferrariF40);
		System.out.println("---------------------------");
		imprimirCoche(cybertruck);
		System.out.println("---------------------------");
		imprimirCoche(panameraGTS);
		System.out.println("---------------------------");
		
		
	}

	public static void imprimirCoche (Coche coche) {
		System.out.println("- Marca: " + coche.marca);
		System.out.println("- Modelo: " + coche.modelo);
		System.out.println("- Matrícula: " + coche.matricula);
		System.out.println("- Peso: " + coche.peso + "kg");
		System.out.println("- Antigüedad: " + coche.antiguedad + " años");
		System.out.println((coche.esElectrico) ? "Coche Eléctrico" : "Coche No Eléctrico");
	}
}
