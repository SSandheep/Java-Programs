import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args)
    {
        String S1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String:");
        S1=sc.next();
        String reverseS1="";
        for(int i=S1.length()-1;i>=0;--i)
        {
            reverseS1=reverseS1+S1.charAt(i);
        }
        if((S1.toLowerCase()).equals(reverseS1.toLowerCase()))
        {
            System.out.println("Palindrome"); 
        }
        else
        {
            System.out.println("Not a Palindrome");  
        }           
    }
    
}

