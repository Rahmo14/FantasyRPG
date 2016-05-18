package main;
import java.awt.Graphics;
import javax.swing.JPanel;


//Drawing of the warrior in the Choose Character window

public class heroDrawing extends JPanel {
	 @Override
	    public void paintComponent(Graphics gr) {    
	    	super.paintComponent(gr);
	         gr.drawOval (50, 100, 80, 80);  // Head
	         gr.drawLine (90, 180, 90, 325); // Body
	         gr.drawLine (90, 220, 150, 220); // Right arm
	         gr.drawLine (90, 220, 25, 200); // Left arm
	         gr.drawLine (90, 325, 125, 400); // Right leg
	         gr.drawLine (90, 325, 55, 400); // Left leg
	         
	         gr.drawOval (20, 210, 10, 10);    // \
	         gr.drawLine (25, 210, 25, 60); //  > Sword
	         gr.drawLine (10, 190, 40, 190); // /  
	         
	         gr.drawOval (135, 206, 30, 30);  // Shield
	         gr.drawOval (120, 190, 60, 60);  // Shield     
	 }    
}
