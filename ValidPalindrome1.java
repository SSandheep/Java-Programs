/*
A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
Given a string s, return true if it is a palindrome, or false otherwise.

Example 1:
Input: s = "A man, a plan, a canal: Panama"
Output: true
Explanation: "amanaplanacanalpanama" is a palindrome.

Example 2:
Input: s = "race a car"
Output: false
Explanation: "raceacar" is not a palindrome.

Example 3:
Input: s = " "
Output: true
Explanation: s is an empty string "" after removing non-alphanumeric characters.
Since an empty string reads the same forward and backward, it is a palindrome.
*/
package validpalindrome1;

import java.util.Scanner;

public class ValidPalindrome1 
{
        public static boolean isPalindrome(String str) 
        {
            StringBuilder s1=new StringBuilder();
            for(int i=0;i<str.length();i++)
            {
                if(Character.isLetterOrDigit(str.charAt(i)))
                    s1.append(Character.toLowerCase(str.charAt(i)));
            }
            if(s1.toString().equals(new StringBuilder(s1.reverse()).toString()))
                return true;
            else
              return false;
        }
        
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence:");
        String s=sc.nextLine();
        if(isPalindrome(s)==true)
            System.out.println( s+" is a palindrome");
        else
            System.out.println( s+" is not a palindrome");

    }
    
}
