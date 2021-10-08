/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;
import java.util.*; //scanner class
/**
 *
 * @author Jonathan
 */
public class MergeSort {
    
    public static int[] FinalMerge(int[] left, int[] right, int[] array){
        int lengthL = left.length;
        int lengthR = right.length;
        //i is  incrementor for left side, j is incrementor for right side, k is incrementor for main array
        int i = 0; int j = 0; int k = 0;
        while (i < lengthL && j < lengthR) {
            if (left[i] < right[j]) {
                array[k] = left[i];
                i++;
            }
            else {
                array[k] = right[j];
                j++;
            }
            k++;  
        }
        //when one of the left/right arrays empties, empty the rest of the array that isn't empty into the main array
        while (i < lengthL) {
            array[k] = left[i];
            i++;k++;
        }
        while (j < lengthR) {
            array[k] = right[j];
            j++;k++;
        }
        
        return array;
    }
    
    //sorts the 2 halfs of the main array
    public static int[] MergeSort(int[] array){
        int length = array.length;
        if (length < 2) {
            return array;
        }
        int mid = array.length/2;
        //create left and right array
        int[] left = new int[mid];
        int[] right = new int[length-mid];
        
        //fill up the arrays
        for (int i = 0; i < mid; i++) {
            left[i] = array[i];
        }
        for (int x = mid; x < length; x++) {
            right[x-mid] = array[x];
        }
        MergeSort(left);
        MergeSort(right);
        FinalMerge(left,right,array);
       
        return null;
    }
    public static void main(String[] args) {
        int[] array = {5,5,4,8,89,6,2,1,54,74,9,4,9,4,1,4,4,4654,6,7,7,122,4,5,5,5};
        System.out.print("Original Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
        
        MergeSort(array);
        
        System.out.println("");
        System.out.print("Sorted Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            System.out.print(" ");
        }
    }
}
