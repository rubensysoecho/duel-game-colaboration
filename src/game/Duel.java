package game;

import java.util.Scanner;

public class Duel {
	private Player player;
	private Enemy enemy;
	private boolean isFinished, isPlayerTurn;
	Scanner input = new Scanner(System.in);

	public Duel(Player player, Enemy enemy) {
		this.player = player;
		this.enemy = enemy;
		this.isPlayerTurn = true;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setIsFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public Enemy getEnemy() {
		return enemy;
	}

	public void setEnemy(Enemy enemy) {
		this.enemy = enemy;
	}

	public boolean isPlayerTurn() {
		return isPlayerTurn;
	}

	public void setIsPlayerTurn(boolean isPlayerTurn) {
		this.isPlayerTurn = isPlayerTurn;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	public void start() {
		System.out.println("Duel ha empezado!");
		while (!isFinished) {
			playTurn();
		}
	}

	public void playTurn() {
		if (isPlayerTurn) {
			System.out.println("Be ready for shot.");
			System.out.println("Choose the enemy's part for your shot:");
			System.out.println("W - Head");
			System.out.println("S - Body");
			System.out.println("Q - Left Arm");
			System.out.println("E - Right Arm");
			System.out.println("A - Left Leg");
			System.out.println("D - Right Leg");
			shoot(input.nextLine().toLowerCase().charAt(0));
			changeTurn();
		} else {

			System.out.println("Enemy's shot");
			changeTurn();
		}
	}

	public void changeTurn() {
		setIsPlayerTurn(!isPlayerTurn);
	}
	
	public void shoot(char target) {
		switch (target) {
		case 'w':
			System.out.println("Head");
			break;
			
		case 's':
			System.out.println("Body");
			break;
			
		case 'q':
			System.out.println("LA");
			break;
		
		case 'e':
			System.out.println("RA");
			break;
			
		case 'a':
			System.out.println("LL");
			break;
			
		case 'd':
			System.out.println("RL");
			break;

		default:
			System.out.println("Body");
			break;
		}
	}
}
