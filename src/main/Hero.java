package main;

import java.awt.Graphics;

public class Hero implements PaintComponent {
	int myhealth;
	int myattack;
	int x = 0; // Horizontal Move counter for randomMove()
	int xAtk = 0; //Horizontal Move counter for attack() (Also found in the randomMove() method
	int index = 0;
	int[] horiz = {45,40,35,30};


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

	public static int random() {
		return (int) (Math.random() * 10);
	}

	public static boolean attackOne() {
		if (random() % 2 == 0) {
			return true; // means that hero will attack
		} else {
			return false; // means that hero will miss attack

		}
	}

	@Override
	public void paintComponent(Graphics gr) {
		// TODO Auto-generated method stub
		gr.drawLine(0, 400, 750, 400); // Horizontal Line
		gr.drawOval(20 + x + xAtk, 200, 50, 50); // Head
		gr.drawLine(45 + x + xAtk, 250, 45 + x + xAtk, 340); // Body
		gr.drawLine(45 + x + xAtk, 300, 80 + x + xAtk, 265); // Arm1
		gr.drawLine(45 + x + xAtk, 300, 80 + x + xAtk, 300); // Arm2
		gr.drawLine(45 + x + xAtk, 340, 45 + x + xAtk, 400); // Straight								
		gr.drawLine (45 + x + xAtk, 340, 65 + x + xAtk, 400); 
		gr.drawOval(77 + x + xAtk, 273, 6, 6);       // \
		gr.drawLine(80 + x + xAtk, 273, 80 + x + xAtk, 170); // Sword
		gr.drawLine(70 + x + xAtk, 263, 90 + x + xAtk, 263); // /
		gr.drawOval(70 + x + xAtk, 290, 20, 20); // Shield
		gr.drawOval(57 + x + xAtk, 277, 45, 45); // Shield
		
	}

	public void attack() {
		index++;
	    xAtk+=300;
	    new java.util.Timer().schedule( 
	            new java.util.TimerTask() {
	                @Override
	                public void run() {
	                	 if (xAtk == 300) {
	             			xAtk = 0;
	             		}
	                }
	            }, 
	            1000 
	    );
	}

	@Override
	public void randomMove() {
		// TODO Auto-generated method stub
		if (x == 10) {
			x = 0;
		}
		else if (x == 0) {
			x = 10;
		}
//		if (xAtk == 300) {
// 			xAtk = 0;
//		}
	}

}
