/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;

/**
 *
 * @author Jonathan
 */
import java.util.*;

public class Part implements Comparable<Part>
{
	private String make, mode, rest;
	private int year;
        

	public Part(String line) 
	{
            make = "";
            rest = "";
            year = 0;
		String[] list = line.split(" ");
                String[] numbers = {"0","1","2","3","4","5","6","7","8","9"};
                
                for (String string : list) {
                    
                    boolean restHasNum = false;
                    if (rest != "") {
                        char[] chars = rest.toCharArray();
                        for (char c : chars) {
                            if (Character.isDigit(c)) {
                                restHasNum = true;
                            }
                        }
                    }
                    if (restHasNum == false) {
                        rest = rest + " " + string;
                    }
                    else if (restHasNum == true) {
                        if (Arrays.asList(numbers).contains(string.substring(0,1)) == true) {
                            year = Integer.parseInt(string);
                        }
                        if (Arrays.asList(numbers).contains(string.substring(0,1)) == false) {
                            make = make + " " + string;
                        }
                    }
                }
                
                make = make.substring(1,make.length());
                rest = rest.substring(1,rest.length());


	}

	//have to have compareTo if implements Comparable
	public int compareTo( Part rhs )
	{
            if (this.make.compareTo(rhs.make) != 0){
                return this.make.compareTo(rhs.make);
            }
            if (this.year < rhs.year) {
                return 1;
            }
            if (this.year > rhs.year) {
                return -1;
            }
            if (this.rest.compareTo(rhs.rest)!=0) {
                return this.rest.compareTo(rhs.rest);
            }


		return 0;
	}

	public String toString()
	{
            String out = "";
            out = make + " " + Integer.toString(year) + " " + rest;
            //out = "Make: " + make + "\n" + "Year: " + Integer.toString(year) + "\n" + "Rest: " + rest;
            return out;
	}
}