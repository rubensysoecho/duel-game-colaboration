package game;

public class Duel {
	private Player player;
	private Enemy enemy;
	private boolean isFinished, isPlayerTurn;

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
		while(!isFinished) {
			playTurn();
		}
	}
	
	public void playTurn() {
		if(isPlayerTurn) {
			System.out.println("Be ready for shot.");
			System.out.println("Choose the enemy's part for your shot:");
			System.out.println("W - Head");
			System.out.println("S - Body");
			System.out.println("Q - Left Arm");
			System.out.println("E - Right Arm");
			System.out.println("A - Left Leg");
			System.out.println("D - Right Leg");
			setIsPlayerTurn(false);
		} else {
			
			System.out.println();
		}
	}
}
