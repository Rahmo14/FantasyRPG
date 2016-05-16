package main;

import java.awt.GridLayout;
import java.util.Scanner;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class Game {
public static void main(String[] args){
//	Hero player = new Hero(20, 3);
//	Monster dragon = new Monster(15, 5);
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
	panel.add(button);
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
//			figure.addMouseMotionListener(new MouseMotionListener() {
//
//				@Override
//				public void mouseDragged(MouseEvent e) {
//					// TODO Auto-generated method stub
//					
//				}
//
//				@Override
//				public void mouseMoved(MouseEvent e) {
//					// TODO Auto-generated method stub
//					figure.update();
//					System.out.println("Mouse movement");
//				}
//				
//			});
		}
	}

			static class ActionTwo implements ActionListener {
				public void actionPerformed(ActionEvent e) {
					JFrame game = new JFrame("Game");
					game.setVisible(true);
					game.setSize(750, 480);
					AnimatedFigure hero = new AnimatedFigure();
					//monster animation = new monsteranimation
					game.add(hero);
					//game.add(monsteranimation, BorderLayout.LINE_END);
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


}
