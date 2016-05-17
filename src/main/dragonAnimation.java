package main;

import java.awt.Graphics;
import javax.swing.JPanel;

public class dragonAnimation extends JPanel {
	@Override
    public void paintComponent(Graphics gr) {    
    	super.paintComponent(gr);
    	gr.drawLine(550, 300, 600, 300);
    	gr.drawLine(550,300,490,260);
    	gr.drawLine(600, 300, 490, 260);
    	gr.drawLine(600, 300, 590, 340);
    	gr.drawLine(590, 340, 580, 300);
    	//Add lines and whatnot here
    	
    	
    	
	}
}
