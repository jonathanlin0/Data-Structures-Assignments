//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

public class PQTestRunner
{
	public static void main ( String[] args )
	{
		//add test cases
            PQTester bob = new PQTester("one two three four five six seven");
            System.out.println(bob);
            bob = new PQTester("1 2 3 4 5 one two three four five");
            System.out.println(bob);
            bob = new PQTester("a p h j e f m c i d k l g n o b");
            System.out.println(bob);
	}
}