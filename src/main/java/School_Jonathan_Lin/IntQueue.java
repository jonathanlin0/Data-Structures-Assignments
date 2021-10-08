//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

//ArrayList of ints
//or
//array of ints

import java.util.ArrayList;
import static java.lang.System.*;

public class IntQueue
{
	//pick your storage for the queue
	//you can use the an array or an ArrayList


	//option 2
	private ArrayList<Integer> listOfInts;

	public IntQueue()
	{
            listOfInts = new ArrayList<>();
	}

	public void add(int item)
	{
            listOfInts.add(item);
	}

	public int remove()
	{
            int first = listOfInts.get(0);
            listOfInts.remove(0);
            return first;
	}

	public boolean isEmpty()
	{
            if (listOfInts.size() == 0) {
                return true;
            }
		return false;
	}

	public int peek()
	{
            return listOfInts.get(0);
	}

	public String toString()
	{
            String out = "[";
            if (!isEmpty()) {
                
                for (int num :listOfInts) {
                    out = out + num + ", ";
                }
                out = out.substring(0,out.length()-2);
                out = out + "]";
            }
            if (isEmpty()) {
                out = "[]";
            }
            return out;
	}
}