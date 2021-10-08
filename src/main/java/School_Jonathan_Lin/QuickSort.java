/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jonathan
 */
public class QuickSort {
    
    public static ArrayList<Integer> array;
    
    public static void QuickSort(int low, int high){
        if (low < high){
            int j = partition(low,high);
            QuickSort(low,j);
            QuickSort(j+1,high);
        }
    }
    
    public static int partition(int low, int high){
        //generates a random pivot
        Random rand = new Random();
        int pivot = rand.nextInt(high-low);
        pivot = low + pivot;
        
        //move pivot to end of array
        int swapPivot = array.get(pivot);
        int swapHigh = array.get(high);
        array.set(pivot, swapHigh);
        array.set(high, swapPivot);

        
        int i = low; int j = high-1;
        while (i<j){
            //keep on moving fromLeft until item > pivot
            while (array.get(i) <= pivot){
                i++;
            }
            //keep on moving fromRight until item <= pivot
            while (array.get(j) > pivot) {
                j--;
            }
            //switch item from left and item from right
            if (i < j){
                int i_value = array.get(i);
                int j_value = array.get(j);
                array.set(i, j_value);
                array.set(j, i_value);
            }
            
            int pivotSwap = array.get(high);
            int iSwap = array.get(i);
            array.set(high,iSwap);
            array.set(i,pivotSwap);
        }
        
        return j;
    }
    
    
    public static void main(String[] args) {
        array = new ArrayList<Integer>();
        array.add(8);array.add(84);array.add(10);array.add(564);array.add(844);array.add(5999);
        
        QuickSort(0,array.size()-1);
        System.out.println(array);
        
        
    }
    
}
