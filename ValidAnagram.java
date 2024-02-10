package validanagram;
import java.util.Arrays;
import java.util.Scanner;
public class ValidAnagram 
{
    public static boolean isAnagram(String s, String t) 
    {
        if(s.length()==t.length())
        {
            char arr1[]=s.toLowerCase().toCharArray();
            char arr2[]=t.toLowerCase().toCharArray();
             Arrays.sort(arr1);
             Arrays.sort(arr2);
             if(Arrays.equals(arr1, arr2))
                 return true;
             else
                 return false;
        }  
        else
            return false;
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter 1st String:");
       String s1=sc.next();
       System.out.println("Enter 2nd String:");
       String s2=sc.next();
      System.out.println(isAnagram(s1,s2));
    }
}
