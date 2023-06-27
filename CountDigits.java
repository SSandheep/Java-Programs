import java .util.Scanner;
public class CountDigits
{
    public static void main(String[] args) 
   {
       int a;
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number:");
       a=sc.nextInt();
       if(a>=0&&a<10)
           System.out.println("a has one digit");
       else if (a>9&&a<100)
           System.out.println("a has 2 digits");
       else if (a>99&&a<1000)
           System.out.println("a has 3 digits");
       else
           System.out.println("a has more than 3 digits");
   }
    
}
