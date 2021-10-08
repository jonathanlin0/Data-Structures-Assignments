//(c) A+ Computer Science
//www.apluscompsci.com
package HashTable1;
//Name -


import java.util.LinkedList;
import java.util.Scanner;
import static java.lang.System.*;

public class HashTable
{
	private ListNode[] table;

	public HashTable( )
	{
		table = new ListNode[10];
	}

	public void add(Object obj)
	{
		int i = obj.hashCode();
                
                if (table[i%10] != null) {
                    ListNode front = table[i%10];
                    boolean hasValue = false;
                    
                    while (table[i%10] != null) {
                        if (table[i%10].getValue() == (Comparable) obj){
                            hasValue = true;
                        }
                        table[i%10] = table[i%10].getNext();
                    }
                    table[i%10] = front;
                    if (hasValue == false) {
                        while (table[i%10].getNext() != null) {
                            table[i%10] = table[i%10].getNext();
                        }
                        ListNode ln = new ListNode();
                        ln.setValue((Comparable) obj);
                        table[i%10].setNext(ln);
                        table[i%10] = front;
                    }
                    
                }
                if (table[i%10] == null) {
                    ListNode ln = new ListNode();
                    ln.setValue((Comparable) obj);
                    table[i%10] = ln;
                }
                

	}

	public String toString()
	{
		String output="HASHTABLE\n";

                for (int x = 0; x < table.length; x++) {
                    output = output + "bucket " + String.valueOf(x);
                    
                    ListNode front = table[x];
                    while (table[x] != null) {
                        output = output + " " + table[x].getValue();
                        table[x] = table[x].getNext();
                    }
                    table[x] = front;
                    output = output + "\n";
                }



		return output;
	}
}