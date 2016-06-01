package main;

import java.awt.Color;
import java.awt.Graphics;

public class Hero implements PaintComponent {
	int myhealth;
	int myattack;
	int x = 0; // Horizontal Move counter for randomMove()
	int xAtk = 0; //Horizontal Move counter for attack() (Also found in the randomMove() method
	int index = 0;
	int[] horiz = {45,40,35,30};
	int ySword = 0;
	Color color = (new Color(0,0,0));

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
		gr.setColor(new Color(0,0,0));
		gr.drawLine(0, 400, 750, 400); // Horizontal Line
		gr.setColor(color);
		gr.drawOval(20 + x + xAtk, 200, 50, 50); // Head
		gr.drawLine(45 + x + xAtk, 250, 45 + x + xAtk, 340); // Body
		gr.drawLine(45 + x + xAtk, 300, 80 + x + xAtk, 265 + ySword); // Arm holding sword
		gr.drawLine(45 + x + xAtk, 300, 80 + x + xAtk, 300); // Arm holding shield
		gr.drawLine(45 + x + xAtk, 340, 45 + x + xAtk, 400); // Straight								
		gr.drawLine(45 + x + xAtk, 340, 65 + x + xAtk, 400); 
		gr.drawOval(77 + x + xAtk, 273 + ySword, 6, 6);       // \
		gr.drawLine(80 + x + xAtk, 273 + 2*ySword, 80 + x + xAtk + ySword, 170 + ySword); // Sword
		gr.drawLine(70 + x + xAtk, 263 + ySword, 90 + x + xAtk, 263 + ySword); // /
		
		gr.setColor(new Color(97, 60, 6));
		gr.fillOval(70 + x + xAtk, 290, 20, 20); // Shield
		gr.setColor(new Color(145, 132, 114));
		gr.fillOval(57 + x + xAtk, 277, 45, 45); // Shield
		
	}


	public void attack() {
		index++;
	    xAtk+=400;
	    new java.util.Timer().schedule( 
	            new java.util.TimerTask() {
	                @Override
	                public void run() {
	                	 if (xAtk == 400) {
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
		
		if (xAtk == 400){
			x = 0;
	    	if (ySword == 10) {
				ySword = 0;
			}
			else if (ySword == 0) {
				ySword = 10;
			}
	    }
	}

	@Override
	public void paintRed() {
		color = (new Color(255,0,0));
		new java.util.Timer().schedule( 
	            new java.util.TimerTask() {
	                @Override
	                public void run() {
	                	 color = new Color(0,0,0);
	                }
	            }, 
	            200 
	    );
		
	}

}
