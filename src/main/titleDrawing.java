package main;

import java.awt.Graphics;
import javax.swing.JPanel;

public class titleDrawing extends JPanel {
	@Override
	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);

		// Write code for title game "Dragon Slayer"

		// gr.drawLine (100, 100, 100, 100);

		gr.drawLine(75, 175, 70, 275);
		gr.drawLine(50, 175, 75, 275);// L
		gr.drawOval(100, 175, 75, 100); // O
		// gr.drawLine(50,175,75,150);
		// gr.drawLine(175,50,75, 150);

		// lakdfja;slkdfjals;kdfj

	}
}
