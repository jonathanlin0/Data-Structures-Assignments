//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

import static java.lang.System.*;
import java.util.Set;

public class ListFunHouse
{
	//this method will print the entire list on the screen
   public static void print(ListNode list)
   {
       while (list != null) {
           System.out.print(list.getValue() + " ");
           list = list.getNext();
       }
   }		
	
	//this method will return the number of nodes present in list
	public static int nodeCount(ListNode list)
	{
            int count=0;
            while (list != null) {
                count++;
                list = list.getNext();
            }
		return count;
	}
		
	//this method will create a new node with the same value as the first node and add this
	//new node to the list.  Once finished, the first node will occur twice.
	public static void doubleFirst(ListNode list)
	{
            ListNode newln = new ListNode();
            newln.setValue(list.getValue());
            newln.setNext(list.getNext());
            list.setNext(newln);
            
            
	}

	//this method will create a new node with the same value as the last node and add this
	//new node at the end.  Once finished, the last node will occur twice.
	public static void doubleLast(ListNode list)
	{
            ListNode prev = null;
            ListNode current = list;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            ListNode newNOde = new ListNode();
            current.setNext(newNOde);
            newNOde.setValue(current.getValue());
	}
		
	//method skipEveryOther will remove every other node
	public static void skipEveryOther(ListNode list)
	{  
            ListNode[] nodes = new ListNode[nodeCount(list)];
            int count = 0;
            ListNode current = list;
            while (current.getNext() != null) {
                nodes[count] = current;
                count++;
                current = current.getNext();
            }
            nodes[count] = current;
            for (int i = 0;i < nodes.length; i=i+2){
                nodes[i-1].setNext(nodes[i].getNext());
            }
	}

	//this method will set the value of every xth node in the list
	public static void setXthNode(ListNode list, int x, Comparable value)
	{
            ListNode[] nodes = new ListNode[nodeCount(list)];
            int count = 0;
            ListNode current = list;
            while (current.getNext() != null) {
                nodes[count] = current;
                count++;
                current = current.getNext();
            }
            nodes[count] = current;
            for (int i = x-1; i < nodes.length; i=i+x) {
                nodes[i].setValue(value);
            }
	}	

	//this method will remove every xth node in the list
	public static void removeXthNode(ListNode list, int x)
	{
            ListNode[] nodes = new ListNode[nodeCount(list)];
            int count = 0;
            ListNode current = list;
            while (current.getNext() != null) {
                nodes[count] = current;
                count++;
                current = current.getNext();
            }
            nodes[count] = current;
            for (int i = 1; i < nodes.length; i= i+x) {
                nodes[i-1].setNext(nodes[i].getNext());
            }
	}		
}