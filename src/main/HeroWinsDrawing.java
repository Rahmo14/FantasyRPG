package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HeroWinsDrawing extends JPanel {
	
	public void paintComponent(Graphics gr) {
    super.paintComponent(gr);
    gr.setColor(new Color(240,237,152));
    gr.fillRect(0, 0, 1000, 1000);
    gr.setColor(new Color(158,92,18));//ground
	gr.fillRect(0, 415, 800, 400);
	gr.setColor(new Color(210,152,51));
	gr.fillRect(0, 415, 800, 70);
    gr.setColor(new Color(0, 0, 0));
    gr.drawOval (50, 100, 80, 80);  // Head
    gr.drawLine (90, 180, 90, 325); // Body
    gr.drawLine (90, 220, 150, 220); // Right arm
    gr.drawLine (90, 220, 25, 200); // Left arm
    gr.drawLine (90, 325, 150, 370); // Right leg
    gr.drawLine (90, 325, 55, 400); // Left leg
    
    gr.drawLine (25, 210, 25, 60);      //    > Sword
    gr.drawLine (10, 190, 40, 190);     //   /  
    gr.setColor(new Color(226, 192, 82));// /
    gr.fillOval(20, 210, 10, 10);
    
    gr.setColor(new Color(145, 132, 114));
    gr.fillOval(120, 190, 60, 60);        //Shield
    gr.setColor(new Color(97, 60, 6));
    gr.fillOval(135, 206, 30, 30);
   
    gr.setColor(new Color(98, 107, 199));
    gr.drawLine(130,380,150,370);//dragon head
    gr.drawLine(150, 370, 210, 340);
    gr.drawLine(150, 370, 210, 340);
    gr.drawLine(210,340,210,410);
    gr.drawLine(210, 410, 130, 380);
    gr.drawLine(210, 410, 360, 410);//neck
    gr.drawLine(210, 360, 360, 360);//neck
    gr.drawLine(360, 360, 360,520);//wing
    gr.drawLine(360,520,430,480);
    gr.drawLine(430, 480, 500, 360);
    gr.drawLine(210,360,250,340);
    gr.drawLine(250, 340, 210, 340);
    gr.drawLine(500,360,360,360);
    gr.setColor(new Color(81,26,26));
    gr.fillOval(183, 360, 7, 7); //eye
    gr.drawLine(181, 358, 192, 369);
    gr.drawLine(192, 358, 181, 369);
   
    gr.setFont(new Font("serf", Font.BOLD, 68));
	gr.setColor(new Color(52, 191, 206));
	gr.drawString("VICTORY!", 400, 175);
	gr.setColor(new Color(56, 125, 10));
	gr.drawString("You won!", 400, 270 );
    
	
	}
}
