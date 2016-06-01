package main;

import java.awt.Graphics;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import java.awt.Font;
import java.awt.Color;

public class titleDrawing extends JPanel {
	int count = 0;
	int horizontal = 0;
	public void horizontal(){
		count = 0;
		horizontal = 0;
	}
	@Override
	public void paintComponent(Graphics gr) {
		super.paintComponent(gr);

		// Write code for title game "Dragon Slayer"

		// gr.drawLine (100, 100, 100, 100);

		// gr.drawLine(50, 175, 75, 275); //r
		// gr.drawLine(75, 175, 75, 275);
		// gr.drawLine(50, 175, 75, 275);// L
		// gr.drawLine(75, 175, 75, 275);
		// gr.drawOval(150, 175, 75, 100); // O
		// gr.drawLine(50,175,75,150);
		// gr.drawLine(175,50,75, 150);
		gr.setColor(new Color(243,227,120));
		gr.fillRect(0, 0, 800, 800);
		gr.setFont(new Font("serf", Font.BOLD, 68));
		gr.setColor(new Color(7, 27, 26));
		gr.drawString("Dragon", 75, 175);
		gr.setColor(new Color(54, 73, 192));
		gr.drawString("Slayer", 90, 230 );
		gr.setColor(new Color(75,69,36));//sword
		gr.fillOval(40+horizontal, 50, 60, 60);
		gr.setColor(new Color(174,151,40));
		gr.fillOval(50+horizontal, 60, 40, 40);
		gr.setColor(new Color(0,0,0));
		gr.fillRect(100+horizontal, 80, 150, 7);
		gr.fillRect(115+horizontal, 65, 7, 40);
		
		//title
		//try again
		//try again
		++horizontal;
		if(horizontal == 80){
			horizontal = -80;
		}
	}
	public void horizontalmove(){
		++horizontal;
		if(horizontal == 80){
			horizontal = -80;
		}
	}
}
