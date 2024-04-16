package binary_to_decimal;

import java.util.Scanner;

public class Binary_To_Decimal 
{
    public static int binaryToDecimal(String S)
    {
        int N=0;
        int j=S.length()-1;
        for(int i=0;i<S.length();i++)
        {
            N=N+Integer.parseInt(String.valueOf(S.charAt(j)))*(int)Math.pow(2, i);
            j--;
        }
        return N;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);   
        System.out.println("Enter the Binary String:");
        String s=sc.next();
        int num=binaryToDecimal(s);
        System.out.println("The corresponding Decimal Number is:");
        System.out.println(num);
    }
    
}
