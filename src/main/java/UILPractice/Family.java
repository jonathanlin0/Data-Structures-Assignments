/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UILPractice;
import java.util.*;
import java.io.*;

/**
 *
 * @author Jonathan
 */
public class Family {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        
        try{
            Scanner scanner = new Scanner(new File("family.dat"));
            while (scanner.hasNextLine()) {
                input.add(scanner.nextLine());
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        
        ArrayList<ArrayList<String>> tree = new ArrayList<>();
        
        for (String line:input) {
            String sourceName = line.substring(0,line.indexOf(" "));
            line = line.substring(line.indexOf(" ") + 1,line.length());
            String relationship = line.substring(0,line.indexOf(" "));
            String destination = line.substring(line.indexOf(" ") + 1,line.length());
            
            boolean destinationExists = false;
            for (int x = 0; x < tree.size(); x++) {
                ArrayList<String> layer = tree.get(x);
                if (layer.contains(destination)) {
                    destinationExists = true;
                }
            }
            if (destinationExists){
                if (relationship.equals("MOTHER") || relationship.equals("FATHER")) {
                    
                }
            }
        }
    }
}
