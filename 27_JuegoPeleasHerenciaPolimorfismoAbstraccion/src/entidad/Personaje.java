package entidad;

public abstract class Personaje {
	
	// Atributos
	private String nombre;
	private int vida;
	private Arma arma;
	
	// Constructores
	public Personaje() {
		super();
	}

	// Getters & Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public Arma getArma() {
		return arma;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	// Métodos
	public abstract void atacar(Personaje p);
}
