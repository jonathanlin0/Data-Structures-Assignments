/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Personal;
import java.util.*;
import java.io.*;
/**
 *
 * @author Jonathan
 */
public class temp {
    public static void main(String[] args) {
        
        double[] hi = new double[5];
        System.out.println(hi[0]);
        ArrayList<String> input = new ArrayList<>();
        
        try{
            Scanner scanner = new Scanner (new File("visits.txt"));
            while (scanner.hasNextLine()) {
                input.add(scanner.nextLine());
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).contains(":") == false) {
                System.out.println("FASDFAS");
                System.out.println(i);
                System.out.println(input.get(i));
                break;
            }
        }
    }
}
