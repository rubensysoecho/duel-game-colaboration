package game;

import java.util.Scanner;

public class Game {

	public static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

//		intro();
//		duelista tu = new duelista("Percival");
//		duelista oponente = new duelista("Lancelot");
//		batalla batalla1 = new batalla(tu, oponente);
//
//		tu.stats();

		// Player has 10 point to assign
//		Player player = new Player();
		Player player = createPlayerCharacter();

		while (!player.getIsDead()) {
			Enemy enemy = generateEnemy();
			enemy.showStats();

			Duel duel = new Duel(player, enemy);

			duel.start();
		}
	}

	private static Enemy generateEnemy() {
		int enemyPoints = 10, health = 0, damage = 0, accuracy = 0, dodgeChance = 0, criticalChance = 0;

		int[] stats = generateStats(enemyPoints);

		for (int i = 0; i < stats.length; i++) {
			System.out.print(stats[i] + " ");
		}

		return new Enemy("Enemy", stats[0], stats[1], stats[2], stats[3], stats[4]);

	}

	private static int[] generateStats(int maxPoints) {
		int[] stats = new int[5];

		int pointsLeft = maxPoints;

		while (pointsLeft > 0) {
			for (int i = 0; i < stats.length; i++) {
				int stat = generateStat(pointsLeft);
				stats[i] += stat;
				pointsLeft -= stat;
			}
		}

		return stats;
	}

	private static int generateStat(int maxValue) {
		return (int) Math.round(Math.random() * maxValue);
	}

	public static Player createPlayerCharacter() {
		System.out.println("@@@@@@@@@@@@@@@@@");
		System.out.println("@               @");
		System.out.println("@   DUEL GAME   @");
		System.out.println("@               @");
		System.out.println("@@@@@@@@@@@@@@@@@");
		System.out.println();
		System.out.println("#################");
		System.out.println("#################");
		System.out.println();
		System.out.println(" ---------------------------------------");
		System.out.println("--------CREADOR DE PERSONAJES------------");
		System.out.println(" ---------------------------------------");
		System.out.print("|Nombre: ");
		String name = input.nextLine();

		int points = 10;
		int healthStat = 0, damageStat = 0, accuracyStat = 0, dodgeChanceStat = 0, criticalChanceStat = 0;
		while (points > 0) {
			System.out.println();
			System.out.println("|----TIENES " + points + " PUNTOS PARA DISTRIBUIR----|");
			System.out.println("|A- Vida |" + healthStat + "|");
			System.out.println("|B- Daño |" + damageStat + "|");
			System.out.println("|C- Precisión |" + accuracyStat + "|");
			System.out.println("|D- Agilidad |" + dodgeChanceStat + "|");
			System.out.println("|E- Prob. critico |" + criticalChanceStat + "|");
			System.out.print("|--> ");
			String stat = input.nextLine().toLowerCase();

			switch (stat) {
			case "a":
				healthStat++;
				break;
			case "b":
				damageStat++;
				break;
			case "c":
				accuracyStat++;
				break;
			case "d":
				dodgeChanceStat++;
				break;
			case "e":
				criticalChanceStat++;
				break;
			}

			points--;
		}
		
		Player player = new Player(name, healthStat, damageStat, accuracyStat, dodgeChanceStat, criticalChanceStat);

		System.out.println("|----ELIGE UN ARMA----|");
		System.out.println("|A- Rifle de cerrojo |");
		System.out.println("|B- Escopeta         |");
		System.out.println("|C- Revolver         |");
		System.out.print("|--> ");
		String weapon = input.nextLine().toLowerCase();

		switch (weapon) {
		case "a":
			Weapon rifle = new Weapon("Rifle de cerrojo", 0, 0);
			player.addWeapon(rifle);
			break;
		case "b":
			Weapon shotgun = new Weapon("Escopeta", 0, 0);
			player.addWeapon(shotgun);
			break;
		case "c":
			Weapon revolver = new Weapon("Revolver", 0, 0);
			player.addWeapon(revolver);
			break;
		}

		System.out.print("Quieres equiparla ahora? [S/N] ");
		String equipWeapon = input.next().toLowerCase();

		switch (equipWeapon) {
		case "s":
			player.equipWeapon();
			break;
		case "n":
			break;
		}

		System.out.println("═══════════════════░▒░══════════════════\r\n"
				+ "════════════▒▒▒▓███████████▓▒═══════════\r\n" + "════════▒██████████▓▓▓▓██▓████▓═════════\r\n"
				+ "══════▒███████▓█▓▓▓█▓█▓███▓▓▓███════════\r\n" + "═════▓███▓██▓▓████▓██▓█▓▓▓███▓██▒═══════\r\n"
				+ "═════▓██▓███▓█▓████████▓▓█████▓██═══════\r\n" + "═════▒█████████▓▓▓███████████████▒══════\r\n"
				+ "═════▒██████▓█████▒▒▒▒▒██████████▒══════\r\n" + "═════▒███████▓█▓█▒═════░▒▓█▓▓▒▒██▒══════\r\n"
				+ "═════▒█████████▓█▓░░▒▒░░░░░▒▒▒▒██▒══════\r\n" + "═════▒████████████▒░▒▒▒▒▒▒▒▒▒▒▒▓█▒══════\r\n"
				+ "═════▒██████████▓▓▓▒▒▒▒▒▒▒▒▒▒▒░▓█▒══════\r\n" + "═════▒███████▓███▓▒▒▒▒▒▒▒▒▒▒▒▒░▒▓▒══════\r\n"
				+ "═════▓█▒░░▓██▓█▓▒▒▒▒░░░░░░░░░░░▒█▒══════\r\n" + "═════▓█▒▒▒░▒███▒░░▒░░░▒▒▒▒▒█▓█████══════\r\n"
				+ "═════██░▒██▒▒████▒░▓██████████████══════\r\n" + "═════▒█▒▒▒▓▒░▓█▓███████████▒▒█████══════\r\n"
				+ "══════▒█═░░▒▒▒█▒▒▒▒█▓██████░═████═══════\r\n" + "═▒▓███▓██░░▒▒▒▒▒▒▒▒██████▓▒░░▒██▒═══════\r\n"
				+ "██████████▓█▒▒▒▒▒▒▒▒█▓▒▒▒▒░░░═░█════════\r\n" + "█████████▓▓█▓▒▒▒▒▒▓▒▒▒▒▒▒▒▓▓▒░▒█════════\r\n"
				+ "██████████▒▒▓▓▒▒▒▒▒▒▒▒▒▒░▒▓██▓▒█════════\r\n" + "▓▓█▓████▓▒▒▒▒▓▓▒▒▒▒▒▒▒▒▒▓▒▒▒▓▓▓██═══════\r\n"
				+ "██▓▒██▒░░▒▓▒▒▒▓█▓▒▒▒▒▒▒█████▒▒▓███══════\r\n" + "█▓▒█▓░░▒▒▒▒▒▒▒▒▒▓▓▒▒▓▒▒░░░▒▒▒▒█████═════\r\n"
				+ "▓▓██░░▒▒▒▒▒▒▒▒▓▒▒▓▓▓▒▒▒▒▒▓██▓▓██████════\r\n" + "▓██▒░▒▒▒▒▒▒▒▒▒▓▓▓▓▓██▓▒▒▒░▒░▒█████▓██═══\r\n"
				+ "▓▓█▒░▒▒▒▒▒▒▓▒▒▒▓▓██████▓▒▒▒▒█████▓▓██░══\r\n" + "█▓█▒░▒▒▒▒▒▒▒▒▒▓▓▓▓████████▓▒████▓██▓██══\r\n"
				+ "▓██▒░▒░▒░░░▒▒▒▒▒▒▒▓▓████▓▒▒▒███▓▓█▓▓▓█══\r\n" + "▒██░░░░░░░░▒▒▒▒▒▒▒▓▓███▓▓▒▒██▓█▓█▓▒█▓██░\r\n"
				+ "▒█▒═░░░░░▒▒░▒▒▒▒▒▒▒▒▒▒▒▓▒▒██▓▓▒█▒▒█▓▒▒▓█\r\n" + "▒█▓░░░░░░░▒▒░▒▒▒▒░░░░▒▒░░██▒▓▒▓▒▒█▓▒▒▒▒█\r\n"
				+ "▒▒█▒═░░░░░░░░░░░░░░░▒░═▒█▒▒▓▒▓█▓▓▒▒▒▒▒▒▓\r\n" + "█▒█▒═░░░░░░░░░░░░░░▒═░██▒▒▒▓▓▒▒▓▒▒▒▒▒▓▒▓\r\n"
				+ "▓▓▒█░░░░░░░░░░░░░░░═▒█▒▒██▓▒▒▓▒▒▒▒▒▓▓▓▒▓\r\n" + "▓█▒█▒═░░░░░░░░▒░░░═▒█▒▒▓▓▓▓▓▒▒▓▒▒▓▓▓▓▒▓▓\r\n"
				+ "▓█▓▒▒═░░░░░▒░▒░░▒═▒█▒▓▓▓▓▓█▓▒▒█▓▒▓▓▓▒▓▓▒\r\n" + "▓▓█▓▒░░░░░░░▒▒▒▒═░█▓▓▓▓▓▓▓▓▓▓▒▓██▒▒▒▓▓█▓\r\n"
				+ "▓▓▓▓█▒═░░░░▒▒▒▒═░▓▓▓▓▓▒▓███▒▓█▒▒▓█▓▒▒▒▒▒\r\n" + "▓▓▒▓█▓═░░▒▒░▒▒═░██▓▓▓▓▓████▒▓▓██▓▓██▓▓▓▓\r\n"
				+ "▓▒▒▓▒█░░▒▒░▒░═▒█████████▓███▓▓▓▓▓▓▓▓████\r\n" + "▓█▓▓▓█▓═▒░▒░░██████████████▓████████████\r\n"
				+ "▓█▓▓▓▒█░░▒═░██████▓█▓█▓█▓▓▓▒█▒▒▒▒▒██████\r\n" + "");

		player.showStats();
		
		return player;

	}

//	public final Scanner entrada = new Scanner(System.in);
//
//	public static void intro() {
//		System.out.println("<|><|><|><|><|><|><|><|>");
//		System.out.println("<|>--BLOOD AND GLORY-<|>");
//		System.out.println("<|><|><|><|><|><|><|><|>");
//		System.out.println();
//		System.out.println("Oponente-> Asi que tu eres el famoso espadachin, ja, no pareces gran cosa");
//		System.out.println(
//				"Tu-> Bueno, ya sabes lo que dicen, nunca juzgues un libro por su portada, ¡En guardia canalla!");
//		System.out.println();
//		System.out.println("Juez-> Los dos, a vuestros puestos, ¡QUE COMIENCE EL COMBATE!\n");
//	}
//
//	public void smth() {
//		System.out.println("============");
//		System.out.println("|¡VICTORIA!|");
//		System.out.println("============");
//		System.out.println("Combate terminado. Felicidades, has ganado el combate y obtenido la gloria.");
//		System.out.println("===========");
//		System.out.println("|¡DERROTA!|");
//		System.out.println("===========");
//		System.out.println("Combate terminado. Tu cuerpo inerte será un festin para los cuervos.");
//	}

}
