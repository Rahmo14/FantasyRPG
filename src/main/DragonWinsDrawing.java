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
		
		
		
		
		

	}
}
