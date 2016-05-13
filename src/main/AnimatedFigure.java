package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class AnimatedFigure extends Applet {
	public int index = 0;
    public int horizontalmove = 0; // Horizontal Move counter
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
        
        gr.drawOval (70 + horizontalmove, 290, 20, 20); //  > Shield
        gr.drawOval (57 + horizontalmove, 277, 45, 45); // / 
       
        
        gr.drawLine (30 ,60,horiz[index],vert[index]);
//        ++index;
//        ++horizontalmove;

        if(index == horiz.length)
            index = 0;
		
        // Once we reach 150, start back at zero.
        if (horizontalmove == 150) {
            horizontalmove = 0;
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
    
    
}

