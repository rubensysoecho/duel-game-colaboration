package game;

public class Main {

	public static void main(String[] args) {

//		intro();
//		duelista tu = new duelista("Percival");
//		duelista oponente = new duelista("Lancelot");
//		batalla batalla1 = new batalla(tu, oponente);
//
//		tu.stats();

		// Player has 10 point to assign
		Player player = new Player("Maxim", 3, 3, 2, 1, 1);
		
		player.showStats();
		
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
