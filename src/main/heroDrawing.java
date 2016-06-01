package main;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

//Drawing of the warrior in the Choose Character window

public class heroDrawing extends JPanel {
	 @Override
	    public void paintComponent(Graphics gr) {    
	    	super.paintComponent(gr);
	    	gr.setColor(new Color(162,224,243));
	         gr.fillRect(0, 0, 800, 400);
	         gr.setColor(new Color(0,0,0));
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
	         
	         gr.setColor(new Color(17,92,32)); //grass
	         gr.fillRect(0, 400, 800, 450);
	         
	         gr.setColor(new Color(80,58,8));//tree trunk
	         gr.fillRect(600, 200, 100, 200);
	         
	         gr.setColor(new Color(9,159,9)); //leaves
	         gr.fillOval(600,150,80,80);
	         gr.fillOval(650, 150, 80, 80);
	         gr.fillOval(550,150,80,80);
	         gr.fillOval(670, 120, 100, 100);
	         gr.fillOval(570, 120, 100, 100);
	         gr.fillOval(620, 120, 100, 100);
	         gr.fillOval(620, 70, 100, 100);
	         gr.fillOval(570, 70, 80, 80);
	         gr.fillOval(550, 110, 60, 60);
	         
	         gr.setColor(new Color(201,189,21));//sun
	         gr.fillOval(270,30,100,100);
	         
	         
	 }    
}
