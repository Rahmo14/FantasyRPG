package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Background implements PaintComponent{
	int horizontal = 0;
	int count = 0;
	@Override
	
	public void paintComponent(Graphics g2) {
		// TODO Auto-generated method stub
		g2.setColor(new Color(158,92,18));//ground
		g2.fillRect(0, 400, 800, 400);
		g2.setColor(new Color(210,152,51));
		g2.fillRect(0, 420, 800, 70);
		g2.setColor(new Color(246,244,171));//sky
		g2.fillRect(0, 0, 800, 400);
		g2.setColor(new Color(247,247,228));//cloud
		g2.fillOval(20+horizontal, 30, 60, 60);
		g2.fillOval(50+horizontal, 10, 80, 80);
		g2.fillOval(90+horizontal, 10, 80, 80);
		g2.fillOval(130+horizontal, 30, 60, 60);
		g2.fillOval(200+horizontal, 30, 60, 60);//cloud2
		g2.fillOval(230+horizontal, 10, 80, 80);
		g2.fillOval(260+horizontal, 10, 80, 80);
		g2.fillOval(300+horizontal, 30, 60, 60);
		g2.fillOval(400+horizontal, 30, 60, 60);//cloud3
		g2.fillOval(430+horizontal, 10, 80, 80);
		g2.fillOval(470+horizontal, 10, 80, 80);
		g2.fillOval(500+horizontal, 10, 80, 80);
		g2.fillOval(540+horizontal, 30, 60, 60);
		
		
		
	}
	
	

	@Override
	public void randomMove() {
		// TODO Auto-generated method stub
		++horizontal;
		if(horizontal == 120){
			horizontal = -120;
		}
		
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void paintRed() {
		// TODO Auto-generated method stub
		
	}
	

}
