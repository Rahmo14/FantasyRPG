package main;

import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Game3 {
	
	static Hero player = new Hero(20, 3);
	static Monster monster = new Monster(15, 5);
	static int healthHero = 100;
	static int healthMonster = 100;
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
	title.setSize(400, 350);
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
					
				//Create object where every figure will be drawn	
					AnimatedFigure screen = new AnimatedFigure();
					screen.components.add(player);
					screen.components.add(monster);
					screen.add(atkHero, BorderLayout.PAGE_END);
					screen.add(healHero, BorderLayout.PAGE_END);
				
					atkHero.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent e) {	
							int rand = player.random();
							JLabel label = new JLabel("You missed the attack!");
							boolean heroAttack = attack(rand);
							
			// The actual game begins here ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬				
							if (heroAttack == false) {
								//hero1.add(label, BorderLayout.PAGE_START);
								monster.attack();
								healthHero-=atkDragon;
								System.out.println("Hero: " + healthHero);
							}
							else {
								player.attack();
								healthMonster-=attkHero;
								System.out.println("Dragon: " + healthMonster);

							}
						if(healthHero <= 0 || healthMonster <= 0) {
							//atkHero.addActionListener(new ActionFour());
							System.exit(0);
						}
						}
						
					});
					
					
					game.add(screen);
				}
			}
							static class ActionFour implements ActionListener {
								public void actionPerformed (ActionEvent e) {
									//JFrame character = new JFrame("clicked");
									System.exit(0);
								}
							}

						
//						
//public static void playGame(Hero x, Monster y) {
//	int hMonster = y.getHealth();
//	int aMonster = y.getattack();
//	int hHero = x.getHealth();
//	int aHero = x.getattack();
//	
//	int potions = 3;
//	int hpotion = 5;
//	
//	Scanner console = new Scanner(System.in);
//	System.out.println("What would you like to do?  Attack[a]  or  Heal[h] ");
//	String answer = console.nextLine();
//	while (hHero > 0 || hMonster > 0) {
//		if(answer.equals("h")) {
//			if(potions > 0) {
//				potions--;
//				hHero += hpotion;
//			}
//			else {
//				System.out.println("You don't have any more potions left");
//			}
//			
//		}
//		if(answer.equals("a")) {
//			if(x.attack() == true){
//				hMonster -= aHero;
//			}
//		}
//		
//		System.out.println("Now the dragon attacks you!");
//		
//			if(y.attack() == true){
//				hHero -= aMonster;
//			}
//	}
//}



public static boolean attack(int random) {
	if (random % 2 == 0) {
		return true; // means that hero will attack
	} else {
		return false; // means that hero will miss attack

	}
}




}