/*
) Oddly Even
Problem Statement
Given a maximum of 100 digit numbers as input, find the difference between the sum of 
odd and even position digits.
Case 1
Input: 4567
Expected Output: 2
Explanation : Odd positions are 4 and 6 as they are pos: 1 and pos: 3, both have sum 10. 
Similarly, 5 and 7 are at even positions pos: 2 and pos: 4 with sum 12. Thus, difference is 
12 – 10 = 2
Case 2
Input: 5476
Expected Output: 2
Case 3
Input: 9834698765123
Expected Output: 3

 */
package oddlyeven;
import java.math.BigInteger;
import java.util.Scanner;
public class OddlyEven 
{
    public static int differeneBetweenSumOfOddAndEvenDigits(BigInteger n)
    {
        String s=n.toString();
        int difference;
        int oddsum=0;
        int evensum=0;
        for(int i=0;i<s.length();i++)
        {
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0)
                evensum+=Integer.parseInt(String.valueOf(s.charAt(i)));
            else
                oddsum+=Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        difference=Math.abs(evensum-oddsum);
        return difference;
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Number: ");
       BigInteger num=sc.nextBigInteger();
       int diff=differeneBetweenSumOfOddAndEvenDigits(num);
       System.out.println("The difference between sum of odd and even digits is:"+diff);
    }
    
}
