package entidad;

public class Hechizo extends Arma {
	@Override
	public void usar() {
		this.setPoder(this.getPoder() + 3);
		
	}
}
