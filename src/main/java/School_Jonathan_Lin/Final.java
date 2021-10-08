package School_Jonathan_Lin;

// Please do not change the names, the parameters, or the return types of any
// of the methods. 

import java.util.*;
import java.math.*;

public class Final {

    // Sort the incoming array using an insertion sort, bubble sort, or selection sort
    // Do this from memory without using any references
    public int[] sortArray(int[] a) {
        //bubble sort
        
        for (int i = 0; i < a.length; i++) {
            for (int x = 0; x < a.length-1; x++) {
                if (a[x] > a[x+1]) {
                    int temp = a[x];
                    a[x] = a[x+1];
                    a[x+1] = temp;
                }
            }
        }

        return a;
    }

    // Sort the incoming array using a set
    public int[] sortArraywithSet(int[] a) {
        
        HashSet set = new HashSet<Integer>();
        
        for (int i = 0; i < a.length; i++) {
            set.add(a[i]);
        }
        
        TreeSet<Integer> treeSet = new TreeSet<>(set);
        
        int x = 0;
        for (int number : treeSet) {
            a[x] = number;
            x++;
        }

        return a;
    }

    // Using a map convert any number from 0 to 10, inclusive from the integer to the name 
    // of the number  (3 to three, 7 to seven)
    public String numtoName(int a) {
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        
        map.put(0,"zero");
        map.put(1,"one");
        map.put(2,"two");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");
        map.put(6, "six");
        map.put(7,"seven");
        map.put(8, "eight");
        map.put(9, "nine");
        map.put(10, "ten");
        
        return map.get(a);
    }

    // Convert any base 10 number to binary  
    // DO NOT USE LIBRARY METHODS SUCH ParseInt (write the code yourself)
    public String base10toBinary(int a) {
        
        int power = 0;
        while ((int)Math.pow(2,power) < a) {
            power++;
        }
        
        String out = "";
        
        while (power > -1) {
            int add = a/(int)Math.pow(2,power);
            a = a%(int)Math.pow(2,power);
            
            if (add == 0) {
                out = out + "0";
            }
            if (add == 1) {
                out = out + "1";
            }
            if (add == 2) {
                out = out + "2";
            }
            

            power--;
        }
        
        while (out.substring(0,1).equals("0")) {
            out = out.substring(1,out.length());
        }
        
        return out;
    }

    // Using a stack reverse the incoming array
    public int[] reversewithStack(int[] a) {

        Stack<Integer> stack = new Stack<>();
        for (int number:a) {
            stack.push(number);
        }
        
        int i = 0;
        while (stack.isEmpty() == false) {
            a[i] = stack.pop();
            i++;
        }
        return a;
    }
}
