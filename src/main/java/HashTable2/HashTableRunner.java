//(c) A+ Computer Science
//www.apluscompsci.com
package HashTable2;
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
		try{
			HashTable hashtable = new HashTable();
                        
			//read from the file			
			ArrayList<String> input;
                        try {
                        input = new ArrayList<String>();
                        Scanner scanner = new Scanner(new File("words.dat"));
                        while (scanner.hasNextLine()){
                            String nextLine = scanner.nextLine();
                            try{
                                int bob = Integer.parseInt(nextLine);
                            }
                            catch (Exception e) {
                                input.add(nextLine);
                            }
                            
                        }
                        } catch (IOException e) {
                            input = null;
                        }
			//load stuff into the table			
			for (String string:input) {
                            hashtable.add(new Word(string));
                        }
                        
			//print out the table
                        System.out.println(hashtable);
		}
		catch(Exception e)
		{
			System.out.println("Houston, we have a problem!");
		}
  }
}