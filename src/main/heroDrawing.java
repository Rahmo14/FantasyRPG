package main;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;

//Drawing of the warrior in the Choose Character window

public class heroDrawing extends JPanel {
	int horizontal = 0;
	int count = 0;
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
	         gr.fillOval(540, 130, 100, 100);
	         
	         gr.setColor(new Color(201,189,21));//sun
	         gr.fillOval(270,30,100,100);
	         
	     	gr.setColor(new Color(247,247,228));//cloud
			gr.fillOval(20+horizontal, 20, 50, 50);
			gr.fillOval(50+horizontal, 0, 70, 70);
			gr.fillOval(90+horizontal, 0, 70, 70);
			gr.fillOval(130+horizontal, 20, 50, 50);
			gr.fillOval(200+horizontal, 20, 50, 50);//cloud2
			gr.fillOval(230+horizontal, 0, 70, 70);
			gr.fillOval(260+horizontal, 0, 70, 70);
			gr.fillOval(300+horizontal, 20, 50, 50);
			gr.fillOval(400+horizontal, 20, 50, 50);//cloud3
			gr.fillOval(430+horizontal, 0, 70, 70);
			gr.fillOval(470+horizontal, 0, 70, 80);
			gr.fillOval(500+horizontal, 0, 70, 70);
			gr.fillOval(540+horizontal, 20, 50, 50);
	         
	         gr.setColor(new Color(150,249,142));
	         gr.setFont(new Font("serf", Font.BOLD, 30));
	         gr.drawString("Welcome to Dragon Slayer!",30,460);
	         gr.setFont(new Font("serf", Font.BOLD, 18));
	         gr.drawString("Use the attack button to attack. Through random selection, either the dragon",30,500);
	         gr.drawString("or the hero will attack. Both you and the dragon have 100 health points.",30,525);
	         gr.drawString("You may use the heal button a maximum of 3 times to gain back health points.",30,550);
	         gr.drawString("If attacked, you will lose 7 health points. If you attack the dragon, you will lose", 30, 575);
	         gr.drawString("5 health points. The first one to lose all their health points loses.", 30, 600);
	         gr.setColor(new Color(130,242,193));
	         gr.setFont(new Font("serf", Font.BOLD, 20));
	         gr.drawString("Good luck and may the odds be ever in your favor *whistles*", 30, 650);
	        
	         ++horizontal;
				if(horizontal == 150){
					horizontal = -150;
				}
				
			repaint();
	         
	         
	 }   
	

}
