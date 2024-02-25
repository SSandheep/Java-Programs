package removeequalajacentcharactersinastring;
import java.util.Scanner;
import java.util.Stack;
public class RemoveEqualAjacentCharactersInAString 
{
    public static StringBuilder remainingCharacters(String s)
    {
        StringBuilder res=new StringBuilder();
        Stack<Character> st=new Stack<>();        
        for(int i=0;i<s.length();i++)
        {    
            if(st.isEmpty())
                st.push(s.charAt(i));
            else if(s.charAt(i)==st.peek())
                st.pop();
            else
                st.push(s.charAt(i));
        }
        
        if(st.isEmpty())
            return res.append("___");
        else
        {
            for(int i=0;i<st.size();i++)
                res.append(st.get(i));
            return res;
        }
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String str=sc.next();
        StringBuilder res=remainingCharacters(str);
        System.out.println(res);
    }
    
}
