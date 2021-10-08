//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package School_Jonathan_Lin;
import java.util.LinkedList;
import static java.lang.System.*;

public class JavaLinkedList
{
	private LinkedList<Integer> list;

	public JavaLinkedList()
	{
		list = new LinkedList<Integer>();
	}

	public JavaLinkedList(int[] nums)
	{
		list = new LinkedList<Integer>();
		for(int num : nums)
		{
			list.add(num);
		}
	}

	public double getSum(  )
	{
		double total=0;
                for (int x :list) {
                    total = total + x;
                }
		return total;
	}

	public double getAvg(  )
	{
            int length = list.size();
            return getSum()/length;
	}

	public int getLargest()
	{
		int largest=Integer.MIN_VALUE;
                for (int x :list) {
                    if (x > largest) {
                        largest = x;
                    }
                }
		return largest;
	}

	public int getSmallest()
	{
		int smallest = smallest=Integer.MAX_VALUE;
                for (int x : list) {
                    if (x < smallest) {
                        smallest = x;
                    }
                }
		return smallest;
	}

	public String toString()
	{
            
		String output="";
                output = "SUM:: " + getSum() + "\nAVERAGE:: " + getAvg() + "\nSMALLEST:: " + getSmallest() + "\nLARGEST:: " + getLargest();
		return output;
	}
}