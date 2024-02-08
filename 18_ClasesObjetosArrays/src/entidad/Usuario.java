package entidad;

import java.util.Arrays;

public class Usuario {

	// Atributos

	String id;
	String nombre;
	int[] valoraciones;

	// Constructores

	public Usuario() {
		super();
	}

	public Usuario(String id, String nombre, int[] valoraciones) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.valoraciones = valoraciones;
	}

	// Métodos

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", valoraciones=" + Arrays.toString(valoraciones) + "]";
	}

	public int promedioValoraciones() {
		int contador = 0;
		int acumulador = 0;

		for (int i = 0; i < this.valoraciones.length; i++) {
			acumulador += this.valoraciones[i];
			contador++;
		}

		return acumulador / contador;
	}

	public void printValoraciones() {
		for (int i = 0; i < this.valoraciones.length; i++) {
			System.out.println("- Valoración " + i + " = " + this.valoraciones[i]);
		}
	}

	public int contadorNotasMasAltasQue(int nota) {

		int contador = 0;

		for (int i = 0; i < this.valoraciones.length; i++) {
			if (nota < this.valoraciones[i]) {
				contador++;
			}
		}

		return contador;
	}

	public boolean notaEsMayorQueMedia(int nota) {
		return (nota > this.promedioValoraciones()) ? true : false;
	}
	
	

}
