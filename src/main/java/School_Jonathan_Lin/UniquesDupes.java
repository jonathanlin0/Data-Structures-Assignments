/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;
import java.util.*;

/**
 *
 * @author Jonathan
 */
public class UniquesDupes {
    public static void main(String[] args) {
        String[] words = "one three six nine three five six seven one one three".split(" ");
        Set<String> set = new TreeSet<String>(Arrays.asList(words));

        
        
        List<String> added = new ArrayList<>();
        List<String> duplicates = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (added.contains(word) == false) {
                added.add(word);
            }
            else{
                if (duplicates.contains(word)==false) {
                    duplicates.add(word);
                }
            }
        }
        
        
        
        for (String word : set) {
            System.out.print(word);
            System.out.print(" ");
        }
        System.out.println("");
        for (String word:duplicates) {
            System.out.print(word);
            System.out.print(" ");
        }
    }
}
