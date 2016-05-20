package main;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.Font;
import javax.swing.JFrame;

public class setBackground extends JComponent{
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle trunk = new Rectangle (45, 45, 45, 100);
		g2.draw(trunk);
		g2.setColor(new Color(128, 83, 15));
	}


	
	
	
	// background color changed to green
		public class Game extends JFrame {



		    }

		    public void run(DisplayMode dm) {
		        setBackground(Color.GREEN);
		        setForeground(Color.WHITE);
		        setFont(new Font("arial", Font.PLAIN, 24));
		        Screen s = new Screen();

		        try {
		            s.setFullScreen(dm, this);
		            try {
		                Thread.sleep(5000);
		            } catch (Exception E) {
		            }
		        } finally {
		            s.restoreScreen();
		        }
		    }

		    @Override
		    public void paint(Graphics g){
		        g.drawString("Check Screen", 200, 200);
		    }
		}
		
	}
	
}