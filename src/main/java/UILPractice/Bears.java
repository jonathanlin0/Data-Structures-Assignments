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
public class Bears {
    public static void main(String[] args) {
        
        ArrayList<String> input = new ArrayList<>();
        try{
            Scanner scanner = new Scanner(new File("bears.dat"));
            while (scanner.hasNextLine()) {
                input.add(scanner.nextLine());
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        
        int numberOfMaps = Integer.parseInt(input.get(0));
        int rowNum = 1;
        
        for (int i = 0; i < numberOfMaps; i++) {
            ArrayList<String> map = new ArrayList<>();
            for (int row = 0; row < 10; row++) {
                map.add(input.get(rowNum));
                rowNum++;
            }
            int counter = 0;
            for (String row:map) {
                for (int x = 0; x < 10; x++) {
                    if (row.substring(x,x+1).equals("B")) {
                        counter ++;
                    }
                }
            }
            System.out.println(counter);
        }
        
    }
}
