package entidad;

import java.util.Arrays;

public class Team {
	
	// 1. Atributos
	
	String name;
	String[] players;

	
	// 2. Constructores
	
	public Team() {
		super();
	}
	
	public Team(String name, String[] players) {
		super();
		this.name = name;
		this.players = players;
	}

	// 3. Métodos
	
	// Los objetos tendrán la opción de mostrar todos sus datos por pantalla (mediante el método toString())
	
	@Override
	public String toString() {
		return "Equipo [nombre=" + name + ", jugadores=" + Arrays.toString(players) + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
