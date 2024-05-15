package entidad;

public class Guerrero extends Personaje {
	private int fuerza;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		int danho = this.getArma().getPoder();
		
		if (this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			danho += this.getFuerza();
		}

		p.setVida(p.getVida() - danho);
	}
}
