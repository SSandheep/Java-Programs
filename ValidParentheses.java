package validparentheses;
import java.util.Scanner;
import java.util.Stack;
public class ValidParentheses {
    public static boolean checkValidParantheses(String s1)
    {
        Stack <Character>st=new Stack<>();
        for(int i=0;i<s1.length();i++)
        {
            if(st.isEmpty())
                st.push(s1.charAt(i));
          else if(st.peek()=='[' && s1.charAt(i)==']' || st.peek()=='(' && s1.charAt(i)==')' || st.peek()=='{' && s1.charAt(i)=='}' )
                st.pop();
           else
               st.push(s1.charAt(i));
        }
        if(st.isEmpty())
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the paranthesis:");
        String s=sc.nextLine();
        if(checkValidParantheses(s))
            System.out.println("Valid");
        else
            System.out.println("InValid");
            

    }
    
}
