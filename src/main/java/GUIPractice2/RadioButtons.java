/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;

import java.awt.Color;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.*;

/**
 *
 * @author Jonathan
 */
public class RadioButtons extends JPanel{
    public JRadioButton a,b,c;
    private JLabel result;
    
    RadioButtons() {
        super();
        setBackground(Color.pink);
        setPreferredSize(new Dimension(500,250));
        setLayout(new GridLayout (4,1));
        ButtonGroup gp = new ButtonGroup();
        a = new JRadioButton("Option a");
        a.setBackground(Color.green);
        add(a);
        gp.add(a);
        a.addActionListener(new ButtonHandler());
        b = new JRadioButton("Option b");
        add(b);
        gp.add(b);
        b.addActionListener(new ButtonHandler());
        c = new JRadioButton("Option c");
        add(c);
        gp.add(c);
        c.addActionListener(new ButtonHandler());
        result = new JLabel("Boxes Checked: ");
        add(result);
    }


class ButtonHandler implements ActionListener {
    
    public void actionPerformed (ActionEvent evt) {
        String text = "Boxes Checked: ";
        if (a.isSelected()) {
            text = text + "a ";
        }
        if (b.isSelected()) {
            text = text + "b ";
        }
        if (c.isSelected()) {
            text = text + "c ";
        }
        result.setText(text);
    }


}
}