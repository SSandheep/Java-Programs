/*
Write a program to find the smallest integer value 'b' for the given value of'a'. If we multiply the digits of 'b', we should get the exact value of 'a'. Result 'b' must
contain more than one digit.
Constraints:   1<=a<=10000
Examples:
Input: 10
Output: 25
Explanation: 2*5 = 10. Hence 25 is the smallest value for 10.
Input: 56
Output:78
Explanation: 7*8 = 56
Input: 150
Output: 556
Explanation: 5*5*6 =150
Input: 13
Output: Not Possible
*/
package smallestintegervalueforgivennumber;
import java.util.Arrays;
import java.util.Scanner;
public class SmallestIntegerValueForGivenNumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number:");
        int num=sc.nextInt();
        int res=0;
        int pv=1;
        if(num<10)
            res=res+10;
        else
        {
            for(int fac=9 ; fac >=2;fac--)
            {
                while(num%fac==0)
                {
                    res=res+pv*fac; 
                    pv=pv*10;
                    num=num/fac;      
                }
            }
            if(num!=1)
                    System.out.println("Not Possible");       
            else   
               System.out.println("The smallest Integer value for the given number:\n"+res);  
            
            sc.close();
        }

// Alternate Solution:
/*
  StringBuilder str = null;
  StringBuilder s=new StringBuilder();
  if(num<10)
  {
      res=num+10;
       System.out.println(res);
  }
  else
  {
      for(int fac=9;fac>=2;fac--)
      {
          while(num%fac==0)
          {
              str=s.append(String.valueOf(fac));
              num=num/fac;
          }
      }
      if(num!=1)
          System.out.println("Not Possible");
      else
      {
      char arr[]=new char[str.length()];
      for(int i=0;i<str.length();i++)
      {
         arr[i]=str.charAt(i);
      }
      Arrays.sort(arr);
      System.out.println(arr);
      }
  }
*/
  
    }
    
}

// Both the solutions has o(nlogn) complexity