package entidad;

public class Mago extends Personaje {
	private int inteligencia;

	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}

	@Override
	public void atacar(Personaje p) {
		int danho = this.getArma().getPoder();
		
		if (this.getArma() instanceof Hechizo) {
			danho += this.getInteligencia();
		}
		
		p.setVida(p.getVida() - danho);
		
	}
}
