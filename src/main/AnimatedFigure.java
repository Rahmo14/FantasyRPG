package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class AnimatedFigure extends JPanel {
public int index = 0;
    public int horizontalmove = 0; // Horizontal Move counter
    public int fireballMove = 0;
    public int count = 0; // vertical move counter
    public int verticalmove = 0;
    public int counter = 0;
    int[] horiz = {45,40,35,30};
    int[] vert = {70,75,80,80};
    private int sleep = 100;
    
    public void start () {
    index = 0;
 
       // Initialize our horizontal move at 0
    horizontalmove = 0; 
    }
    public void verticalMove(){
    count = 0;
    verticalmove=0;
    }
    public void fireballMove(){
    	counter = 0;
    	fireballMove = 0;
    }
    @Override
    public void paintComponent(Graphics gr) {
    super.paintComponent(gr);
  //**************************************Hero Stick Figure***********************************************//
        gr.drawLine (0, 400,750,400); // Horizontal Line
        gr.drawOval (20 + horizontalmove, 200, 50, 50); // Head
        gr.drawLine (45 + horizontalmove, 250, 45 + horizontalmove, 340); // Body
        gr.drawLine (45 + horizontalmove, 300, 80 + horizontalmove, 265); // Arm1
        gr.drawLine (45 + horizontalmove, 300, 80 + horizontalmove, 300); // Arm2
        gr.drawLine (45 + horizontalmove, 340, 45 + horizontalmove, 400); // Straight leg
        //gr.drawLine (45 + horizontalmove, 340, 65 + horizontalmove, 400); // Diagonal leg
        gr.drawOval (77 + horizontalmove, 273, 6, 6);                     // \
        gr.drawLine (80 + horizontalmove, 273, 80 + horizontalmove, 170); //  > Sword
        gr.drawLine (70 + horizontalmove, 263, 90 + horizontalmove, 263); // /  
        gr.drawOval (70 + horizontalmove, 290, 20, 20); // Shield
        gr.drawOval (57 + horizontalmove, 277, 45, 45); // Shield     
  //**************************************Hero Stick Figure***********************************************//
        
        
  //**************************************Dragon Stick Figure***********************************************//
        gr.setColor(new Color(98,107,199));
        gr.drawLine(500, 210 - verticalmove, 540, 210-verticalmove);//head, 
        gr.drawLine(540, 210- verticalmove, 520, 250- verticalmove);//40 down, 40 across
        gr.drawLine(500, 210- verticalmove, 520, 250- verticalmove);
        gr.drawLine(510, 230- verticalmove, 510, 290- verticalmove);//neck line, 60 down
        gr.drawLine(530, 230- verticalmove, 530, 290- verticalmove);
        gr.drawLine(520, 210- verticalmove, 515, 203- verticalmove);//horns
        gr.drawLine(515, 203- verticalmove, 515, 210- verticalmove);
        gr.drawLine(520, 210- verticalmove, 525, 203- verticalmove);
        gr.drawLine(525, 203- verticalmove, 525, 210- verticalmove);
        gr.drawLine(510, 290- verticalmove, 570, 350- verticalmove);//chest line, 60 across, 60 down
        gr.drawLine(530, 290- verticalmove, 570, 300- verticalmove);
        gr.drawRect(570, 300- verticalmove, 90, 50- verticalmove);//body 90 across, 50 down
        gr.drawLine(660, 300- verticalmove, 700, 230- verticalmove); //tail line 70 up, 40 across
        gr.drawLine(660,350- verticalmove, 710, 260- verticalmove);
        gr.drawLine(700, 230- verticalmove, 720, 150- verticalmove);
        gr.drawLine(710, 260- verticalmove, 720, 150- verticalmove);
        gr.drawLine(570, 300- verticalmove, 600, 150- verticalmove);//wing
        gr.drawLine(600, 150- verticalmove, 680, 120- verticalmove);
        gr.drawLine(680, 120- verticalmove, 660, 300- verticalmove);
        gr.drawLine(570, 350- verticalmove, 580, 370- verticalmove);//legs, 10 across, 20 down
        gr.drawLine(580, 370- verticalmove, 590, 350- verticalmove);
        gr.drawLine(660,350- verticalmove,650,370- verticalmove);
        gr.drawLine(650, 370- verticalmove, 640, 350- verticalmove);
        gr.setColor(new Color (204,102,0));
        gr.drawOval(515 - fireballMove, 253-verticalmove, 15, 15);//fireball
        
   
  //**************************************Dragon Stick Figure***********************************************//


//        ++index;
        ++verticalmove;
        
        
        // Once we reach 305, start back at zero.
        if (horizontalmove == 300) {
            horizontalmove = 0;
        }
        if(verticalmove == 5){
        verticalmove = -5;
        }
        if(fireballMove == 435){
        	fireballMove = 0;
        }
        gr.setColor (Color.BLACK);
        // Again add the horizontal move value to x coordinates
        gr.drawLine (45 + horizontalmove, 340, 65 + horiz[index] + horizontalmove, 320 + vert[index]);
        try
        {
            Thread.sleep (sleep);
        }
        catch (InterruptedException e)
        {
        }
        repaint();
        
 
    }
    
    public void update() {
   
    index++;
    horizontalmove+=300;
    try
         {
             Thread.sleep (sleep);
         }
         catch (InterruptedException e)
         {
         }
         repaint();
    if(index == horiz.length)
            index = 0;
    }
    
    public void fireball(){
//    	int n = 0;
//    	while(fireballMove <= 400) {
//    		fireballMove++;
//    	}
//    	while(n < 5) {
//    		fireballMove = 400;
//    		n++;
//    	}
    	fireballMove+=435;
    	repaint();
     }
    
}