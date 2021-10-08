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
public class GUI9 extends JFrame{
    GUI9() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setTitle("Jonathan");
        setLocation(50,100);
        setLayout (new FlowLayout());
        Container jfp = getContentPane();
        JPanel jpn = new Doodle();
        add(jpn);
        pack();
        setVisible(true);
    }
}
