//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

import java.util.HashSet;
import java.util.Set;


public class ThingCount implements Comparable
{
	private int count;
	private Object thing;
	
	public ThingCount()
	{
            count = 0;
            thing = null;
	}
	
	public ThingCount(Object thang, int cnt)
	{
            thing = thang;
            count = cnt;
	}
	
	public int getCount()
	{
            return count;
	}
	
	public void setCount(int cnt)
	{
            count = cnt;
	}

	public void setThing(Object obj)
	{
            thing = obj;
	}	
	
	public Object getThing()
	{
            return thing;
	}
	
	public boolean equals(Object obj)
	{
            
		ThingCount other = (ThingCount)obj;
                
                
                if (other!= null) {
                    if (getThing().equals(other.getThing()) && getCount() == other.getCount()) {
                        return true;
                    }
                }
                
		return false;
	}
	
	public int compareTo(Object obj)
	{
            ThingCount other = (ThingCount)obj;
            if (!other.getThing().getClass().equals(getThing().getClass())) {
                throw new RuntimeException("both objects are not the same type");
            }
            if (!(other.getThing() instanceof Comparable && getThing() instanceof Comparable)) {
                throw new RuntimeException("both objects do not implement comparable");
            }
		return -1;	
	}
	
	public String toString()
	{
		return ""+ getThing() + " - " + getCount();
	}
}