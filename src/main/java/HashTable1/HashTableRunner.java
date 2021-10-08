//(c) A+ Computer Science
//www.apluscompsci.com
package HashTable1;
//Name -

import java.util.LinkedList;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.ArrayList;

public class HashTableRunner
{
  public static void main ( String[] args )
  {
		//try{
			//make a new table			
                        
                        HashTable hashtable = new HashTable();
                        
			//read from the file			
			ArrayList<String> input;
                        try {
                        input = new ArrayList<String>();
                        Scanner scanner = new Scanner(new File("numbers.dat"));
                        while (scanner.hasNextLine())    {
                            input.add(scanner.nextLine());
                        }
                        } catch (IOException e) {
                            System.out.println("Error: " + e);
                            input = null;
                        }
			//load stuff into the table			
			for (String bob:input) {
                            hashtable.add(Integer.parseInt(bob));
                        }
                        
			//print out the table
                        System.out.println(hashtable);
		//}
		//catch(Exception e)
		//{
		//	System.out.println("Houston, we have a problem!");
		//}
  }
}