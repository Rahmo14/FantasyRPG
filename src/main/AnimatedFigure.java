package main;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

public class AnimatedFigure extends JPanel {
    
   
    int[] horiz = {45,40,35,30};
    int[] vert = {70,75,80,80};
    ArrayList<PaintComponent> components = new ArrayList<>();
    
    public void start () {
    
 
    
    }
   
   
    @Override
    public void paintComponent(Graphics gr) {
    super.paintComponent(gr);
  
        for(PaintComponent c : components) {
        	c.paintComponent(gr);
        	c.randomMove();
        }
 
      
        
        
       
       
        gr.setColor (Color.BLACK);
        // Again add the horizontal move value to x coordinates
        
        try
        {
            Thread.sleep (100);
        }
        catch (InterruptedException e)
        {
        }
        repaint();
        
 
    }
    
  
     
}