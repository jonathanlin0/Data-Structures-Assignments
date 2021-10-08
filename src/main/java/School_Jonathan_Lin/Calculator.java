/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package School_Jonathan_Lin;
import java.util.Scanner;


/**
 *
 * @author Jonathan
 */
public class Calculator {
    
    public static double principle(String input) throws Exception{
        
        double out = 0;
        try {
            out = Double.parseDouble(input);
            if (out < 0){
                System.out.println("hi");
                throw new ArithmeticException("Invalid Input, need a value above 0.");
            }
        }
        catch (Exception e){
            throw new ArithmeticException("Invalid Input, need a value above 0.");
        }
        return out;
    }
    
    public static double amountAdded(String input) throws Exception{
        double out = 0;
        try {
            out = Double.parseDouble(input);
        }
        catch (Exception e){
            throw new ArithmeticException("Invalid Input, need an integer.");
        }
        return out;
    }
    
    public static double interest(String input) throws Exception{
        double out = 0;
        try {
            out = Double.parseDouble(input);
        }
        catch (Exception e){
            throw new ArithmeticException("Invalid Input, need an double.");
        }
        return out;
    }
    
    public static int time(String input) throws Exception{
        int out = 0;
        try {
            out = Integer.parseInt(input);
            if (out < 0){
                throw new ArithmeticException("Invalid Input, need a positive integer.");
            }
        }
        catch (Exception e){
            throw new ArithmeticException("Invalid Input, need a positive integer.");
        }
        return out;
    }
    
    public static void main (String[] args){
        
        Scanner input = new Scanner(System.in);
        
        double p = 0.0;
        double r = 0.0;
        int t = 0;
        double aa = 0;
        double profit = 0.0;
        String go = "yes";
        String keepGoing = "yes";
        
        
        while (go.equals("yes")){
            //checks if the principle amount is both greater than 0 and a double
            System.out.println("Enter Principle Amount");
            try{
                String in = input.nextLine();
                p = principle(in);
                
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Changed principle value to default: $100");
                p = 100.0;
            }
            //input.nextLine(); //clears the input in case of future errors

            
            //just checks to see if annual amount is an int
            //may be negative if user decides to take out money every year
            System.out.println("Enter annual amount added");
            try{
                String in = input.nextLine();
                aa = amountAdded(in);
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Changed annual amount to default: $5");
                aa = 5.0;
            }
            //input.nextLine();
            
            
            //checks if the interest rate is a double
            //can be negative in case if calculating compound depretiation
            System.out.println("Enter interest rate (in percent, not decimal)");
            try{
                String in = input.nextLine();
                r = interest(in);
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Changed interest rate to default: 2%");
                r = 2.0;
            }
            //input.nextLine();
            
            //checks to see if length of time is positive and an integer
            System.out.println("enter length of time to invest");
            try{
                String in = input.nextLine();
                t = time(in);
            }
            catch(Exception e){
                System.out.println(e);
                System.out.println("Changed length of time to default: 50 years");
                t = 50;
            }
            //input.nextLine();
            
            double realRate = r * .01;
            
            double total = p * (1 + realRate);
            System.out.println("total amount is " + total);
            
            int i = 1;
            while (i<t){
                total = (total + aa) * (1+realRate);
                i = i + 1;
                System.out.println("total is " + total);
            }
            
            i = i - 1;
            profit = total - (p + (aa * i));
            System.out.println("total profit is " + profit);
            
            System.out.println("to continue, type yes");
            keepGoing = input.next();
            if (keepGoing.equals("yes")){
                go = "yes";
            }
            else{
                go = "stop";
                System.out.println("Program Ended");
            }
        }
    }
    
}
