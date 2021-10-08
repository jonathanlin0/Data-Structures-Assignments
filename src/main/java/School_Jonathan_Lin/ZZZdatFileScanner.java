/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jonathan
 */
public class ZZZdatFileScanner {
    
    private String fileName;
    
    public ZZZdatFileScanner() {
        
    }
    
    public ZZZdatFileScanner(String input) {
        fileName = input;
        scan();
    }
    

    public ArrayList<String> scan() {
        ArrayList<String> input;
        try {
        input = new ArrayList<String>();
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine())    {
            input.add(scanner.nextLine());
        }
        } catch (IOException e) {
            System.out.println("Error: " + e);
            input = null;
        }
        
        return input;
    }
   
}
