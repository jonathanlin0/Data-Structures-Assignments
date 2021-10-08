//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package School_Jonathan_Lin;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.ArrayList;

public class Convert
{
	private String sentence;
	private String binary;

	public static void main ( String[] args )
	{
		
	// add test data as a string array
            ArrayList<String> pairsInput;
            try {
                pairsInput = new ArrayList<String>();
                Scanner scanner = new Scanner(new File("convert.dat"));
                while (scanner.hasNextLine())    {
                    pairsInput.add(scanner.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
                pairsInput = null;
            }
	// add test cases
            for (String string:pairsInput) {
                Convert converter = new Convert(string);
                converter.convert();
            }
	}

	public Convert()
	{

	}

	public Convert(String sentence)
	{
            this.sentence = sentence;

	}

	public void convert()
	{
            char[] chars = new char[sentence.length()];
            
            for (int x = 0; x < sentence.length(); x++) {
                chars[x] = sentence.charAt(x);
            }
            
            String out = "";
            for (char ch : chars) {
                int add = ch;
                out = out + "0" + Integer.toString(add,2);
                out = out + " ";
            }
            
            System.out.println(sentence);
            System.out.println(out);
            System.out.println("");


	}

	public String toString()
	{
            
		return sentence;
	}
}