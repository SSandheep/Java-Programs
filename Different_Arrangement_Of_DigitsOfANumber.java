/*
Given a number, separate the odd and even digits of the number without changing the order as per the input.
if k=1, Arrange all even digits and then the odd digits
if k=0, Arrange all odd digits and then the even digits 
i/p : 123456
        1
o/p: 246135

i/p: 123456
       0
o/p: 135246
*/
package different_arrangement_of_digitsofanumber;
import java.util.Scanner;
public class Different_Arrangement_Of_DigitsOfANumber 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter k:");
        int k=sc.nextInt();
        int pv1=1;
        int pv2=1;
        int temp=num;
        int digit;
        int res1=0;
        int res2=0;
        while(temp>0)
        {
            digit=temp%10;
            if(digit%2==0)
            {
                res1=res1+digit*pv1;
                pv1=pv1*10;
            }
            else
            {
                res2=res2+digit*pv2;
                pv2=pv2*10;
            }
            temp=temp/10;
        }
        switch (k) {
            case 1:
                System.out.print(res1+""+res2);
                break;
            case 0:
                System.out.println(res2+""+res1);
                break;
            default:
                System.out.println("Please Enter valid K value(1/0)");
                break;
        }
    }
    
}
