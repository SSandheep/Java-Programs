/*
//Automorphic Number
Given a number N, the task is to check whether the number is an Automorphic number or not. A number is called an Automorphic number if and only if its square ends in the same digits as the number itself.

Examples : 

Input  : N = 76 
Output : Automorphic
Explanation: As 76*76 = 5776

Input  : N = 25
Output : Automorphic
As 25*25 = 625

Input : N = 7
Output : Not Automorphic
As 7*7 = 49

 
//Harshad (Or Niven) Number:
An integer number in base 10 which is divisible by the sum of its digits is said to be a Harshad Number. An n-Harshad number is an integer number divisible by the sum of its digit in base n.
Below are the first few Harshad Numbers represented in base 10:
1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 18, 20………
Given a number in base 10, our task is to check if it is a Harshad Number or not.

Examples : 

Input: 3
Output: 3 is a Harshad Number

Input: 18
Output: 18 is a Harshad Number


Input: 15
Output: 15 is not a Harshad Number

*/
package automorphic.harshad_num;
import java.util.Scanner;
public class AutomorphicHarshad_Num 
{
    public static boolean IsAutomorpicNum(int num) 
    {
        int len=0;
        int n=num;
        int squarenum=n*n;
        while(num>0)
        {
            len++;
            num=num/10;         
        }
        System.out.println(len);
        int pv=1;
        while(len>0)
        {
            pv=pv*10;
            len--;
        }
        System.out.println(pv);
        
       if(n%pv==squarenum%pv)
           return true;
       else
           return false;
       
    }
    public static boolean IsHarshadNum(int number)
    {
        int sum=0;
        int digit;
        int num=number;
        while(num!=0)
        {
        digit=num%10;
        sum=sum+digit;
        num=num/10;
        } 
        if(number%sum==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        System.out.println("Enter a number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        if(IsAutomorpicNum(num))
            System.out.println("Automorphic Number");
        else
            System.out.println("Not an Automorphic Number");
       
        if(IsHarshadNum(num))
            System.out.println("Harshad Number");
        else
            System.out.println("Not an Harshad Number");
   
    }

    
}
