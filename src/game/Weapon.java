package game;

public class Weapon {
	
	public Weapon(String name, int damageBonus, int acurracyBonus) {
		super();
		this.name = name;
		this.damageBonus = damageBonus;
		this.acurracyBonus = acurracyBonus;
	}
	
	private String name;
	private int damageBonus, acurracyBonus;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
		switch (name) {
		case "Rifle de cerrojo":
			this.setDamageBonus(0);
			this.setAcurracyBonus(0);
			break;
		case "Escopeta":
			this.setDamageBonus(0);
			this.setAcurracyBonus(0);
			break;
		case "Revolver":
			this.setDamageBonus(0);
			this.setAcurracyBonus(0);
			break;
		}	
	}
	
	public int getDamageBonus() {
		return damageBonus;
	}
	
	public void setDamageBonus(int damageBonus) {
		this.damageBonus = damageBonus;
	}
	
	public int getAcurracyBonus() {
		return acurracyBonus;
	}
	
	public void setAcurracyBonus(int acurracyBonus) {
		this.acurracyBonus = acurracyBonus;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
