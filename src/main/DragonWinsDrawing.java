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
	         
	         gr.setColor(new Color(90, 58, 3));// /
	         gr.fillOval(45, 40, 30, 30);
	         gr.setColor(new Color(226, 192, 82));// /
	         gr.fillOval(50, 45, 20, 20);


		
	         gr.setColor(new Color(21, 4, 144));
	 		//                        x1   x2  x3               y1  y2   y3
			gr.fillPolygon(new int[] {300, 400, 400}, new int[] {100, 25, 100}, 3);
			
			gr.fillPolygon(new int[] {400, 400, 415}, new int[] {50, 25, 37}, 3);
			gr.fillPolygon(new int[] {400, 400, 430}, new int[] {100, 50, 100}, 3);
			gr.fillPolygon(new int[] {370, 405, 475, 430}, new int[] {100, 200, 200, 100}, 4);
			gr.fillPolygon(new int[] {405, 475, 475}, new int[] {200, 200, 300}, 3);
			gr.fillPolygon(new int[] {475, 475, 515, 515}, new int[] {200, 300, 350, 200}, 4);
			gr.fillPolygon(new int[] {515, 515, 700, 700}, new int[] {200, 350, 350, 200}, 4);
			gr.fillPolygon(new int[] {700, 700, 800, 800}, new int[] {200, 350, 300, 150}, 4);
			gr.fillPolygon(new int[] {560, 515, 700, 720}, new int[] {0, 200, 200, 0}, 4);//wing






			

		
	}
		
		

	}
