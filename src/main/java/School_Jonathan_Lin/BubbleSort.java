/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Jonathan
 */
public class BubbleSort {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);list.add(5);list.add(2);list.add(3);list.add(8);list.add(97);
        
        
        for(int i = 0; i < list.size(); i++) {
            for (int x = 0; x < list.size()-1; x++) {
                if (list.get(x) > list.get(x+1)){
                    int temp = list.get(x);
                    list.set(x, list.get(x+1));
                    list.set(x + 1, temp);
                }
            }
        }
        
        for (int str:list){
            System.out.println(str);
        }
        
        
        
    }
}
