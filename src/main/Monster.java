package main;

import java.awt.Color;
import java.awt.Graphics;

public class Monster extends Hero implements PaintComponent {
	int y = 0;
	int fireballMove = 0;
	int count = 0; // vertical move counter
	int counter = 0;
	Color color = new Color(98, 107, 199);

	public Monster(int health, int attack) {
		super(health, attack);

	}

	@Override
	public void paintComponent(Graphics gr) {
		// TODO Auto-generated method stub
		gr.setColor(color);
		gr.drawLine(500, 210 - y, 540, 210 - y);// head,
		gr.drawLine(540, 210 - y, 520, 250 - y);
		gr.drawLine(500, 210 - y, 520, 250 - y);
		gr.drawLine(510, 230 - y, 510, 290 - y);
		gr.drawLine(530, 230 - y, 530, 290 - y);
		gr.drawLine(520, 210 - y, 515, 203 - y);// horns
		gr.drawLine(515, 203 - y, 515, 210 - y);
		gr.drawLine(520, 210 - y, 525, 203 - y);
		gr.drawLine(525, 203 - y, 525, 210 - y);
		gr.drawLine(510, 290 - y, 570, 350 - y);
		gr.drawLine(530, 290 - y, 570, 300 - y);
		gr.drawRect(570, 300 - y, 90, 50 - y);
		gr.drawLine(660, 300 - y, 700, 230 - y); // tail
		gr.drawLine(660, 350 - y, 710, 260 - y);
		gr.drawLine(700, 230 - y, 720, 150 - y);
		gr.drawLine(710, 260 - y, 720, 150 - y);
		gr.drawLine(570, 300 - y, 600, 150 - y);// wing
		gr.drawLine(600, 150 - y, 680, 120 - y);
		gr.drawLine(680, 120 - y, 660, 300 - y);
		gr.drawLine(570, 350 - y, 580, 370 - y);// legs,
		gr.drawLine(580, 370 - y, 590, 350 - y);
		gr.drawLine(660, 350 - y, 650, 370 - y);
		gr.drawLine(650, 370 - y, 640, 350 - y);

		// Fireball drawing begins
		gr.setColor(new Color(204, 102, 0));
		gr.fillOval(515 - fireballMove, 253 - y, 15, 15);
		// gr.drawOval(515 - fireballMove, 253 - y, 15, 15);// fireball
	}

	public void verticalMove() {
		count = 0;
		y = 0;
	}

	public void fireballMove() {
		counter = 0;
		fireballMove = 0;
	}

	public void randomMove() {
		++y;
		if (y == 5) {
			y = -5;
		}
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				if (fireballMove == 435) {
					fireballMove = 0;
				}
			}
		}, 1000);

	}

	public void attack() {
		fireballMove += 435;

	}

	public void paintRed() {
		color = new Color(255, 0, 0);
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				color = new Color(98, 107, 199);
			}
		}, 1000);
	}

}
