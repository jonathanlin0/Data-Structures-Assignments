//(c) A+ Computer Science
//www.apluscompsci.com
package HashTable2;
//Name -

import java.util.ArrayList;


public class Word
{
	private String theValue;
	
	//write a constructor method
	//public Word(){}
        
        public Word(String word){
            theValue = word;
        }
	
	
	//write the getValue method
	public String getValue(){
            return theValue;
        }
	
	
	//write the equals method
        public boolean equals(Object obj) {
            Word other = (Word) obj;
            try {
                if (other.getValue().equals(getValue())) {
                    return true;
                }
            } catch (Exception e) {
                System.out.println(e);
            }
            return false;
        }
	
	
	//write the hashCode method
	public int hashCode() {
            
            int out = 0;
            ArrayList<String> vowels = new ArrayList<>();
            vowels.add("a");
            vowels.add("e");
            vowels.add("i");
            vowels.add("o");
            vowels.add("u");
            
            int vowels_cnt = 0;
            
            for (int x = 0; x < theValue.length(); x++) {
                if (vowels.contains(theValue.substring(x,x+1))){
                    vowels_cnt++;
                }
            }
            
            out = vowels_cnt * theValue.length();
            out = out % 10;
            return out;
        }
	
	
	//write the toString method
        public String toString() {
            return theValue;
        }
	
}