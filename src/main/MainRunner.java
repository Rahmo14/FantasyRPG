package main;

import javax.swing.JFrame;

public class MainRunner {

	public static void main(String[] args) {
		JFrame window = new JFrame(); // Creates a frame to display graphics in
		window.setSize(750, 480);
		window.setTitle("Window of Characters");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		AnimatedFigure stick = new AnimatedFigure();
		window.add(stick);
		window.setVisible(true);
		
		// hello
	}
}
