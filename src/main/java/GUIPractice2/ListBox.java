/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.event.ListSelectionEvent;

/**
 *
 * @author Jonathan
 */
public class ListBox extends JPanel{
    private JLabel result;
    private JList list;
    ColorList colors = new ColorList();
    
    ListBox() {
        super();
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(500,250));
        setLayout (new FlowLayout());
        DefaultListModel model = new DefaultListModel();
        list = new JList(model);
        list.setVisibleRowCount(10);
        JScrollPane scroll = new JScrollPane(list);
        for (String n : colors.getColors()) {
            model.addElement(n);
        }
        list.setBackground(Color.green);
        add(scroll);
        list.addListSelectionListener(this);
    }
    
    public void valueChanged(ListSelectionEvent evt) {
        ArrayList values = new ArrayList(list.getSelectedValuesList());
        System.out.println(values);
    }
}
