//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Jonathan Lin

package School_Jonathan_Lin;
import java.io.*;
import java.util.*;

public class Relatives
{
    
    
        /*
        
    USAGE EXAMPLES: 
    object.getRelatives("Bob");
    object.getRelatives("Elton");
        */
    
    
    
	private Map<String,Set<String>> map;

	public Relatives()
	{
            map = new HashMap<>();
            
            //read .dat file
            ArrayList<String> pairsInput;
            try {
                pairsInput = new ArrayList<String>();
                Scanner scanner = new Scanner(new File("relatives.dat"));
                while (scanner.hasNextLine())    {
                    pairsInput.add(scanner.nextLine());
                }
            } catch (IOException e) {
                System.out.println("Error: " + e);
                pairsInput = null;
            }
            
            for (String pair:pairsInput){
                if (pair.contains(" ")) {
                    setPersonRelative(pair);
                }
            }
            

	}

	public void setPersonRelative(String line)
	{
            String[] personRelative = line.split(" ");
            
            String subject = personRelative[0];
            Set<String> set = new TreeSet<>();
            if (map.isEmpty() == false) {
                if (map.keySet().contains(subject)) {
                    set = map.get(subject);
                }
            }
            set.add(personRelative[1]);
            map.put(subject,set);

	}


	public String getRelatives(String person)
	{
            if (map.containsKey(person)) {
                String output = "";
                for (String element:map.get(person)) {
                    output = output + " ";
                    output = output + element;
                }
                output = output.substring(1,output.length());
                System.out.print(person + " is related to " + output);
            }
		return "";
	}

}