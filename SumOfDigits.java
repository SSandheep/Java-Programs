import java.util.Scanner;
public class SumOfDigits
{
    public static void main(String[] args)
    {
        int n;
        int Sum=0;
        int a;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the  number:");
        n=sc.nextInt();
        while(n!=0)
        {
            a=n%10;
            Sum=Sum+a;
            n=n/10;
            
        }
        System.out.println("Sum is:"+Sum);
        
    }
    
}
