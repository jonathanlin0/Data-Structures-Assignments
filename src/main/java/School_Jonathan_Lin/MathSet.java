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
public class MathSet {
    
    public static void main(String[] args) {
        Set<Integer> one = new TreeSet<>();
        Set<Integer> two = new TreeSet<>();
        Set<Integer> three = new TreeSet<Integer>();
        Set<Integer> union = new TreeSet<Integer>();
        Set<Integer> intersection = new TreeSet<Integer>();
        
        one.add(1);one.add(2);one.add(3);one.add(4);one.add(5);
        two.add(4);two.add(5);two.add(6);two.add(7);two.add(8);
        
        System.out.print("Set one ");System.out.println(one);
        System.out.print("Set two ");System.out.println(two);
        System.out.println("");
        
        //union - all of the items in both sets
        three.addAll(two);
        three.addAll(two);
        System.out.print("union - ");
        union.addAll(three);
        System.out.println(three);
        
        //intersection - the items that occur in both sets
        three.clear();
        three.addAll(one);
        three.retainAll(two);
        System.out.print("intersection - ");
        intersection.addAll(three);
        System.out.println(three);
        
        //difference A-B - the items that occur in A, but not in B
        three.clear();
        three.addAll(one);
        three.removeAll(two);
        System.out.print("difference A-B - ");
        System.out.println(three);
        
        //Difference B-A - the items that occur in B, but not in A
        three.clear();
        three.addAll(two);
        three.removeAll(one);
        System.out.print("difference B-A - ");
        System.out.println(three);
        
        //symmetric difference - the items that occur in either set, but not both
        three.clear();
        three.addAll(union);
        three.removeAll(intersection);
        System.out.print("symmetric difference - ");
        System.out.println(three);
    }
    
}
