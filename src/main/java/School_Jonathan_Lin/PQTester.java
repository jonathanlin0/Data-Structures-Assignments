//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -  

import java.util.Queue;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class PQTester
{
	private Queue<String> pQueue;

	public PQTester()
	{
            setPQ("");
	}

	public PQTester(String list)
	{
            pQueue = new PriorityQueue<>();
            setPQ(list);
	}

	public void setPQ(String list)
	{
            String[] strings = list.split(" ");
            for (String string:strings) {
                pQueue.add(string);
            }
	}
	
	public Object getMin()
	{
            return pQueue.peek();
	}
	
	public String getNaturalOrder()
	{
            Queue temp = pQueue;
            String out="";
            while (!pQueue.isEmpty()) {
                out = out + temp.remove();
                out = out + " ";
            }
            
            return out;		
	}

	//write a toString method
        public String toString() {
            String out = "";
            
            out = "toString() - " + pQueue.toString();
            out = out + "\n";
            out = out + "getMin() - " + getMin();
            out = out + "\n";
            out = out + "getNaturalOrder() - " + getNaturalOrder();
            out = out + "\n";
            
            return out;
        }
}