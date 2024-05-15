package entidad;

public class Espada extends Arma {

	@Override
	public void usar() {
		this.setPoder(this.getPoder() + 5);

	}
}
