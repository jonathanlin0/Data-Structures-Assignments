/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Jonathan
 */
public class Graphics{

    static JPanel third;
    static JLabel dynamicText;
    
    public static void main(String[] args) {
        JFrame jf = new JFrame("title");
        jf.setSize(500, 800);
        jf.setVisible(true);
        jf.setTitle("GUI by: Jonathan Lin");
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout( new GridLayout(0,1));
        
        // panel for part 1
        JPanel first = new JPanel( new GridLayout(0,1));
        first.setBackground(new Color(255,0,0));
        
        //add 4 lines of text
        JLabel text = new JLabel("Arial font");
        text.setFont( new Font("Arial",1,20));
        text.setHorizontalAlignment(JLabel.CENTER);
        first.add(text);
        text = new JLabel("Serif font");
        text.setFont( new Font("Serif",1,20));
        text.setHorizontalAlignment(JLabel.CENTER);
        first.add(text);
        text = new JLabel("Monospaced font");
        text.setFont( new Font("Monospaced",1,20));
        text.setHorizontalAlignment(JLabel.CENTER);
        first.add(text);
        text = new JLabel("Calibri font");
        text.setFont( new Font("Calibri",1,20));
        text.setHorizontalAlignment(JLabel.CENTER);
        first.add(text);
        
        jf.add(first);
        
        // panel for part 2
        JPanel second = new JPanel (new GridLayout(0,1));
        second.setBackground( new Color(0,255,0));
        
        PanelGraphics pg = new PanelGraphics();
        second.add(pg);
        
        jf.add(second);
        
        // second panel for part 2
        third = new JPanel (new GridLayout(2,2));
        third.setBackground(Color.MAGENTA);
        
        JLabel instructions = new JLabel("Click a Button to Change Color");
        instructions.setFont( new Font("Arial",1,13));
        instructions.setHorizontalAlignment(JLabel.CENTER);
        third.add(instructions);
        JLabel filler = new JLabel(" ");
        filler.setFont( new Font("Arial",1,13));
        filler.setHorizontalAlignment(JLabel.CENTER);
        third.add(filler);
        
        JButton blueButton = new JButton("Cyan");
        JButton greenButton = new JButton("Green");
        blueButton.addActionListener(new Action());
        greenButton.addActionListener(new Action());
        
        third.add(blueButton);
        third.add(greenButton);
        
        jf.add(third);
        
        // panel for part 3
        JPanel fourth = new JPanel(new GridLayout(0,1));
        fourth.setBackground(Color.WHITE);
        
        dynamicText = new JLabel("Please Input Text In The Text Field Below");
        dynamicText.setFont( new Font("Arial",1,13));
        fourth.add(dynamicText);
        
        JTextField ta = new JTextField();
        ta.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) {
                dynamicText.setText(ta.getText());
            }
            public void removeUpdate(DocumentEvent e) {
                dynamicText.setText(ta.getText());
            }
            public void insertUpdate(DocumentEvent e) {
                dynamicText.setText(ta.getText());
            }
        });
        fourth.add(ta);
        
        
        jf.add(fourth);
        
        
        jf.setVisible(true);
    }
    
    static class Action implements ActionListener {
        
        public void actionPerformed (ActionEvent e) {
            String command = e.getActionCommand();
            if (command.equals("Cyan")) {
                third.setBackground(Color.CYAN);
            }
            if (command.equals("Green")) {
                third.setBackground(Color.GREEN);
            }
            System.out.println(command);
        }
    }
    
}
