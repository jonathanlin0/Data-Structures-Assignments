package UILPractice;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;
/**
 *
 * @author Jonathan
 */
public class DiceRoll {
    
    
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new File("diceroll.dat"));
            while (scanner.hasNextLine()) {
                input.add(scanner.nextLine());
            }
            
        }catch (Exception e) {
            System.out.println(e);
        }
        
        int timesRun = Integer.parseInt(input.get(0));
        ArrayList<Long> seeds = new ArrayList<>();
        for (int i = 1; i < input.size(); i++) {
            seeds.add(Long.parseLong(input.get(i)));
        }
        
        for (int i = 0; i < timesRun; i++) {
            Random ran = new Random(seeds.get(i));
            
            int direction = ran.nextInt(4) + 1;
            int numFlips = ran.nextInt(25) + 1;
            
            if (numFlips %2 == 0) {
                System.out.println("WHITE");
            }
            else{
                if (direction == 1 || direction == 2) {
                    System.out.println("RED");
                }
                if (direction == 3 || direction == 4) {
                    System.out.println("BLUE");
                }
            }
        }
    }
}
