/*
Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
A string is represented by an array if the array elements concatenated in order forms the string.

Example 1:
Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
Output: true
Explanation:
word1 represents string "ab" + "c" -> "abc"
word2 represents string "a" + "bc" -> "abc"
The strings are the same, so return true.

Example 2:
Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
Output: false

Example 3:
Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
Output: true

Constraints:
1 <= word1.length, word2.length <= 103
1 <= word1[i].length, word2[i].length <= 103
1 <= sum(word1[i].length), sum(word2[i].length) <= 103
word1[i] and word2[i] consist of lowercase letters.
 */
package equivalentstringarrays;
import java.util.Arrays;
import java.util.Scanner;
public class EquivalentStringArrays {
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        String str1="";
        String str2="";
        for(int i=0;i<word1.length;i++)
        {
            str1+=word1[i];
        }
        for(int i=0;i<word2.length;i++)
        {
            str2+=word2[i];
        }
        if(str1.equals(str2))
         return true;
        else
          return false;
    }
    public static void main(String[] args) 
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter size of 1st String Array:");
      int n1=sc.nextInt();
      System.out.println("Enter size of 2nd String Array:");
      int n2=sc.nextInt();
      String word1[]=new String[n1];
      String word2[]=new String[n2];
      System.out.println("Enter Strings of 1st String Array:");
      for(int i=0;i<n1;i++)
      {
          word1[i]=sc.next();
      }    
      System.out.println("Enter Strings of 2nd String Array:");
      for(int i=0;i<n2;i++)
      {
          word2[i]=sc.next();
      }
        System.out.println("The String arrays are:");
        System.out.println(Arrays.toString(word1));
        System.out.println(Arrays.toString(word2));
        if(arrayStringsAreEqual(word1,word2))
        {
            System.out.println("True");
        }
        else
            System.out.println("False");
    }
    
}
