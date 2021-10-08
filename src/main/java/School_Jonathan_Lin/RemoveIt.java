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
public class RemoveIt {
    
    public static void main(String[] args) {
        //initial arraylist
        ArrayList<String> list = new ArrayList<String>();
        list.add("jkflasdfjaksl");
        list.add("asdkjlfasfa");
        list.add("asdfasdfasdfas");
        
        Iterator it = list.iterator();
        
        //iterator goes through every element in the arraylist
        while(it.hasNext()){
            
            String string = (String)it.next();
            
            for (int i = 0; i < string.length(); i++) {
                //if the character is not the letter "a"
                if(Character.compare(string.charAt(i),'a') != 0){
                    System.out.print(string.charAt(i));
                }
                
            }
            
            //enters a line for the next string in the arraylist
            System.out.println("");
        }
    }
}
