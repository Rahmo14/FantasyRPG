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
	 
        // Add horizontal move to each line to make it move its x coordinate
        gr.drawOval (20 + horizontalmove,200,50,50);
        gr.drawLine (45 + horizontalmove,250,45 + horizontalmove,350);
        gr.drawLine (45 + horizontalmove,350,45 + horizontalmove,400);
        gr.setColor (Color.WHITE);
        gr.drawLine (30 ,60,horiz[index],vert[index]);
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

