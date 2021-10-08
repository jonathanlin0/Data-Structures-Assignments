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
public class ComboBox extends JPanel implements ActionListener{
    
    private JComboBox box;
    private JLabel result;
    ColorList colors = new ColorList();
    
    ComboBox() {
        super();
        setBackground(Color.ORANGE);
        setPreferredSize(new Dimension(500,250));
        setLayout (new FlowLayout());
        box = new JComboBox();
        int i = 0;
        for (String n: colors.getColor()) {
            box.addItem(n);
            i++;
            if (i == 10) {
                break;
            }
        }
        box.setBackground(Color.green);
        add(box);
        box.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        String color = (String) box.getSelectedItem();
        int[] rgb = colors.getRGB(color);
        setBackground(new Color(rgb[0],rgb[1],rgb[2]));
    }
    
}
