//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

//ArrayList of ints
//or
//array of ints
package School_Jonathan_Lin;
import java.util.ArrayList;
import static java.lang.System.*;

public class IntStack
{
	//pick your storage for the stack
	//you can use the an array or an ArrayList

	//option 1
	private int[] rayOfInts;
	private int numInts;

	//option 2
	private ArrayList<Integer> listOfInts;

	public static void main ( String[] args )
	{
		//add test cases
            IntStack bob = new IntStack();
            bob.push(5);bob.push(7);bob.push(9);
            System.out.println(bob);
            System.out.println(bob.isEmpty());
            System.out.println(bob.pop());
            System.out.println(bob.peek());
            System.out.println(bob.pop());
            System.out.println(bob.pop());
            System.out.println(bob.isEmpty());
            
	}

	public IntStack()
	{
            listOfInts = new ArrayList<>();
	}

	public void push(int item)
	{
            listOfInts.add(item);
	}

	public int pop()
	{

            int out = listOfInts.get(listOfInts.size()-1);
            listOfInts.remove(listOfInts.size()-1);
            return out;
	}

	public boolean isEmpty()
	{
            if (listOfInts.size() > 0) {
                return false;
            }
		return true;
	}

	public int peek()
	{
            if (isEmpty() == false) {
                return listOfInts.get(listOfInts.size()-1);
            }
		return 0;
	}

	public String toString()
	{
            String out = "[";
            if (!isEmpty()) {
                for (int integer:listOfInts) {
                    out = out + Integer.toString(integer) + ", ";
                }
            }
            out = out.substring(0,out.length() -2);
            out = out + "]";
            return out;
	}
}