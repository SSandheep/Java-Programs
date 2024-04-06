/*
Given a sentence cstr, written in a camel case (i.e. every word starts with an uppercase letter and there is no space or
punctuation between two consecutive words). The task is to put one space after every word and convert every uppercase
letter to lowercase.
Example 1:
Input :
ThisIsAnAutomationEra
Output:
this is an Automation Era--- Value of cstr
Output:
this is an automation era
Example 2:
Input:
HeyYou--- Value of cstr
Output:
hey you
*/
package casingproblem;
import java.util.Scanner;
import java.util.Stack;
public class CasingProblem 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String in Camel Case:");
        String s=sc.next();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(st.isEmpty())
                st.push(s.charAt(0));
            if(Character.isUpperCase(s.charAt(i)))
            {
                st.push(' ');
                st.push(Character.toLowerCase(s.charAt(i)));
            }
           else
               st.push(s.charAt(i));
        }
        System.out.println("The output string is:");
        for(int i=2;i<st.size();i++)
        {
             System.out.print(st.get(i));
        } 
    }
}
