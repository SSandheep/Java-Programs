package reversenum;
import java.util.Scanner;
public class ReverseNum {   
    public static int reverseNum(int x)
    {  
        int digit;
        int rev=0;
        int temp=x;
        while(temp>0)
        {
           digit=temp%10;
           rev=(rev*10)+digit;
            temp=temp/10;
        }  
        
        if(x>0 && x<Math.pow(2,30))
       {
           return rev;
       }
       else if(x<0 && x>-Math.pow(2,31))
        {
            x=Math.abs(x);
            rev=-reverseNum(x);
            return rev;
        }

           
      else   if (x==0)
            return 0;
       else
            return 0;       
    }

    public static void main(String[] args) {
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();   
        System.out.println("The Number is:"+num);
        System.out.println("Reversed Number is:"+reverseNum(num));

        System.out.println(Math.pow(-2,31));
    }
    
}
