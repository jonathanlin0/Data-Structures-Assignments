/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author Jonathan
 */
public class GUI8 extends JFrame {
    GUI8() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setTitle("GUI Stuff");
        setLocation(50,100);
        setLayout(new FlowLayout());
        Container jfp = getContentPane();
        JPanel jcb = new ComboBox();
        add(jcb);
        JPanel lb = new ListBox();
        add(lb);
        pack();
        setVisible(true);
    }
}
