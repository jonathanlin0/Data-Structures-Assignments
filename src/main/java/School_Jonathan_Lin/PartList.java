/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;

/**
 *
 * @author Jonathan
 */
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;
import java.util.*;

public class PartList
{
	private TreeMap<Part, Integer> partsMap;
	
	public PartList()
	{
            
            

	}
	
	public PartList(String fileName)
	{
		this();
                partsMap = new TreeMap<Part, Integer>();
                ArrayList<String> input = new ArrayList<>();
		try
		{       
                    
                    Scanner file = new Scanner(new File("partinfo.dat"));
                    //add code here to read from the file 
                    
                    while (file.hasNextLine())    {
                        input.add(file.nextLine());
                    }
                    
                    
                    //for (String string:input) {
                    //    System.out.println(string);
                    //}
                    
                    
			//and add Parts to the map
                    
  
                    Set<Part> parts = null;
                    for (String string:input) {
                        
                        Part part = new Part(string);
                        
                        
                        

                        if (partsMap.isEmpty() == true) {
                            partsMap.put(part,1);
                        }
                        parts = partsMap.keySet();
                        
                        if (parts != null) {
                            
                            //transfew partsMap to temp to prevent java.util.concurrentmodificationexception
                            TreeMap<Part, Integer> temp = new TreeMap<>();
                            for(Map.Entry<Part,Integer> entry : partsMap.entrySet()) {
                                Part key = entry.getKey();
                                Integer value = entry.getValue();
                                
                                temp.put(key,value);
                              }
                            
                            for (Part existingPart : parts) {
                            
                                if (existingPart.compareTo(part) == 0) {
                                    int counter = temp.get(existingPart);
                                    counter = counter + 1;
                                    temp.put(existingPart, counter);
                                }
                                else{
                                    temp.put(part, 1);
                                }
                            
                            }
                            partsMap = temp;
                        
                        }

                    }


		}
		catch( IOException e )  //Most specific exceptions must be listed 1st
		{
			out.println(e);
		}
		catch( RuntimeException e )
		{
			out.println(e);
		}
		catch( Exception e )
		{
			out.println(e);
		}
		finally
		{
			//no code needed here
		}

                
                
                
                    
            //sort
            ArrayList<Part> out = new ArrayList<>();
            Set<Part> parts = partsMap.keySet();
            for (Part part:parts) {
                boolean added = false;
                if (out.size() >0) {
                    for (int i = 0; i < out.size();i++) {
                        if (part.compareTo(out.get(i)) <=0) {
                            out.add(part);
                            added = true;
                        }
                    }
                    if (added == false) {
                        out.add(part);
                    }
                }
                if (out.size() == 0) {
                    out.add(part);
                }
            }
            
            for (Part part:out) {
                String string = part + " - " + Integer.toString(partsMap.get(part));
                System.out.println(string);
            }
            
            
	}
	
	public String toString()
	{
		String output="";




		return output;
	}
}