//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package School_Jonathan_Lin;
import static java.lang.System.*;
import java.math.*;
import java.util.*;


public class BaseConversion
{
	private String number;
	private int base;

	public static void main ( String[] args )
	{

		
	// add test data as a string array
            String[] data = {"10 10 2","AB 16 10","345 6 4","25 10 2","127 10 16","1024 7 16","97342 10 16","1010010010001001 2 16"};
	// add test cases
            for (String string:data) {
            //String string = data[1]; //delete this line later
                String original = string.substring(0,string.indexOf(" "));
                string = string.substring(string.indexOf(" ") + 1, string.length());
                int originalBase = Integer.parseInt(string.substring(0,string.indexOf(" ")));
                int newBase = Integer.parseInt(string.substring(string.indexOf(" ") + 1, string.length()));
                BaseConversion obj = new BaseConversion(original, originalBase);
                System.out.println(obj.toString() + "==" + obj.getNum(newBase));
            }
					
	}

	public BaseConversion(String num, int b)
	{

            
            number = num;
            base = b;
	}

	private int convertToTen( )
	{
		int q = number.length();
		int base10=0;
                
                
                for (int i = 0; i < q; i++) {
                    int power = (int)Math.pow(base,i);
                    int actualNum = 0;
                    try { //this try catch is in case the number is an int
                        actualNum = Integer.parseInt(number.substring(number.length()-1-i,number.length()-0-i));
                    } catch(Exception e) { //if not an int then convert to an int
                        String[] key = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P"};
                        for (int x = 0; x < key.length; x++) {
                            if (key[x].equals(number.substring(number.length()-1-i,number.length()-0-i))) {
                                actualNum = 9 + 1 + x;
                            }
                        }
                    }
                    base10 = base10 + power*actualNum;
                }

		return base10;
	}

	public String getNum(int newBase)
	{
            int base10 = convertToTen();
            String newNum="";
            
            int startingPower = 0;
                
            while ((int)Math.pow(newBase,startingPower) < base10) {
                startingPower++;
            }
            
            while (base10 > 0) {
                int times = base10/(int)Math.pow(newBase, startingPower);
                base10 = base10%(int)Math.pow(newBase,startingPower);
                newNum = newNum + Integer.toString(times);
                startingPower--;
            }
            

            if (newNum.substring(0,1).equals(" ")){
                while (newNum.substring(0,1).equals("0")) {
                    newNum = newNum.substring(1,newNum.length());
                }
            }

		return newNum+"-"+newBase;
	}

	public String toString()
	{
		return number+"-"+base;
	}
}