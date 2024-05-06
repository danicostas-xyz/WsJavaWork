package entidad;

public class Arco extends Arma {
	@Override
	public void usar() {
		this.setPoder(this.getPoder() + 4);
		
	}
}
