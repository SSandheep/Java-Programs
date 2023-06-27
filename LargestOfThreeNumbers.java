import java.util.Scanner;
public class LargestOfThreeNumbers
{
    public static void main(String[] args)
    {
        int a,b,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        System.out.println("Enter c:");
        c=sc.nextInt();
        if(a>b&&a>c)
            System.out.println("a is largest");
        else if(b>a&&b>c)
            System.out.println("b is largest");
        else
            System.out.println("C is largest");
    }
    
}
