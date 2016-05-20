package main;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

public class titleDrawing extends JPanel {
	@Override
	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);

		// Write code for title game "Dragon Slayer"

		gr.drawLine (100, 100, 100, 100);
		
		gr.drawLine(50, 175, 75, 275); //r
		gr.drawLine(75, 175, 75, 275);
		gr.drawLine(50, 175, 75, 275);// L
		gr.drawLine(75, 175, 75, 275);
		gr.drawOval(150, 175, 75, 100); // O
		gr.drawLine(50,175,75,150);
		gr.drawLine(175,50,75, 150);
		
		
		
		
		



	   

		

	}
}
