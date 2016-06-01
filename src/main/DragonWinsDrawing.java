package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class DragonWinsDrawing extends JPanel {

	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);

		gr.setFont(new Font("serf", Font.BOLD, 68));
		gr.setColor(new Color(7, 27, 26));
		gr.setColor(new Color(54, 73, 192));
		gr.drawString("You", 75, 175);
		gr.setColor(new Color(7, 27, 26));
		gr.drawString("Lost", 90, 230);
		
		
		//ashes
		gr.setColor(new Color(121,120,120));
		gr.fillPolygon(new int[] {20, 60, 100}, new int[] {300, 190, 300}, 3);
		  gr.drawLine (60, 210, 60, 60);      //    > Sword
	         gr.drawLine (35, 80, 83, 80); 
	         gr.setColor(new Color(226, 192, 82));// /
	         gr.fillOval(55, 50, 10, 10);

		
		gr.setColor(new Color(98, 107, 199));
		gr.drawPolygon(new int[] {300, 500, 500}, new int[] {150, 50, 150}, 3);
		gr.drawLine (500, 125, 800, 125); 
		gr.drawLine (435, 200, 800, 200); 
		gr.drawPolygon(new int[] {300, 400, 500}, new int[] {200, 225, 150}, 3);
		 gr.setColor(new Color(182, 82, 15));
		gr.fillOval(300, 500, 40, 40);
		
	}
		
		

	}
