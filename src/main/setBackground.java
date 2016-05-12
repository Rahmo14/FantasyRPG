package main;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;

public class setBackground{
public static void main(String[] args) {
    SwingUtilities.invokeLater(new Runnable() {
        @Override
        public void run() {
            JFrame frame = new JFrame("Draw Rectangle");
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.add(new JPanel() {
                protected void paintComponent(Graphics g) {
                    //
                    // Draw a rectangle using Rectangle2D class
                    //
                    
                    g.setColor(Color.RED);

                    double x = 100;
                    double y = 100;
                    double width = x + 200;
                    double height = y + 50;
                   
                    //
                    // Draw the red rectangle
                    //
                    g.draw(new Rectangle2D.Double(x, y, width, height));

                    g.setColor(Color.BLUE);
                    //
                    // Draw the blue rectangle
                    //
                    g.draw(new Rectangle2D.Double(150, 50, 200, 250));
                }
            }, BorderLayout.CENTER);

            frame.pack();
            frame.setSize(new Dimension(500, 400));
            frame.setVisible(true);
        }
    });
}
}