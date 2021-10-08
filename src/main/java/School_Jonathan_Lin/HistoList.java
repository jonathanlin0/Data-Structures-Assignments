//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

public class HistoList
{
	private ListNode front;

	public HistoList( )
	{
            front = null;
	}


	//ADDS NEW NODE TO THE FRONT OF THE LIST FOR LET IF IT DOES NOT EXIST.
	//IF IT EXISTS, IT BUMPS UP LET'S COUNT BY ONE
	public void add(Object obj)
	{
            if (front == null) {
                ThingCount thing = new ThingCount(obj,1);
                front = new ListNode();
                front.setValue(thing);
            }
            else {
                int index = indexOf(obj);
                if (index >=0) {
                    ListNode ln = nodeAt(index);
                    ThingCount tx = (ThingCount) ln.getValue();
                    tx.setCount(tx.getCount() +1);
                }
                else {
                    ThingCount thing = new ThingCount(obj,1);
                    front = new ListNode(thing, front);
                }
            }
	}

	//RETURNS THE INDEX POSITION OF LET IN THE LIST
	public int indexOf(Object obj)
	{
		int spot=-1;
            ListNode current = front;
            while (current != null) {
                spot++;
                ThingCount tc = (ThingCount) current.getValue();
                try {
                    if (tc.compareTo(new ThingCount(obj,0)) == 0) {
                        return spot;
                    }
                }
                catch (Exception e) {
                    
                }
                current = current.getNext();
            }
		return -1;
	}

	//RETURNS A REFERENCE TO THE NODE AT SPOT
	private ListNode nodeAt(int spot)
	{
		ListNode current=front;
                for (int i = 0; i < spot; i++) {
                    current = current.getNext();
                }
		return current;
	}

	//RETURNS THE LIST AS A BIG STRING
	public String toString()
	{
		String output = "";
                ListNode current = front;
                while (current != null) {
                    ThingCount tc = (ThingCount) current.getValue();
                    output = output + tc.toString() + "\n";
                    current = current.getNext();
                }
		return output;
	}
}