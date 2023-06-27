package palindrome1;
import java.util.Scanner;
public class Palindrome1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int n=str.length();
        char a = 0;
        char b = 0;
        for(int i=0;i<n;i++)
        {
            a=str.charAt(i);
        }
        for(int i=n-1;i>=0;i--)
        {
            b=str.charAt(i);
        }

       if(a==b)
       {
           System.out.println("Palindrome");
       }
       else
           System.out.println("Not a palindrome");
       
    }
    
}
