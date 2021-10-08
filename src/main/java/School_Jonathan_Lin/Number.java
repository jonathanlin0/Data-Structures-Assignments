//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package School_Jonathan_Lin;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Number implements Comparable<Number>
{

	//add in instance variables
        private String originalNumber;
        private int originalBase;
        private int base10;
        private String binary;
    
	//add in a constructor or two
        public Number(String string) {
            originalNumber = string.substring(0,string.indexOf(" "));
            originalBase = Integer.parseInt(string.substring(string.indexOf(" ")+1,string.length()));
            base10 = Integer.parseInt(originalNumber,originalBase);
            binary = Integer.toBinaryString(base10);
        }

	public static void main ( String[] args )
	{
		
	// add test data as a string array
            ArrayList<String> pairsInput;
            try {
                pairsInput = new ArrayList<String>();
                Scanner scanner = new Scanner(new File("number.dat"));
                while (scanner.hasNextLine())    {
                    pairsInput.add(scanner.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
                pairsInput = null;
            }
            
            ArrayList<Number> numbers = new ArrayList<>();
	// add test cases
            for (String string:pairsInput) {
                Number number = new Number(string);
                numbers.add(number);
            }
            
            
            ArrayList<Number> sorted = new ArrayList<>();
            for (Number number:numbers) {
                boolean added = false;
                if (sorted.size() > 0) {
                    for (int i = 0; i < sorted.size(); i++) {
                        if (number.compareTo(sorted.get(i)) < 0) {
                            sorted.add(i,number);
                            added = true;
                            break;
                        }
                    }
                    if (added == false) {
                        sorted.add(number);
                    }
                }
                if (sorted.size() == 0) {
                    sorted.add(number);
                }
            }
            System.out.println("");
            System.out.println("");
            for (Number number:sorted) {
                System.out.println(number);
            }

	}
        
        public int getOnes() {
            int out = 0;
            for (int i = 0; i < binary.length(); i++) {
                if (binary.substring(i,i+1).equals("1")) {
                    out++;
                }
            }
            return out;
        }
        
        public int getBase10(){
            return base10;
        }
        public String getOriginalNum() {
            return originalNumber;
        }
        
	public int compareTo(Number param)
	{
            if (this.getOnes() != param.getOnes()) {
                if (this.getOnes() < param.getOnes()) {
                    return -1;
                }
                if (this.getOnes() > param.getOnes()) {
                    return 1;
                }
            }
            if (base10 != param.getBase10()){
                return base10 - param.getBase10();
            }
            return originalNumber.compareTo(param.getOriginalNum());
            		
	}
	
	public String toString( )
	{
            String out = "";
            out = originalNumber + " " + base10 + " " + binary;
	  return out;
	}
}