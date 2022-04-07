package game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Character {
	Random rand = new Random();

	private String name;
	private int currentHealth, health, damage, accuracy, dodgeChance, criticalChance;
	private int healthStat, damageStat, accuracyStat, dodgeChanceStat, criticalChanceStat;

	private boolean isDead;

	public Character()	{
		
	}
	
	public Character(String name, int healthStat, int damageStat, int accuracyStat, int dodgeChanceStat,
			int criticalChanceStat) {
		this.name = name;
//		this.healthStat = health; 
//		this.damageStat = damage;
//		this.accuracyStat = accuracy;
//		this.dodgeChanceStat = dodgeChance;
//		this.criticalChanceStat = criticalChance;

//		if(healthStat + damageStat + accuracyStat + dodgeChanceStat + criticalChanceStat != 10) {
//			throw new Exception("Error con stats");
//		}

		setHealthStat(healthStat);
		setDamageStat(damageStat);
		setAccuracyStat(accuracyStat);
		setDodgeChanceStat(dodgeChanceStat);
		setCriticalChanceStat(criticalChanceStat);
		setCurrentHealth(health);
		this.isDead = false;

//		this.health = health * 10 + 100;
//		this.damage = damage * 10 + 100;
//		this.accuracy = accuracy * 5 + 50;
//		this.dodgeChance = dodgeChance * 2;
//		this.criticalChance = criticalChance * 5;
	}

	public int getHealthStat() {
		return healthStat;
	}

	public void setHealthStat(int healthStat) {
		this.healthStat = healthStat;
		setHealth(100 + 10 * healthStat);
	}

	public int getDamageStat() {
		return damageStat;
	}

	public void setDamageStat(int damageStat) {
		this.damageStat = damageStat;
		setDamage(100 + 10 * damageStat);
	}

	public int getAccuracyStat() {
		return accuracyStat;
	}

	public void setAccuracyStat(int accuracyStat) {
		this.accuracyStat = accuracyStat;
		setAccuracy(50 + 5 * accuracyStat);
	}

	public int getDodgeChanceStat() {
		return dodgeChanceStat;
	}

	public void setDodgeChanceStat(int dodgeChanceStat) {
		this.dodgeChanceStat = dodgeChanceStat;
		setDodgeChance(2 * dodgeChanceStat);
	}

	public void setDodgeChance(int dodgeChance) {
		this.dodgeChance = dodgeChance;
	}

	public int getCriticalChanceStat() {
		return criticalChanceStat;
	}

	public void setCriticalChanceStat(int criticalChanceStat) {
		this.criticalChanceStat = criticalChanceStat;
		setCriticalChance(5 * criticalChanceStat);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentHealth() {
		return currentHealth;
	}

	public void setCurrentHealth(int currentHealth) {
		if (currentHealth <= 0) {
			this.currentHealth = 0;
			setIsDead(true);
		} else {
			this.currentHealth = currentHealth;
		}
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getDodgeChance() {
		return dodgeChance;
	}

	public void setSodgeChance(int dodgeChance) {
		this.dodgeChance = dodgeChance;
	}

	public int getCriticalChance() {
		return criticalChance;
	}

	public void setCriticalChance(int criticalChance) {
		this.criticalChance = criticalChance;
	}

	public boolean getIsDead() {
		return isDead;
	}

	public void setIsDead(boolean isDead) {
		this.isDead = isDead;
	}

	public void showStats() {
		System.out.println("|---" + this.name + "---|");
		System.out.println("Health: " + this.health);
		System.out.println("Damage: " + this.damage);
		System.out.println("Accuracy: " + this.accuracy);
		System.out.println("Dodge Chance: " + this.dodgeChance);
		System.out.println("Critical Chance: " + this.criticalChance);
	}
}
