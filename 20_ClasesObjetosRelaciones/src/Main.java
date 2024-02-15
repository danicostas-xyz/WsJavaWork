
public class Main {
	// Habrá que crear otra clase que ejecute el programa principal y cree 2
	// empresas diferentes con 3 trabajadores cada una. Las empresas se meterán en
	// un array.

	// A continuación debemos de invocar todos sus métodos y observar los diferentes
	// resultados.

	// Tendremos que invocar los métodos recorriendo el array de empresas con un
	// bucle, no podemos invocar los métodos fuera de dicho bucle.

	public static void main(String[] args) {

		// Creamos empresa Coca-Cola
		Company cocaCola = new Company("Coca-Cola", "B86561412", new Worker[3]);
		cocaCola.workers[0] = new Worker("Dani Costas", "53698785L", 3505.47);
		cocaCola.workers[1] = new Worker("Marcos del Saz", "58693658M", 1500.85);
		cocaCola.workers[2] = new Worker("Félix de Pablo", "05698574P", 5800.25);

		// Creamos empresa Upgrade Hub
		Company upgradeHub = new Company("Upgrade Hub", "B88134622", new Worker[3]);
		upgradeHub.workers[0] = new Worker("Piero Santana", "87309892F", 4587.36);
		upgradeHub.workers[1] = new Worker("Guillermo Magro", "09345768R", 1040.95);
		upgradeHub.workers[2] = new Worker("Carlos Gómez", "09765432W", 1200.35);

		// Creamos array de Empresas y asociamos a sus dos posiciones las empresas
		// creadas previamente
		Company[] arrayCompanies = new Company[2];
		arrayCompanies[0] = cocaCola;
		arrayCompanies[1] = upgradeHub;

		// Invocamos los métodos de los objetos con un bucle que itera el array de
		// empresas arrayCompanies
		
		

	}

}
