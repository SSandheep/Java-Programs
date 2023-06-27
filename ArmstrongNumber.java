import java.util.Scanner;
public class ArmstrongNumber
{
    public static void main(String[] args)
    {
        int n;
        int sum=0;
        int a;
        int temp;
        Scanner sc=new Scanner(System.in);
        System.out .println("Enter a number:");
        n=sc.nextInt();
        temp=n;
        while(n!=0)
        {
            a=n%10;
            sum=sum+(a*a*a);
            n=n/10;
        }
        if(sum==temp)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
     }
}
