package entidad;

public class Curandero extends Personaje {
	private int sabiduria;

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}

	@Override
	public void atacar(Personaje p) {
		int danho = this.getArma().getPoder();
		
		if (this.getArma() instanceof Rezo) {
			danho += this.getSabiduria();
		}
	
		p.setVida(p.getVida() - danho);
	}
}
