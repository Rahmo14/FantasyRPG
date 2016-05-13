package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AnimatedFigure extends Applet {
	private int index = 0;
    private int horizontalmove = 0; // Horizontal Move counter
    int[] horiz = {45,40,35,30};
    int[] vert = {70,75,80,80};
    private int sleep = 100;
    
    public void start () {
    	 index = 0;
		 
	        // Initialize our horizontal move at 0
	     horizontalmove = 0; 
    }
    public void paint (Graphics gr)
    {
        gr.drawLine (0, 400,750,400);
	 
        gr.drawOval (20 + horizontalmove, 200, 50, 50); // Head
        gr.drawLine (45 + horizontalmove, 250, 45 + horizontalmove, 340); // Body
        gr.drawLine (45 + horizontalmove, 288, 65 + horizontalmove, 250); // Arm
        gr.drawLine (45 + horizontalmove, 340, 45 + horizontalmove, 400); // Straight leg
        gr.drawLine (45 + horizontalmove, 340, 65 + horizontalmove, 400); // Diagonal leg
        
        
       // gr.drawLine (30 ,60,horiz[index],vert[index]);
       // ++index;
       // ++horizontalmove;

        if(index == horiz.length)
            index = 0;
		
        // Once we reach 150, start back at zero.
        if (horizontalmove == 150) {
            horizontalmove = 0;
        }
        gr.setColor (Color.BLACK);
	 
        // Again add the horizontal move value to x coordinates
        gr.drawLine (30 + horizontalmove,60,horiz[index] + horizontalmove,vert[index]);
        try
        {
            Thread.sleep (sleep);
        }
        catch (InterruptedException e)
        {
        }
        repaint();
    }
    
    
}

