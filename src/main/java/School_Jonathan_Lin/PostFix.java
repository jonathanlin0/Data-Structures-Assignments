//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package School_Jonathan_Lin;
import java.util.Stack;
import java.util.Scanner;
import static java.lang.System.*;
import java.util.ArrayList;

public class PostFix
{
	private Stack<Double> stack;
	private String expression;

	public static void main ( String[] args )
	{
            ArrayList<String> test = new ArrayList<>();
            test.add("2 7 + 1 2 + +");
            test.add("1 2 3 4 + + +");
            test.add("9 3 * 8 / 4 +");
            test.add("3 3 + 7 * 9 2 / +");
            test.add("9 3 / 2 * 7 9 * + 4 -");
            test.add("5 5 + 2 * 4 / 9 +");
            
            for (String string: test) {
                PostFix calc = new PostFix(string);
                System.out.println(calc);
            }
	}

	public PostFix()
	{
	}

	public PostFix(String exp)
	{
            setExpression(exp);
            solve();
	}

	public void setExpression(String exp)
	{
            expression = exp;
	}

	public double calc(double one, double two, char op)
	{
            if (op == '+') {
                return one + two;
            }
            if (op == '-') {
                return two - one;
            }
            if (op == '*') {
                return one * two;
            }
            if (op == '/') {
                return two / one;
            }
            return 0.0;
	}

	public void solve()
	{
            String operators = "+-*/";
            String str[] = expression.split(" ");
            stack = new Stack<Double>();
            
            for (int x = 0; x < expression.length();x++) {
                String characterStr = expression.substring(x,x+1);
                
                if (characterStr.equals(" ") == false) {
                    if (operators.contains(characterStr) == false) {
                        stack.push(Double.parseDouble(characterStr+".0"));
                    }
                    if (operators.contains(characterStr)) {
                        double add = calc(stack.pop(),stack.pop(),characterStr.charAt(0));
                        stack.push(add);
                    }
                }
            }

	}

	//add a toString
        public String toString() {
            return expression + " = " + stack.toString();
        }
}