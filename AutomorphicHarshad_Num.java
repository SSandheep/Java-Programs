package automorphic.harshad_num;
import java.util.Scanner;
public class AutomorphicHarshad_Num 
{
    
    private static boolean IsAutomorpicNum(int n) {
        int squarenum=n*n;
        if(n%10==squarenum%10)
            return true;
        else
            return false;       
    }
    private static boolean IsHarshadNum(int number)
    {
        int sum=0;
        int digit;
        while(number!=0)
        {
        digit=number%10;
        sum=sum+digit;
        number=number/10;
        }
        int result=number%sum;
        if(result==0)
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
