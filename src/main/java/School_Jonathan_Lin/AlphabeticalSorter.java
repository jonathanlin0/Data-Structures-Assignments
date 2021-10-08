/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;

import java.io.*;
import java.util.*;

/**
 *
 * @author Jonathan
 */
public class AlphabeticalSorter {
    
    public AlphabeticalSorter() {
        datScanner bob = new datScanner("words.dat");
        ArrayList<String> wholeList = bob.scan();
        /*
        try {
        wholeList = new ArrayList<String>();
        Scanner scanner = new Scanner(new File("words.dat"));
        while (scanner.hasNextLine())    {
            wholeList.add(scanner.nextLine());
        }
        } catch (IOException e) {
            System.out.println("Error: " + e);
            wholeList = null;
        }*/
        
        ArrayList<String> out = new ArrayList<>();
        out.add(wholeList.get(0));
        wholeList.remove(0);
        for (int i = 0; i < wholeList.size(); i++) {
            boolean added = false;
            for (int x =0; x < out.size(); x++) {
                if (wholeList.get(i).compareTo(out.get(x)) <= 0) {
                    out.add(x,wholeList.get(i));
                    added = true;
                    break;
                }
            }
            if (added == false) {
                out.add(wholeList.get(i));
            }
        }
        
        
        for (int i = 0; i < out.size()/2; i++) {
            System.out.println(out.get(i));
        }
        System.out.println("");
        for (int x = (out.size()/2); x < out.size(); x++) {
            System.out.println(out.get(x));
        }
    }
}
