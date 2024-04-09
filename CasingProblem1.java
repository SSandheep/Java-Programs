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
package casingproblem1;
import java.util.Scanner;
public class CasingProblem1
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String in Camel Case:");
        String s=sc.next();
        StringBuilder str=new StringBuilder();
        str.append(Character.toLowerCase(s.charAt(0)));
        for(int i=1;i<s.length();i++)
        {
            if(Character.isUpperCase(s.charAt(i)))
                str.append(" ").append(Character.toLowerCase(s.charAt(i)));
            else
                str.append(s.charAt(i));
        }
        System.out.println(str.toString());
    }
    
}
