//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

import java.util.Queue;
import java.util.Stack;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;

public class PalinList
{
	private Queue<String> queue;
	private Stack<String> stack;

	public PalinList()
	{
            setList("");
	}

	public PalinList(String list)
	{
            queue = new LinkedList<String>();
            stack = new Stack<>();
            setList(list);
	}

	public void setList(String list)
	{
            String[] array = list.split(" ");
            for (String string: array) {
                queue.add(string);
                stack.push(string);
            }
	}

	public boolean isPalin()
	{

            while (!queue.isEmpty()) {
                String front = queue.remove();
                String back = stack.pop();

                if (front.compareTo(back) != 0) {
                    return false;
                }
            }
            return true;
	}


	//write a toString method
        public String toString() {
            String out = "";
            out = queue.toString();
            if (isPalin() == true) {
                out = out + " is a palinlist.";
            }
            if (isPalin() == false) {
                out = out + " is not a palinlist.";
            }
            return out;
        }
}