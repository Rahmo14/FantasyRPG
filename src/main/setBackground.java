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

public class setBackground extends JComponent{
	
	public void paint(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		
		Rectangle trunk = new Rectangle (45, 45, 45, 100);
		g2.draw(trunk);
		//g2.setColor(new Color(128, 83, 15));
		
	}
}