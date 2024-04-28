/*
Bastin once had trouble finding the numbers in a string. The numbers are distributed 
in a string across various test cases. There are various numbers in each test case you 
need to find the number in each test case. Each test case has various numbers in 
sequence. You need to find only those numbers which do not contain 9. For eg, if the 
string contains "hello this is alpha 5051 and 9475".You will extract 5051 and not 9475. 
You need only those numbers which are consecutive and you need to help him find 
the numbers. Print the largest number.
Note: Use long long for storing the numbers from the string.
Input:
The first line consists of T test cases and next T lines contain a string.
Output:
For each string output the number stored in that string if various numbers are there print 
the largest one. If a string has no numbers print -1.
Constraints:
1<=T<=100
1<=|S|<=10000
Example:
Input:
1
This is alpha 5057 and 97
Output:
5057
 */
package printthelargestnumberinagivensentence;
import java.util.ArrayList;
import java.util.Scanner;
public class PrintTheLargestNumberInAGivenSentence 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Sentence:");
       String str=sc.nextLine();
       String s1[]=str.split("\\s");
       ArrayList<Integer>a=new ArrayList<>();
       for(int i=0;i<s1.length;i++)
       {
          for(int j=0;j<s1[i].length();j++)
          {
              if(Character.isDigit(s1[i].charAt(j)))
              {
                  a.add(Integer.parseInt(s1[i]));
                  break;
              }
          }     
       }
      if(a.isEmpty())
            System.out.println(-1);
      else
      {
          int  max=a.get(0);
          for(int i=0;i<a.size();i++)
          {
              if(a.get(i)>max)
                 max=a.get(i);
          }
        System.out.println(max);
      } 
    }
}
