package game;

public class Weapon {

	private String name;
	private int accuracyBonus, criticalChanceBonus;

	public Weapon(String name, int accuracyBonus, int criticalChanceBonus) {
		super();
		this.name = name;
		this.accuracyBonus = accuracyBonus;
		this.criticalChanceBonus = criticalChanceBonus;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccuracyBonus() {
		return accuracyBonus;
	}

	public void setAccuracyBonus(int accuracyBonus) {
		this.accuracyBonus = accuracyBonus;
	}

	public int getCriticalChanceBonus() {
		return criticalChanceBonus;
	}

	public void setCriticalChanceBonus(int criticalChanceBonus) {
		this.criticalChanceBonus = criticalChanceBonus;
	}

	@Override
	public String toString() {
		return this.name;
	}

	
	
}
