//(c) A+ Computer Science
//www.apluscompsci.com
package HashTable2;
//Name -

import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private LinkedList[] table;

	public HashTable( )
	{
            table = new LinkedList[10];
            
	}

	public void add(Object obj)
	{
            
            Object other = new Word(obj.toString());
            int i = other.hashCode();
            
            
            if (table[i] == null) {
                table[i] = new LinkedList<Word>();
                table[i].add(other); //Adds the first value to that section
            }
            else {
                boolean exists = false;
                if (table[i].contains(other)) {
                    exists = true;
                }
                if (exists == false) {
                    table[i].add(other);
                }
            }

	}

	public String toString()
	{
		String output="HASHTABLE\n";

                for (int x = 0; x < table.length; x++) {
                    output = output + "bucket " + x + " ";
                    if (table[x] != null) {
                        for (int i = 0; i < table[x].size(); i++) {
                            output = output + table[x].get(i) + " ";
                        }
                    }
                    output = output + '\n';
                }
                


		return output;
	}
}