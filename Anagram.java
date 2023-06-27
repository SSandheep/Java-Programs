import java.util.Scanner;
import java.util.Arrays;
public class Anagram
{
    public static void main(String[] args)
    {
        String a;
        String b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st String:");
        a=sc.next();
        System.out.println("Enter 2nd String:");
        b=sc.next();
        a.toLowerCase();
        b.toLowerCase();
        if(a.length()!=b.length())
        {
            System.out.println("Strings are not Anagram");
        }
        else
        {
        char[]String1=a.toCharArray();
        char[]String2=b.toCharArray();
        Arrays.sort(String1);
        Arrays.sort(String2);
        if(Arrays.equals(String1,String2)==true)
        {
            System.out.println("Strings are Anagram");   
        }
        else
        {
           System.out.println("Strings are not Anagram");
        }
        }
    } 
}
