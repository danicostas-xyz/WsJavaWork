package negocio;

import entidad.Espada;
import entidad.Guerrero;
import entidad.Mago;
import entidad.Rezo;

public class Main {

	public static void main(String[] args) {

		Combate c1 = new Combate();

		Guerrero g1 = new Guerrero();
		Espada e1 = new Espada();

		e1.setPoder(10);

		g1.setNombre("Guts");
		g1.setVida(100);
		g1.setArma(e1);
		g1.setFuerza(20);

		Mago m1 = new Mago();
		Rezo r1 = new Rezo();

		r1.setPoder(20);

		m1.setNombre("Merlín");
		m1.setVida(150);
		m1.setArma(r1);
		m1.setInteligencia(20);

		c1.setP1(g1);
		c1.setP2(m1);

		c1.startBattle();

	}

}
