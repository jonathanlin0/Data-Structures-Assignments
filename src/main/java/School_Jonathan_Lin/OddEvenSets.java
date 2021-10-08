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
public class OddEvenSets {
    public static void main(String[] args) {
        String[] numbers = "5 5 1 4 7 85 4 1 1 12 55 4 5 65 212 156 564 654 654 4 4 19 692 1 4 748 89 1 12 3 5 4 89 12 1 5".split(" ");
        Set<String> set = new TreeSet<String>(Arrays.asList(numbers));
        Set<Integer> odds = new TreeSet<Integer>();
        Set<Integer> evens = new TreeSet<Integer>();
        
        //determine if odd or even
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            int number = Integer.parseInt(it.next());
            if (number %2 == 0) {
                evens.add(number);
            }
            else{
                odds.add(number);
            }
        }
        
        //print out result
        Iterator<Integer> printIt = odds.iterator();
        System.out.print("ODDS : ["); System.out.print(printIt.next());
        while (printIt.hasNext()) {
            System.out.print(", ");
            System.out.print(printIt.next());
        }
        System.out.println("]");
        
        printIt = evens.iterator();
        System.out.print("EVENS : ["); System.out.print(printIt.next());
        while (printIt.hasNext()) {
            System.out.print(", ");
            System.out.print(printIt.next());
        }
        System.out.println("]");
    }
}
