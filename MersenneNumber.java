package mersennenumber;
import java.util.Scanner;
public class MersenneNumber 
{
    public static boolean isMersseneNumber (int n)
    {
        int r=n & n+1;
        if(r==0)
            return true;
        else
            return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number :");
        int num=sc.nextInt();
        if(isMersseneNumber(num))
            System.out.println("It is a Mersenne Number");
        else
            System.out.println("It is not a Mersenne Number");
    }
}
