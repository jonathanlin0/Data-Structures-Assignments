//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
package School_Jonathan_Lin;
import java.util.Stack;
import static java.lang.System.*;
import java.util.ArrayList;

public class SyntaxChecker
{
	private String exp;
	private Stack<Character> symbols;
        private String bracks;
        private boolean correct;
        

	public static void main ( String[] args )
	{
		//add test cases
            ArrayList<String> test = new ArrayList<>();
            test.add("(abc(*def)");
            test.add("[{}]");
            test.add("[");
            test.add("[{<()>}]");
            test.add("{<html[value=4]*(12)>{$x}}");
            test.add("[one]<two>{three}(four)");
            test.add("car(cdr(a)(b)))");
            test.add("car(cdr(a)(b))");
            
            for (String string: test) {
                SyntaxChecker checker = new SyntaxChecker(string);
                System.out.println(checker);
            }
            
            
        }

	public SyntaxChecker()
	{
            
	}

	public SyntaxChecker(String s)
	{
            
            bracks = "(){}[]<>";
            setExpression(s);
	}
	
	public void setExpression(String s)
	{
            exp = s;
            correct = checkExpression();
	}

	public boolean checkExpression()
	{
            
            symbols = new Stack<Character>();
            
            for (int i = 0; i < exp.length(); i++){
                char c = exp.charAt(i);
                if (bracks.indexOf(c) > -1) {
                    if (isOpen(c) == true) {
                        symbols.push(c);
                    }
                    if (isOpen(c) == false) {
                        if (symbols.size() > 0) {
                            if (symbols.peek() != bracks.charAt(bracks.indexOf(c)-1)) {
                                return false;
                            }
                            if (symbols.peek() == bracks.charAt(bracks.indexOf(c)-1)) {
                                symbols.pop();
                            }
                        }
                        else {
                            return false;
                        }
                    }
                }
                
            }
            if (symbols.size() != 0) {
                return false;
            }
            return true;
	}
        
        public boolean isOpen(char s) {
            if (bracks.indexOf(s) %2 == 0) {
                return true;
            }
            return false;
        }

	//write a toString
        
        public String toString(){
            if (correct == true) {
                return exp + " is correct";
            }
            return exp + " is incorrect";
        }
}