package entidad;

public abstract class Arma {
	private int poder;

	public int getPoder() {
		return poder;
	}

	public void setPoder(int poder) {
		this.poder = poder;
	}
	
	public abstract void usar();
	
}
