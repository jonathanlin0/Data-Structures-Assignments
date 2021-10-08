/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class CheckBoxes extends JPanel implements ItemListener{
    private JCheckBox a,b,c;
    private JLabel result;
    
    CheckBoxes() {
        super();
        setBackground(Color.pink);
        setPreferredSize(new Dimension(500,250));
        setLayout (new GridLayout (4,1));
        a = new JCheckBox("Option a");
        a.setBackground(Color.green);
        add(a);
        a.addItemListener(this);
        b = new JCheckBox("Option b");
        add(b);
        b.addItemListener(this);
        c = new JCheckBox("Option c");
        add(c);
        c.addItemListener(this);
        result = new JLabel ("Boxes checked:  ");
        add(result);
    }
    
    public void itemStateChanged(ItemEvent evt) {
        String text = "Boxes checked: ";
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
