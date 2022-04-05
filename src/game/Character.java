package game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Character {
	Random rand = new Random();

	private String name;
	private int currentHealth, health, damage, accuracy, dodgeChance, criticalChance;
	private int healthStat, damageStat, accuracyStat, dodgeChanceStat, criticalChanceStat;

	public Character(String name, int health, int damage, int accuracy, int dodgeChance, int criticalChance) {
		this.name = name;
		this.healthStat = health; 
		this.damageStat = damage;
		this.accuracyStat = accuracy;
		this.dodgeChanceStat = dodgeChance;
		this.criticalChanceStat = criticalChance;
		
		this.health = health * 10 + 100;
		this.damage = damage * 10 + 100;
		this.accuracy = accuracy * 5 + 50;
		this.dodgeChance = dodgeChance * 2;
		this.criticalChance = criticalChance * 5;
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
		this.currentHealth = currentHealth;
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

	public void showStats() {
		System.out.println("|---" + this.name + "---|");
		System.out.println("Health: " + this.health);
		System.out.println("Damage: " + this.damage);
		System.out.println("Accuracy: " + this.accuracy);
		System.out.println("Dodge Chance: " + this.dodgeChance);
		System.out.println("Critical Chance: " + this.criticalChance);
	}
}
