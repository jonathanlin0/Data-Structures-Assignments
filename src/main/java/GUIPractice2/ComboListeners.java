/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;

import java.awt.Color;
import static java.awt.Color.cyan;
import static java.awt.Color.magenta;
import static java.awt.Color.yellow;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class ComboListeners extends JPanel{
    
    private JButton yellow, cyan, magenta;
    
    ComboListeners() {
        super();
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(500,150));
        BH bh = new BH();
        yellow = new JButton("Yellow");
        yellow.setBackground(Color.yellow);
        add(yellow);
        yellow.addActionListener(bh);
        cyan = new JButton("Cyan");
        cyan.setBackground(Color.cyan);
        add(cyan);
        cyan.addActionListener(bh);
        magenta = new JButton("Magenta");
        magenta.setBackground(Color.magenta);
        add(magenta);
        magenta.addActionListener(bh);
    }
}

class BH implements ActionListener {
    public void actionPerformed(ActionEvent evt) {
        Object ob = evt.getSource();
        if (ob == yellow) {
            setBackground(Color.yellow);
        } else if (ob == cyan) {
            setBackground(Color.cyan);
        } else if (ob == magenta) {
            setBackground(Color.magenta);
        }
        repaint();
    }

    private void setBackground(Color yellow) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void repaint() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
