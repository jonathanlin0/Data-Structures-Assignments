//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package School_Jonathan_Lin;
import java.util.*;
import static java.lang.System.*;


public class StackTest
{
	private Stack<String> stack;
	
	public static void main ( String[] args )
	{
		//add test cases	
            StackTest bob = new StackTest("a b c d e f g h i");
            bob.popEmAll();
	}

	public StackTest()
	{
            setStack("");
            System.out.println("hi");
	}

	public StackTest(String line)
	{
            setStack(line);
	}
	
	public void setStack(String line)
	{
            stack = new Stack<String>();
            String str[] = line.split(" ");
            
            for (String string:str) {
                stack.push(string);
            }
            System.out.println(stack);
            System.out.println("");
	}

	public void popEmAll()
	{
            System.out.println("popping all items from the stack");
            while (stack.isEmpty() == false) {
                System.out.print(stack.pop());
                System.out.print(" ");
            }
	}

	//add a toString
}