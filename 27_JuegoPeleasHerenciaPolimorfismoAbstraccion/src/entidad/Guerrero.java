package entidad;



public class Guerrero extends Personaje{
	private int fuerza;

	@Override
	public void atacar(Personaje p) {
		int danho = this.fuerza;
		if (this.getArma() instanceof Espada || this.getArma() instanceof Arco) {
			
		}
		
	}
}
