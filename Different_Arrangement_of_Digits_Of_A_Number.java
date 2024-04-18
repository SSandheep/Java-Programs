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
package different_arrangement_of_digits_of_a_number;
import java.util.Scanner;
public class Different_Arrangement_of_Digits_Of_A_Number {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println("Enter k:");
        int k=sc.nextInt();
        String s=String.valueOf(num);
        StringBuilder res1=new StringBuilder();
        StringBuilder res2=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(Integer.parseInt(String.valueOf(s.charAt(i)))%2==0)
                res1.append(s.charAt(i));
           else
                res2.append(s.charAt(i));
        }
        switch (k) 
        {
            case 1:
                System.out.print(res1+""+res2);
                break;
            case 0:
                System.out.print(res2+""+res1);
                break;
            default:
                System.out.println("Please Enter valid K value(1/0)");
                break;
        }
       
    }
    
}

