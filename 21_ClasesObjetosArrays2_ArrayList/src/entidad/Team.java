package entidad;

import java.util.ArrayList;
import java.util.Arrays;

public class Team {

	// 1. Atributos

	String name;
	// String[] players;
	ArrayList<String> players;

	// 2. Constructores

	public Team() {
		super();
	}

	public Team(String name, ArrayList<String> players) {
		super();
		this.name = name;
		this.players = players;
	}

	// 3. Métodos

	// -> Los objetos tendrán la opción de mostrar todos sus datos por pantalla
	// (mediante el método toString())

	@Override
	public String toString() {
		return "Team [name=" + name + ", players=" + players + "]";
	}

	// -> Los objetos tendrán la opción de mostrar todos sus jugadores

	public void printPlayers() {
		for (String s: this.players) {
			System.out.println(s);
		}
	}

	// -> Los objetos tendrán la opción de devolver si existe un jugador pasado por
	// parámetro.

	public boolean returnPlayerIfExists(String player) {
		boolean flag = false;
		
		for (String s: this.players) {
			if (s.equalsIgnoreCase(player)) {
				flag = true;
			}
		}
		
		return flag;
	}

	// -> Los objetos tendrán la opción de devolver el numero de jugadores que
	// tienen.

	public int returnNumberOfPlayers() {
		return this.players.size();
	}

	// -> Los objetos tendrán la opción de devolver si el número de jugadores que
	// tienen es apto para jugar. Un equipo es apto para jugar si tiene al menos 7
	// jugadores.

	public boolean returnIfPlayable() {
		return (this.players.size() >= 7) ? true : false;
	}

	// -> Los objetos tendrán la opción de devolver si una lista de jugadores pasada
	// por parámetro es exactamente igual a su lista de jugadores

	public boolean returnIfSamePlayers(ArrayList<String> playerList) {

		boolean result = false;

		if (playerList.size() == this.players.size()) {
			for (int i = 0; i < playerList.size(); i++) {
				if (!(playerList.get(i).equals(this.players.get(i)))) {
					result = false;
					break;
				} else {
					result = true;
				}
			}
		}

		return result;
	}

	// -> Los objetos tendrán la opción de devolver si un equipo pasado por
	// parámetro
	// es exactamente igual al mismo. Un equipo es exactamente igual si tiene el
	// mismo nombre y la misma lista de jugadores con los mismos nombres.

	public boolean returnIfSameTeam(Team team) {

		boolean result = false;

		if (team.name.equals(this.name) && this.returnIfSamePlayers(team.players)) {
			result = true;
		}

		return result;

	}

}
