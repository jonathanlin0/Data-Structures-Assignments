//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

public interface Linkable
{
   Comparable getValue();
   Linkable getNext();
   void setNext(Linkable next);
   void setValue(Comparable value);
}