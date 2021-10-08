//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

import static java.lang.System.*;
import java.util.ArrayList;

public class ListFunHouseTwo
{
	private ListNode theList;
	
	public ListFunHouseTwo()
	{
            
	}
	
	public void add(Comparable data)
	{
            ListNode head = theList;
            
            if (head == null) {
                ListNode newNode = new ListNode();
                newNode.setValue(data);
                newNode.setNext(null);
                theList = newNode;
            }
            else {
                while (head.getNext() != null) {
                    head = head.getNext();
                }
                ListNode newNode = new ListNode();
                newNode.setValue(data);
                newNode.setNext(null);
                head.setNext(newNode);
            }
            
	}
	
	//this method will return the number of nodes present in list
	public int nodeCount()
	{
            ListNode temp = theList;
            int count = 0;
            while (temp!= null) {
                count++;
                temp = temp.getNext();
            }
            return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node at the front of the list.  Once finished, the first node will occur twice.
	public void doubleFirst()
	{
            ListNode front = new ListNode();
            front.setValue(theList.getValue());
            front.setNext(theList);
            theList = front;
				
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public void doubleLast()
	{
            ListNode front = theList;
            while (theList.getNext() != null) {
                theList = theList.getNext();
            }
            ListNode newNode = new ListNode();
            newNode.setValue(theList.getValue());
            newNode.setNext(null);
            theList.setNext(newNode);
            theList = front;
		
	}
	
	//method skipEveryOther will remove every other node
	public void skipEveryOther()
	{
            ArrayList<ListNode> nodes = new ArrayList<>();
            int count = 0;
            ListNode current = theList;
            while (current.getNext() != null) {
                nodes.add(current);
                count++;
                current = current.getNext();
            }
            nodes.add(current);
            for (int i = 0; i < nodes.size(); i=i+2) {
                nodes.get(i-1).setNext(nodes.get(i).getNext());
            }

	}

	//this method will set the value of every xth node in the list
	public void setXthNode(int x, Comparable value)
	{
            int index = 1;
            ListNode front = theList;
            while (theList != null) {
                if (index % x == 0) {
                    theList.setValue(value);
                }
                theList = theList.getNext();
                index++;
            }
            theList = front;

	
	}	

	//this method will remove every xth node in the list
	public void removeXthNode(int x)
	{
            ListNode front = theList;
            int index = 1;
            while (theList.getNext() != null) {
                if ((index+1) % x == 0) {
                    theList.setNext(theList.getNext().getNext());
                }
                else {
                    theList = theList.getNext();
                }
                index++;
            }
            theList = front;
	
	}		
	//this method will return a String containing the entire list
   public String toString()
   {
   	String output="";
        ListNode head = theList;
        while (theList != null) {
            output = output + " " + theList.getValue();
            theList = theList.getNext();
        }

        theList = head;

   	return output;
   }			
	
}