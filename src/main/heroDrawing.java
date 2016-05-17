package main;
import java.awt.Graphics;
import javax.swing.JPanel;


//Drawing of the warrior in the Choose Character window

public class heroDrawing extends JPanel {
	 @Override
	    public void paintComponent(Graphics gr) {    
	    	super.paintComponent(gr);
	         gr.drawOval (50, 100, 80, 80);  // Head
	         gr.drawLine (75, 175, 75, 275); // Body
	         gr.drawLine (45, 300, 80, 265); // Arm1
	         gr.drawLine (45, 300, 80, 300); // Arm2
	         gr.drawLine (45, 340, 45, 400); // Straight leg
	         gr.drawOval (77, 273, 6, 6);    // \
	         gr.drawLine (80, 273, 80, 170); //  > Sword
	         gr.drawLine (70, 263, 90, 263); // /  
	         gr.drawOval (70, 290, 20, 20);  // Shield
	         gr.drawOval (57, 277, 45, 45);  // Shield     
	 }    
}
