/*
 Pangram Checking
Given a string check if it is Pangram or not. A pangram is a sentence containing every 
letter in the English Alphabet.
Examples : The quick brown fox jumps over the lazy dog ” is a Pangram [Contains all the 
characters from „a‟ to „z‟]
“The quick brown fox jumps over the dog” is not a Pangram [Doesn‟t contains all the 
characters from „a‟ to „z‟, as „l‟, „z‟, „y‟ are missing]
We create a mark[] array of Boolean type. We iterate through all the characters of our 
string and whenever we see a character we mark it. Lowercase and Uppercase are 
considered the same. So „A‟ and „a‟ are marked in index 0 and similarly „Z‟ and „z‟ are 
marked in index 25.
After iterating through all the characters we check whether all the characters are marked 
or not. If not then return false as this is not a pangram else return true.
 */
package pangram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
public class Pangram 
{
    public static boolean isPangram(String str)
    {
    String s=str.replaceAll("\\s", "");
     String alp="abcdefghijklmnopqrstuvwxyz";
     ArrayList<Character>a=new ArrayList<>();
      for(int i=0;i<alp.length();i++)
      {
          a.add(alp.charAt(i));
      }
      HashSet<Character>h=new HashSet<>();
      for(int i=0;i<s.length();i++)
      {
          h.add(Character.toLowerCase(s.charAt(i)));
      }
      Arrays.sort(h.toArray());
     if(Arrays.equals(a.toArray(), h.toArray()))
       return true;
     else
        return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s=sc.nextLine();
        
        if(isPangram(s))
            System.out.println("Yes, It is a Pangram");
        else
            System.out.println("No, It is not a Pangram");
    }
    
}
