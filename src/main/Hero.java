package main;


public class Hero {
	int myhealth;
	int myattack;

	public Hero(int health, int attack) {
		health = this.myhealth;
		attack = this.myattack;
	}

	public int getHealth() {
		return this.myhealth;
	}

	public int getattack() {
		return this.myattack;
	}

	public int random() {
		return (int) (Math.random() * 10);
	}

	public boolean attack() {
		if (random() % 2 == 0) {
			return true; // means that hero will attack
		} else {
			return false; // means that hero will miss attack

		}
	}

}
