/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jonathan
 */
public class PanelGraphics extends JPanel{
    
    PanelGraphics() {
        setBackground(Color.white);
    }
    

    public void paintComponent(java.awt.Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.WHITE);
        g.drawArc(100, 45, 80, 80, 0, 360);

        g.setColor( Color.blue );
        g.drawArc( 120, 70, 10, 10, 0, 360);
        g.drawArc( 150, 70, 10, 10, 0, 360);


        g.setColor( Color.red );
        g.drawArc ( 110, 55, 60, 60, 0, -180 );
    }
    
}
