package countofnums_divisiblebyx_withintherangexandy;
import java.util.Scanner;
public class CountOfNums_DivisibleByX_WithinTheRangeXandY 
{
    public static void main(String[] args) 
    {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter X:");
         int x=sc.nextInt();
         System.out.println("Enter Y:");
         int y=sc.nextInt();
         int cnt=0;
         for(int i=x;i<=y;i++)
         {
             if(i%x==0)
                 cnt++;
         }
         System.out.println("The count of numbers divisible by X within the range X and Y is:\n "+cnt);
        
    }
    
}
