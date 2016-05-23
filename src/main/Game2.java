package main;

import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Game2 {
	
	static Hero player = new Hero(20, 3);
	static Monster dragon = new Monster(15, 5);
	static int healthHero = 20;
	static int healthMonster = 15;
	static int attkHero = 3;
	static int atkDragon = 5;
	
public static void main(String[] args){
//	Scanner console = new Scanner(System.in);
//	System.out.println("Do you want to play?");
//	String answer = console.nextLine();
//	if(answer.equals("Yes")){
//		//Show title and characters in graphics window
//		//Show hero on one side and monster on the other
//		
//		playGame(player, dragon);
//	}
	
	
	JFrame title = new JFrame("Test");
	title.setVisible(true);
	title.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	title.setSize(300, 300);
	JPanel panel = new JPanel();
	title.add(panel);
	JButton button = new JButton("Play");
	titleDrawing title1 = new titleDrawing();
	title1.add(button, BorderLayout.PAGE_START);
	title.add(title1);
	button.addActionListener(new Action());
	
}


	static class Action implements ActionListener {
		public void actionPerformed (ActionEvent e) {
			JFrame character = new JFrame("clicked");
			character.setVisible(true);
			character.setSize(200, 500);
			JLabel label = new JLabel("Choose your Character");
			JButton warrior = new JButton("Warrior");
			heroDrawing hero = new heroDrawing();	
			hero.add(label, BorderLayout.PAGE_START);
			hero.add(warrior, BorderLayout.PAGE_END);
			character.add(hero);
			warrior.addActionListener(new ActionTwo());
		}
	}

			static class ActionTwo implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					JFrame game = new JFrame("Game");
					JButton atkHero = new JButton("Attack");
					JButton healHero = new JButton("Heal");
					JButton end = new JButton("End Game");
					JPanel pane  = new JPanel(new BorderLayout());
					
					game.add(pane);
					game.setVisible(true);
					game.setSize(750, 480);
					AnimatedFigure hero1 = new AnimatedFigure();
					
					
					hero1.add(atkHero, BorderLayout.PAGE_END);
					hero1.add(healHero, BorderLayout.PAGE_END);
				
					atkHero.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent e) {
							
							
							int rand = player.random();
							JLabel label = new JLabel("You missed the attack!");
							boolean heroAttack = attack(rand);
							
							if (heroAttack == false) {
								//hero1.add(label, BorderLayout.PAGE_START);
								hero1.fireball();
								healthHero-=atkDragon;
								System.out.println(healthHero);
							}
							else {
								hero1.update();
								healthMonster-=attkHero;
								System.out.println(healthMonster);

							}
						if(healthHero <= 0 || healthMonster <= 0) {
							System.exit(0);
						}
						}
						//hello
					});
					
					
					game.add(hero1);
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


public void paintTitle() {
	
}

public static boolean attack(int random) {
	if (random % 2 == 0) {
		return true; // means that hero will attack
	} else {
		return false; // means that hero will miss attack

	}
}



	public void checkCollisions() {
		//Create three rectangles, one for hero, one for dragon, one for fireball
		
	}
}