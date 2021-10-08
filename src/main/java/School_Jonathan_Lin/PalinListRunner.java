//(c) A+ Computer Science
//www.apluscompsci.com
package School_Jonathan_Lin;
//Name -

import java.util.ArrayList;


public class PalinListRunner
{
	public static void main ( String[] args )
	{
            ArrayList<String> cases = new ArrayList<>();
            cases.add("one two three two one");
            cases.add("1 2 3 4 5 one two three four five");
            cases.add("a b c d e f g x y z g f h");
            cases.add("racecar is racecar");
            cases.add("1 2 3 a b c c b a 3 2 1");
            cases.add("chicken is a chicken");
            for (String testCase:cases) {
                PalinList runner = new PalinList(testCase);
                System.out.println(runner);
                System.out.println("");
            }

            
	}
}