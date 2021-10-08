/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUIPractice2;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JLabel;
import javax.swing.*;

/**
 *
 * @author Jonathan
 */
public class FilePanel extends JPanel implements ActionListener {
    private JLabel file;
    
    FilePanel() {
        super();
        setBackground(Color.cyan);
        setPreferredSize(new Dimension(500,150));
        JLabel filelab = new JLabel("File Name: ");
        add(filelab);
        file = new JLabel("none yet");
        add(file);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent evt) {
        System.out.println(evt.getSource());
        JMenuItem source = (JMenuItem) evt.getSource();
        if (source.getText() == "Open") {
            JFileChooser fc = new JFileChooser();
            int result = fc.showOpenDialog(this);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fc.getSelectedFile();
                file.setText(selectedFile.getAbsolutePath());
            }
        }
        if (source.getText() == "Red") {
            setBackground(Color.red);
        }
        if (source.getText() == "Green") {
            setBackground(Color.green);
        }
        if (source.getText() == "Yellow") {
            setBackground(Color.yellow);
        }
    }
}
