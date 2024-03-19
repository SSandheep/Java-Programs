package balancedbrackets;
import java.util.Scanner;
import java.util.Stack;
public class BalancedBrackets 
{
    public static boolean isBalancedExpression(String exp)
    {
        Stack<Character> st =new Stack<>();
        for(int i=0;i<exp.length();i++)
        {
            if(st.isEmpty())
                st.push(exp.charAt(i));
            else if(st.peek()=='{' && exp.charAt(i)=='}' ||  st.peek()=='[' && exp.charAt(i)==']' ||  st.peek()=='(' && exp.charAt(i)==')'  )
                st.pop();
            else
                st.push(exp.charAt(i));
             
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the expression:");
        String exp=sc.next();
        if(isBalancedExpression(exp))
            System.out.println("Balanced Expression");
        else
            System.out.println("Not a Balanced Expression");
        
    }
    
}
//O(n) complexity