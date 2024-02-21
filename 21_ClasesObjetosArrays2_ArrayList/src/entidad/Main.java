package entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos los equipos
		Team equipo1 = new Team();
		Team equipo2 = new Team();

		// Creamos el arrayList de equipos
		ArrayList<Team> teamList = new ArrayList<Team>();
		teamList.add(equipo1);
		teamList.add(equipo2);

		// Invocamos askData para darle datos a los equipos de las posiciones del array
		askData(sc, teamList.get(0));
		askData(sc, teamList.get(1));

		// Bucle para recorrer teamList para invocar los métodos de los equipos

		for (int i = 0; i < teamList.size(); i++) {
			System.out.println(teamList.get(i));
			System.out.println("----------------");

			System.out.println("JUGADORES: ");
			teamList.get(i).printPlayers();
			System.out.println("----------------");

			System.out.print("NÚMERO DE JUGADORES: ");
			System.out.println(teamList.get(i).returnNumberOfPlayers());
			System.out.println("----------------");

			System.out.println(
					(teamList.get(i).returnIfPlayable()) ? "El equipo es apto para jugar porque tiene al menos 7 jugadores"
							: "El equipo no es apto para jugar porque no tiene al menos 7 jugadores");
			System.out.println("----------------");

			System.out.print(
					"Introduce el nombre de un jugador para comprobar si está en el equipo " + teamList.get(i).name + ": ");

			String userPlayer = sc.nextLine();
			System.out.println(
					(teamList.get(i).returnPlayerIfExists(userPlayer)) ? userPlayer + " existe en " + teamList.get(i).name
							: " no existe en " + teamList.get(i).name);
			System.out.println("----------------");

		}

		System.out.println((teamList.get(0).returnIfSamePlayers(teamList.get(1).players)
				? teamList.get(0).name + " tiene los mismos jugadores que " + teamList.get(1).name
				: teamList.get(0).name + " no tiene los mismos jugadores que " + teamList.get(1).name));

		System.out.println((teamList.get(0).returnIfSameTeam(teamList.get(1))
				? teamList.get(0).name + " es el mismo equipo que " + teamList.get(1).name
				: teamList.get(0).name + " no es el mismo equipo que " + teamList.get(1).name));

	}

	public static void askData(Scanner sc, Team team) {
		System.out.print("Nombre: ");
		team.name = sc.nextLine();
		System.out.print("Cuántos jugadores tiene el equipo?");
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();

		team.players = new ArrayList<String>();

		System.out.println("Introduce el nombre de los jugadores: ");

		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("Jugador " + (i + 1) + ": ");
			team.players.add(sc.nextLine());
		}

	}

}
