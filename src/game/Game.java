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
		main_menu();
		Player player = new Player("Maxim", 3, 3, 2, 1, 1);
		player.showStats();

		Enemy enemy = new Enemy("ENEMY", 1, 4, 5, 0, 0);
		enemy.showStats();

		Duel duel = new Duel(player, enemy);

		duel.start();
	}
	
	public static Player main_menu()	{
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
		String name = input.next();
		
		int points = 10;
		int healthStat = 0, damageStat = 0, accuracyStat = 0, dodgeChanceStat = 0, criticalChanceStat = 0;
		while (points > 0)	{
			System.out.println();
			System.out.println("|----TIENES "+points+" PUNTOS PARA DISTRIBUIR----|");
			System.out.println("|A- Vida |"+healthStat+"|");
			System.out.println("|B- Da�o |"+damageStat+"|");
			System.out.println("|C- Precisi�n |"+accuracyStat+"|");
			System.out.println("|D- Agilidad |"+dodgeChanceStat+"|");
			System.out.println("|E- Prob. critico |"+criticalChanceStat+"|");
			System.out.print("|--> ");
			String stat = input.next().toLowerCase();

			switch (stat)	{
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
		
		System.out.println("|----"+name.toUpperCase()+"----|");
		System.out.println("|Vida--> "+player.getHealth());
		System.out.println("|Da�o--> "+player.getDamage());
		System.out.println("|Precisi�n--> "+player.getAccuracy());
		System.out.println("|Agilidad--> "+player.getDodgeChance()+"%");
		System.out.println("|Prob. critico--> "+player.getCriticalChance()+"%");
		
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
//				"Tu-> Bueno, ya sabes lo que dicen, nunca juzgues un libro por su portada, �En guardia canalla!");
//		System.out.println();
//		System.out.println("Juez-> Los dos, a vuestros puestos, �QUE COMIENCE EL COMBATE!\n");
//	}
//
//	public void smth() {
//		System.out.println("============");
//		System.out.println("|�VICTORIA!|");
//		System.out.println("============");
//		System.out.println("Combate terminado. Felicidades, has ganado el combate y obtenido la gloria.");
//		System.out.println("===========");
//		System.out.println("|�DERROTA!|");
//		System.out.println("===========");
//		System.out.println("Combate terminado. Tu cuerpo inerte ser� un festin para los cuervos.");
//	}

}
