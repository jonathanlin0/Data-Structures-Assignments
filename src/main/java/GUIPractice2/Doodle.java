/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author Jonathan
 */
public class Doodle extends JPanel{
    private Point lineStart = new Point(0,0);
    
    Doodle() {
        super();
        setBackground(Color.cyan);
        setPreferredSize( new Dimension(500,500));
        addMouseListener (new Pressed());
        addMouseMotionListener(new Dragged());
        
    }
    

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.blue);
        g.drawString("Left Button draws", 10, 20);
        g.drawString("Shift Drag erases",10,35);
        g.drawString("Double Click clears", 10, 50);
    }
    
    class Pressed extends MouseAdapter {
        public void mousePressed(MouseEvent e) {
            int x = e.getX(), y = e.getY();
            lineStart = new Point(x,y);
            Graphics g = getGraphics();
            if (e.isShiftDown()) {
                g.setColor(getBackground());
            } else {
                g.setColor(Color.red);
                System.out.println(g.getColor());
            }
            if (e.getClickCount() == 2) {
                repaint();
            }else {
                lineStart.move(x,y);
            }
        }
    }
    
    class Dragged extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e) {
            int x = e.getX(), y = e.getY();
            int size = 16;
            Graphics g = getGraphics();
            if (e.isShiftDown()) {
                g.setColor(getBackground());
                g.fillOval(x-size/2,y-size/2,size,size);
            } else {
                g.setColor(Color.red);
                g.drawLine(lineStart.x, lineStart.y, x,y);
            }
            lineStart.move(x,y);
        }
    }
}
