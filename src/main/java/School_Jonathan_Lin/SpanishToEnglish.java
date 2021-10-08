//(c) A+ Computer Science
//www.apluscompsci.com

//Name -

package School_Jonathan_Lin;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.*;
import static java.lang.System.*;
import java.io.*;

/*
usage example:
object.putEntry("una text");
*/


public class SpanishToEnglish
{
	private Map<String,String> pairs;
        
	public SpanishToEnglish()
	{
            pairs = new HashMap<String,String>();
            
            //read .dat file
            ArrayList<String> pairsInput;
            try {
                pairsInput = new ArrayList<String>();
                Scanner scanner = new Scanner(new File("spantoeng.dat"));
                while (scanner.hasNextLine())    {
                    pairsInput.add(scanner.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
                pairsInput = null;
            }
            
            //transfer the pairs from the .dat file into the pairs variable
            for(String pair:pairsInput) {
                if (pair.contains(" ")) {
                    String spanish = pair.substring(0,pair.indexOf(" "));
                    String english = pair.substring(pair.indexOf(" ") + 1,pair.length());
                    pairs.put(spanish,english);
                }
            }
            
            
            
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");

                for (String word:list) {
                    System.out.print(translate(word));
                    System.out.print(" ");
                }
                

	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";

                try {
                    output = pairs.get(sent);
                } catch (Exception e) {
                    System.out.println(e);
                }
                

		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}