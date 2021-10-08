/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;
import java.util.*; //scanner class
import java.io.*; //use file class

/**
 *
 * @author Jonathan
 */
public class InsertionSort {
    
    
    public static ArrayList readFile() throws IOException{
        //text file is in format number,number,number,number etc
        File fileobj = new File("C:\\Users\\4jona\\Documents\\NetBeansProjects\\School\\InsertionSortNumbers.txt");
        Scanner input = new Scanner(fileobj);
        ArrayList<Integer> out = new ArrayList<Integer>();
        String combinedList = "";
        while(input.hasNext()){
            
            String a = input.nextLine();
            combinedList = combinedList+a;
            combinedList = combinedList+",";
            
          
            
        }
        try{
            int behindComma = 0;
            int frontComma = 0;
            for (int i = 0; i < combinedList.length(); i++) {
                if (combinedList.substring(i,i+1).equals(",")){
                    behindComma = frontComma;
                    frontComma = i;
                    if (!combinedList.substring(behindComma + 1, frontComma).equals("")){
                        out.add(Integer.parseInt(combinedList.substring(behindComma + 1, frontComma)));
                    }
                }
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
        
        return out;
    }
    
    public static void InsertionSort(int[] input){
        for (int i = 1; i < input.length; i++) { 
            int key = input[i]; 
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                j = j - 1;
            }
            input[j + 1] = key; 
        }   
        for (int x = 0; x < input.length; x++) {
            System.out.println(input[x]);
        }
    }
    
    public static void main(String[] args) {
        try{
            int[] bob= new int[readFile().size()];
            ArrayList<Integer> numbers = readFile();
            for (int x = 0; x < numbers.size(); x++) {
                bob[x] = numbers.get(x);
            }
            InsertionSort(bob);
            
        }
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
