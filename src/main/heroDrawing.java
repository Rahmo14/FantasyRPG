package main;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

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
	         
	         gr.drawLine (25, 210, 25, 60);      //    > Sword
	         gr.drawLine (10, 190, 40, 190);     //   /  
	         gr.setColor(new Color(226, 192, 82));// /
	         gr.fillOval(20, 210, 10, 10);
	         
	         gr.setColor(new Color(145, 132, 114));
	         gr.fillOval(120, 190, 60, 60);        //Shield
	         gr.setColor(new Color(97, 60, 6));
	         gr.fillOval(135, 206, 30, 30);
	       

	 }    
}
