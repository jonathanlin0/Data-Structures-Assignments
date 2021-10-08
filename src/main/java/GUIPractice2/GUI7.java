/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Jonathan
 */
public class GUI7 extends JFrame{
    GUI7() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setTitle("GUI #7");
        setLocation(50,100);
        setLayout(new FlowLayout());
        Container bob34 = getContentPane();
        JPanel filepanel = new FilePanel();
        bob34.add(filepanel);
        JMenuBar mb = new JMenuBar();
        JMenu inputtedFile = new JMenu("File");
        JMenuItem open = inputtedFile.add(new JMenuItem("Open"));
        System.out.println(open);
        open.addActionListener((ActionListener) filepanel);
        mb.add(inputtedFile);
        JMenu color = new JMenu("Color");
        JMenuItem redOption = color.add(new JMenuItem("Red"));
        redOption.addActionListener((ActionListener) filepanel);
        JMenuItem yellow = color.add(new JMenuItem("Yellow"));
        yellow.addActionListener((ActionListener) filepanel);
        JMenuItem Green = color.add(new JMenuItem("Green"));
        Green.addActionListener((ActionListener) filepanel);
        mb.add(color);
        setJMenuBar(mb);
        pack();
        setVisible(true);
        
    }
}
