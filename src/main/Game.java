package main;

import java.util.Scanner;

public class Game {
public static void main(String[] args){
	Hero player = new Hero(20, 3);
	Monster dragon = new Monster(15, 5);
	
	
	Scanner console = new Scanner(System.in);
	System.out.println("Do you want to play?");
	String answer = console.nextLine();
	if(answer.equals("Yes")){
		//Show title and characters in graphics window
		//Show hero on one side and monster on the other
		
		playGame(player, dragon);
	}
}

public static void playGame(Hero x, Monster y) {
	int hMonster = y.getHealth();
	int aMonster = y.getattack();
	int hHero = x.getHealth();
	int aHero = x.getattack();
	
	int potions = 3;
	int hpotion = 5;
	
	Scanner console = new Scanner(System.in);
	System.out.println("What would you like to do?  Attack[a]  or  Heal[h] ");
	String answer = console.nextLine();
	while (hHero > 0 || hMonster > 0) {
		if(answer.equals("h")) {
			if(potions > 0) {
				potions--;
				hHero += hpotion;
			}
			else {
				System.out.println("You don't have any more potions left");
			}
			
		}
		if(answer.equals("a")) {
			if(x.attack() == true){
				hMonster -= aHero;
			}
		}
		
		System.out.println("Now the dragon attacks you!");
		
			if(y.attack() == true){
				hHero -= aMonster;
			}
		
	}
	
}


}
