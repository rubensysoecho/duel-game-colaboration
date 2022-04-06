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
	
	public static void main_menu()	{
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
		System.out.println("|----TIENES 10 PUNTOS PARA DISTRIBUIR----|");
		System.out.println("|Vida--> ");
		System.out.println("");
		System.out.println();
		
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
