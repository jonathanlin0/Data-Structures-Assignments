/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jonathan
 */
public class GUI5 extends JFrame{
    
    GUI5() {
        super();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,600);
        setTitle("Practice");
        setLocation(50,100);
        setLayout(new FlowLayout());
        Container jpn = new ComboListeners();
        add(jpn);
        JPanel jps = new CheckBoxes();
        add(jps);
        JPanel jpx = new RadioButtons();
        add(jpx);
        pack();
        setVisible(true);
    }
    
}
