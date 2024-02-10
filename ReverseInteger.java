package reverseinteger;

import java.util.Scanner;

public class ReverseInteger {
    public static int reverse(int x)
    {
        String t=Integer.toString(x);
        int rev=0;
        String r="";
        
        for(int i=t.length()-1;i>=0;i--)
        { 
          r=String.valueOf(t.charAt(i));
          rev=(rev*10)+Integer.parseInt(r);
        }
     return  rev;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
       int num=sc.nextInt();
       int rev=0;
       if(num>0)
          rev= reverse(num);
       else if(num<0)
       {
           num=Math.abs(num);
             rev= reverse(num);
       }
       
        System.out.println(rev);

    }
    
}
