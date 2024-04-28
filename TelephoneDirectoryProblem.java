/*
Telephone directory Problem Statement
Given a list of phone numbers determine if it is consistent in the sense that has no number is the prefix of another.Let „s say the phone numbers:
Bheembai 1002345678
Chakravathy 9876543210
Police 100
Ramachandran 9100012345
In this case ,It‟s not possible to call Bheembai, because the exchange would direct call you to the police as soon as you had dialed the first three digits.So this list would not be consistent.
Input
The first line of input gives a single integer n, number of phone numbers, 1<=n<=10. Then follows n lines with one uniques phone number on each line.A phone number can at most have ten digits.
Output
Please refer to the examples below
Input 1:
3
911
8300383593
9112542612
Expected output
No, there is a collision with 911
Input 2:
5
113
1234078901
1234401234
1234512345
9834698765
Expected output
Yes, the list of 5 numbers is consistent

*/
package telephonedirectoryproblem;
import java.util.Scanner;
public class TelephoneDirectoryProblem
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of phone numbers to be entered:");
        int n=sc.nextInt();
        String phnos[]=new String[n];
        String collision=null;
        System.out.println("Enter the phone numbers");
        for(int i=0;i<n;i++)
        {
            phnos[i]=sc.next();
        }
        int validphno=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
               if(phnos[i].length()<=10 && phnos[i].length()<=10)
                   validphno=1;
               else
                   validphno=0;
               
               if(phnos[j].startsWith(phnos[i]) && validphno==1)
               {
                   collision=phnos[i];
               }
                              
               if(phnos[i].startsWith(phnos[j]) && validphno==1)
               {
                   collision=phnos[j];
               }
            }
        }
       if(validphno==0)
         System.out.println("Entered phnos are not valid");
        
        if(collision!=null)
          System.out.println("No, there is collision with "+collision);
        else 
          System.out.println("Yes, the list of 5 numbers is consistent");
 
      
    }
    
}
