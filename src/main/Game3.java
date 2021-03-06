package main;

import java.awt.GridLayout;
import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Game3 {//hi guYS
	
	static Hero player = new Hero(20, 3);
	static Monster monster = new Monster(15, 5);
	static int healthHero = 100;
	static int healthMonster = 100;
	static int attkHero = 5;
	static int atkDragon = 7;
	static JLabel hpHero = new JLabel("Your health: " + healthHero + "     ");
	
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
			character.setSize(800, 800);
			//JLabel label = new JLabel("Choose your Character");
			JButton warrior = new JButton("Let's play");
			heroDrawing hero = new heroDrawing();	
			//hero.add(label, BorderLayout.PAGE_START);
			hero.add(warrior, BorderLayout.PAGE_END);
			character.add(hero);
			warrior.addActionListener(new ActionTwo());
		}
	}

			static class ActionTwo implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					JFrame game = new JFrame("Game");
					JButton swordHero = new JButton("Attack");
					JButton healHero = new JButton("Heal");
					JPanel pane  = new JPanel(new BorderLayout());
					game.add(pane);
					game.setVisible(true);
					game.setSize(750, 480);
					Background background = new Background();
				//Create object where every figure will be drawn	
					AnimatedFigure screen = new AnimatedFigure();
					screen.components.add(background);
					screen.components.add(player);
					screen.components.add(monster);
					screen.add(swordHero, BorderLayout.PAGE_END);
					screen.add(healHero, BorderLayout.PAGE_END);
					healHero.addActionListener(new ActionHeal());
					
					JLabel hpMonster = new JLabel("Dragon's health: " + healthMonster);
					screen.add(hpHero);
					screen.add(hpMonster);
					
					
	// The actual game begins here ¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬	
				//Attack with sword	
					swordHero.addActionListener(new ActionListener () {
						public void actionPerformed(ActionEvent e) {	
							int rand = player.random();
							boolean heroAttack = attack(rand);			
							if (heroAttack == false) {
								//hero1.add(label, BorderLayout.PAGE_START);
								monster.attack();
								healthHero-=atkDragon;
								System.out.println("Hero: " + healthHero);
								hpHero.setText("Your health: " + healthHero + "     ");
								player.paintRed();
							}
							else {
								player.attack();
								healthMonster-=attkHero;
								System.out.println("Dragon: " + healthMonster);
								hpMonster.setText("Dragon's health: " + healthMonster);
								monster.paintRed();
							}
								if(healthHero <= 0) {
									swordHero.addActionListener(new ActionFive());
								}
								else if (healthMonster<= 0) {
									swordHero.addActionListener(new ActionFour());
								}
						}
						
					});
				
					game.add(screen);
				}
			}
							static class ActionFour implements ActionListener {
								public void actionPerformed (ActionEvent e) {
									JFrame end = new JFrame("Test");
									end.setVisible(true);
									end.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									end.setSize(800, 800);
									HeroWinsDrawing playerWon = new HeroWinsDrawing();
									end.add(playerWon);
								}
							}
							
							static class ActionFive implements ActionListener {
								public void actionPerformed (ActionEvent e) {
									JFrame end = new JFrame("Test");
									end.setVisible(true);
									end.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									end.setSize(800, 400);
									DragonWinsDrawing playerLost = new DragonWinsDrawing();
									end.add(playerLost);
								}
							}
							
							static class ActionHeal implements ActionListener {
								public void actionPerformed (ActionEvent e) {
									//int maxHealth = 30;
									int heal = 10;
									if ( healthHero <= 30) {
										healthHero+=heal;
									}
										hpHero.setText("Your health: " + healthHero + "     ");
								}
							}


public static boolean attack(int random) {
	if (random % 2 == 0) {
		return true; // means that hero will attack
	} else {
		return false; // means that hero will miss attack

	}
}




}