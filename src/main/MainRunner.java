package main;

import java.awt.Color;
import java.awt.DisplayMode;
import java.awt.FlowLayout;

import javax.swing.JFrame;

//import main.setBackground.Game;

public class MainRunner {

	public static void main(String[] args) {
		JFrame window = new JFrame(); // Creates a frame to display graphics in2
		window.setSize(750, 480);
		window.setTitle("Window of Characters");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AnimatedFigure stick = new AnimatedFigure();
		setBackground background = new setBackground();
		window.add(stick);
		window.setVisible(true);

		// for the background color

		DisplayMode dm = new DisplayMode(800, 600, 16, DisplayMode.REFRESH_RATE_UNKNOWN);
		Game g = new Game();
		//g.run(dm);
		
	}
}
