package entidad;

public class Rezo extends Arma {
	@Override
	public void usar() {
		this.setPoder(this.getPoder() + 2);
		
	}
}
