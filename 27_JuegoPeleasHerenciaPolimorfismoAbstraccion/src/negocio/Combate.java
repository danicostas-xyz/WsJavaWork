package negocio;

import java.util.Scanner;

import entidad.Personaje;

public class Combate {

	private Personaje p1;
	private Personaje p2;

	public Personaje getP1() {
		return p1;
	}

	public void setP1(Personaje p1) {
		this.p1 = p1;
	}

	public Personaje getP2() {
		return p2;
	}

	public void setP2(Personaje p2) {
		this.p2 = p2;
	}

	@Override
	public String toString() {
		return "Combate [p1=" + p1 + ", p2=" + p2 + "]";
	}

	public void startBattle() {
		Scanner sc = new Scanner(System.in);
		boolean combateTerminado = false;
		int contador = 1;
		Personaje ganador = null;

		do {
			System.out.println("Turno " + contador);
			System.out.println("-----------------");
			
			if (p1.getVida() != 0) {
				System.out.println(p1.getNombre() + " ataca a " + p2.getNombre());
				p1.atacar(p2);
				System.out.println("Vida de " + p2.getNombre() + " = " + p2.getVida());
			} else {
				System.out.println(p1.getNombre() + " está muerto.");
				ganador = p2;
				combateTerminado = true;
			}

			if (p2.getVida() != 0) {
				System.out.println(p2.getNombre() + " ataca a " + p1.getNombre());
				p2.atacar(p1);
				System.out.println("Vida de " + p1.getNombre() + " = " + p1.getVida());
			} else {
				System.out.println(p2.getNombre() + " está muerto.");
				ganador = p1;
				combateTerminado = true;
			}
			
			contador++;
			System.out.println("");
			System.out.println("Pulsa enter para el siguiente turno");
			sc.nextLine();

		} while (!combateTerminado);

		System.out.println("------------------");
		System.out.println("Combate terminado.");
		System.out.println("El ganador es " + ganador.getNombre());

	}
}
