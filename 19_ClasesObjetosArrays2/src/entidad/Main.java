package entidad;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Creamos los equipos
		Team equipo1 = new Team();
		Team equipo2 = new Team();

		// Creamos el array de equipos
		Team[] teamList = { equipo1, equipo2 };

		// Invocamos askData para darle datos a los equipos de las posiciones del array
		askData(sc, teamList[0]);
		askData(sc, teamList[1]);

		// Bucle para recorrer teamList para invocar los métodos de los equipos

		for (int i = 0; i < teamList.length; i++) {
			System.out.println(teamList[i]);
			System.out.println("----------------");

			System.out.println("JUGADORES: ");
			teamList[i].printPlayers();
			System.out.println("----------------");

			System.out.print("NÚMERO DE JUGADORES: ");
			System.out.println(teamList[i].returnNumberOfPlayers());
			System.out.println("----------------");

			System.out.println(
					(teamList[i].returnIfPlayable()) ? "El equipo es apto para jugar porque tiene al menos 7 jugadores"
							: "El equipo no es apto para jugar porque no tiene al menos 7 jugadores");
			System.out.println("----------------");

			System.out.print(
					"Introduce el nombre de un jugador para comprobar si está en el equipo " + teamList[i].name + ": ");

			String userPlayer = sc.nextLine();
			System.out.println(
					(teamList[i].returnPlayerIfExists(userPlayer)) ? userPlayer + " existe en " + teamList[i].name
							: " no existe en " + teamList[i].name);
			System.out.println("----------------");

		}

		System.out.println((teamList[0].returnIfSamePlayers(teamList[1].players)
				? teamList[0].name + " tiene los mismos jugadores que " + teamList[1].name
				: teamList[0].name + " no tiene los mismos jugadores que " + teamList[1].name));

		System.out.println((teamList[0].returnIfSameTeam(teamList[1])
				? teamList[0].name + " es el mismo equipo que " + teamList[1].name
				: teamList[0].name + " no es el mismo equipo que " + teamList[1].name));

	}

	public static void askData(Scanner sc, Team team) {
		System.out.print("Nombre: ");
		team.name = sc.nextLine();
		System.out.print("Cuántos jugadores tiene el equipo?");
		int numberOfPlayers = sc.nextInt();
		sc.nextLine();

		team.players = new String[numberOfPlayers];

		System.out.println("Introduce el nombre de los jugadores: ");

		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("Jugador " + (i + 1) + ": ");
			team.players[i] = sc.nextLine();
		}

	}

}
