package entidad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		// Instancia del primer coche con el constructor por defecto, modificando los datos manualmente, sin constructor
		
		Coche c1 = new Coche();
		
		System.out.println("Introduce los datos del primer coche: ");
		System.out.print("- ID: ");
		c1.id = sc.nextInt();
		
		System.out.print("- Marca: ");
		sc.nextLine();
		c1.marca = sc.nextLine();
		
		System.out.print("- Modelo: ");
		c1.modelo = sc.nextLine();
		
		System.out.print("- Precio Base: ");
		c1.precio_base = sc.nextDouble();
		
		System.out.print("- Fecha (dd/mm/aaaa): ");
		sc.nextLine();
		c1.fecha_matriculacion = sc.nextLine();
		
		System.out.println("- Kilómetros: ");
		c1.kilometros = sc.nextInt();
		
		System.out.println("");
		System.out.println("---------------------------------------------------------------");
		System.out.println("");
		
		// Instancia del segundo coche con el constructor con todos los datos
		
		System.out.println("Introduce los datos del segundo coche: ");
		System.out.print("- ID: ");
		int id = sc.nextInt();
		
		System.out.print("- Marca: ");
		sc.nextLine();
		String marca = sc.nextLine();
		
		System.out.print("- Modelo: ");
		String modelo = sc.nextLine();
		
		System.out.print("- Precio Base: ");
		double precio = sc.nextDouble();
		
		System.out.print("- Fecha (dd/mm/aaaa): ");
		sc.nextLine();
		String fecha = sc.nextLine();
		
		System.out.println("- Kilómetros: ");
		int kilometros = sc.nextInt();
		
		Coche c2 = new Coche(id, marca, modelo, precio, fecha, kilometros);
		
		// Invocamos los métodos de la clase coche en los objetos c1 y c2
		
		System.out.println(c1);
		System.out.println("");
		System.out.println(c2);
		System.out.println("---");
		
		c1.printPrecio();
		c2.printPrecio();
		
		System.out.println("-------------------");
		
		c1.printFechaMatriculacion();
		c2.printFechaMatriculacion();
		
		System.out.println("-------------------");
		
//		c1.compruebaSiEsBisiesto();
//		c2.compruebaSiEsBisiesto();
		
		System.out.println("-------------------");
		
		System.out.println("Precio: " + c1.precioEnFuncionDeKilometros());
		System.out.println("Precio: " + c2.precioEnFuncionDeKilometros());
		
		System.out.println("-------------------");
		
		System.out.println("Kilómetros de " + c1.marca + " " + c1.modelo + " " + c1.compruebaKilometrosNumeroPrimo());
		System.out.println("Kilómetros de " + c2.marca + " " + c2.modelo + " " + c2.compruebaKilometrosNumeroPrimo());
		
		System.out.println("-------------------");
		
		System.out.println("Kilómetros restantes de " + c1.marca + " " + c1.modelo + " para 200k: " + c1.kilometrosRestantesPara200k());
		System.out.println("Kilómetros restantes de " + c2.marca + " " + c2.modelo + " para 200k: " + c2.kilometrosRestantesPara200k());
		
		System.out.println("-------------------");
		
		c1.numeroCaracteresMarcaYModelo();
		c2.numeroCaracteresMarcaYModelo();
		
		System.out.println("-------------------");
		
		System.out.println(c1.diferenciaKilometraje(c2.kilometros));
		System.out.println(c2.diferenciaKilometraje(c1.kilometros));
		
		System.out.println("-------------------");
		
		System.out.println(c1.cocheMasCaro(c2.precioEnFuncionDeKilometros()));
		System.out.println(c2.cocheMasCaro(c1.precioEnFuncionDeKilometros()));
		
		
		
		

		
	}

}
