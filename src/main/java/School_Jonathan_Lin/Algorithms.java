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
public class Algorithms {
    public static ArrayList<Integer> array;
    
    public static void bubbleSort() {
        
        for(int i = 0; i < array.size(); i++) {
            for (int x = 0; x < array.size()-1; x++) {
                if (array.get(x) > array.get(x+1)){
                    int temp = array.get(x);
                    array.set(x, array.get(x+1));
                    array.set(x + 1, temp);
                }
            }
        }
        
    }
    
    public static void insertionSort() {
        for (int i = 1; i < array.size(); i++) { 
            int key = array.get(i); 
            int j = i - 1;
            while (j >= 0 && array.get(j) > key) {
                array.set(j+1,array.get(j));//input[j + 1] = input[j];
                j = j - 1;
            }
            array.set(j+1, key);//input[j + 1] = key; 
        }   
    }
    
    //converts the arraylist to an array
    public static void mergeSortConversionStarter() {
        int[] out = new int[array.size()];
        for (int i = 0; i < array.size(); i++) {
            out[i] = array.get(i);
        }
        mergeSort(out);
    }
    //sorts the 2 halfs of the main array
    public static int[] mergeSort(int[] arrayInput){
        int length = arrayInput.length;
        if (length < 2) {
            return arrayInput;
        }
        int mid = arrayInput.length/2;
        //create left and right array
        int[] left = new int[mid];
        int[] right = new int[length-mid];
        
        //fill up the arrays
        for (int i = 0; i < mid; i++) {
            left[i] = arrayInput[i];
        }
        for (int x = mid; x < length; x++) {
            right[x-mid] = arrayInput[x];
        }
        mergeSort(left);
        mergeSort(right);
        finalMerge(left,right,arrayInput);
       
        return null;
    }
    public static void finalMerge(int[] left, int[] right, int[] arrayInput){
        int lengthL = left.length;
        int lengthR = right.length;
        //i is  incrementor for left side, j is incrementor for right side, k is incrementor for main array
        int i = 0; int j = 0; int k = 0;
        while (i < lengthL && j < lengthR) {
            if (left[i] < right[j]) {
                arrayInput[k] = left[i];
                i++;
            }
            else {
                arrayInput[k] = right[j];
                j++;
            }
            k++;  
        }
        //when one of the left/right arrays empties, empty the rest of the array that isn't empty into the main array
        while (i < lengthL) {
            arrayInput[k] = left[i];
            i++;k++;
        }
        while (j < lengthR) {
            arrayInput[k] = right[j];
            j++;k++;
        }
        
        array = new ArrayList<Integer>();
        for (int number:arrayInput) {
            array.add(number);
        }
    }
    
    //usage: quickSort(0,array.size()-1);
    public static void quickSort(int low, int high) {
        if (low < high){
            int j = partition(low,high);
            quickSort(low,j);
            quickSort(j+1,high);
        }
    }
    public static int partition(int low, int high){
        //generates pivot point
        int pivot = (high - low)/2;
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
    
    //array does not need to be sorted
    public static void linearSearch(int one, int two) {
        Map<String, Integer> dict = new HashMap();
        dict.put("one", null);
        dict.put("two", null);
        
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i) == one) {
                dict.replace("one", null, i);
            }
            if (array.get(i) == two) {
                dict.replace("two", null, i);
            }
        }
        
        //print out the results
        if (dict.get("one") != null) {
            System.out.print("Index of " + Integer.toString(one) + ": " + dict.get("one"));
        }
        else{
            System.out.print(Integer.toString(one) + " is not in the array");
        }
        System.out.println("");
        if (dict.get("two") != null) {
            System.out.print("Index of " + Integer.toString(two) + ": " + dict.get("two"));
        }
        else{
            System.out.print(Integer.toString(two) + " is not in the array");
        }
    }
    
    //array needs to be sorted
    public static void binarySearch(int one, int two) {

        Map<String, Integer> dict = new HashMap();
        dict.put("one", null);
        dict.put("two", null);
        

        //same process but for the 2 diff numbers
        int low = 0;
        int high = array.size();
        while (low+1 < high) {
            int test = (low + high)/2;
            if (array.get(test) > one) {
                high = test;
            }
            else{
                low = test;
            }
        }
        if (array.get(low) == one) {
            dict.replace("one", null, low);
        }
        //repeats for the second target value
        low = 0;
        high = array.size();
        while (low+1 < high) {
            int test = (low + high)/2;
            if (array.get(test) > two) {
                high = test;
            }
            else{
                low = test;
            }
        }
        if (array.get(low) == two) {
            dict.replace("two", null, low);
        }
        
        
        //print out the results
        if (dict.get("one") != null) {
            System.out.print("Index of " + Integer.toString(one) + ": " + dict.get("one"));
        }
        else{
            System.out.print(Integer.toString(one) + " is not in the array");
        }
        System.out.println("");
        if (dict.get("two") != null) {
            System.out.print("Index of " + Integer.toString(two) + ": " + dict.get("two"));
        }
        else{
            System.out.print(Integer.toString(two) + " is not in the array");
        }
    }

    public static ArrayList<Integer> createList(int length,int max) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        
        Random rand = new Random(); //the "random" object that will be generating random numbers
        
        for (int i = 0; i < length; i++) {
            out.add(rand.nextInt(max+1));
        }
        
        return out;
    }
    
    public static void main(String[] args) {
        array = createList(10000,500); //parameters (length of list, inclusive max value)
        
        
        //print starting array
        String startStr = "Starting array: ";
        for (int number : array) {
            startStr = startStr + Integer.toString(number) + ", ";
        }
        startStr = startStr.substring(0,startStr.length()-2);
        System.out.println(startStr);
        
        mergeSortConversionStarter(); //needed to do binary search
        long startTime = System.currentTimeMillis();
        //bubble sort
        bubbleSort();
        
        //insertion sort
        //insertionSort();
        
        //merge sort
        //mergeSortConversionStarter();
        
        //quick sort
        //quickSort(0,array.size()-1);
        
        //linear search
        //linearSearch(5,2);
        
        //binary search
        //insertionSort();
        //binarySearch(5,3);
        
        long endTime = System.currentTimeMillis();
        
        
        //print finished array
        System.out.println("");
        String sortedStr = "Sorted array: ";
        for (int number : array) {
            sortedStr = sortedStr + Integer.toString(number) + ", ";
        }
        sortedStr = sortedStr.substring(0,sortedStr.length()-2);
        System.out.println(sortedStr);
        
        System.out.println("");
        long timeElapsed = endTime - startTime;
        System.out.println("Time elapsed: "+ timeElapsed + " milliseconds");
        
    }
}
