package happynumber;
import java.util.Scanner;
public class HappyNumber 
{
    public boolean isHappy(int n) 
    {
        if (n == 1 || n == 7)
            return true;
        int sum = n;
        int x = n;
        while(sum > 9) {
            sum = 0;
            while (x > 0) {
                int d = x%10;
                sum += d*d;
                x/=10;
            }
            if (sum == 1)
                return true;
            x = sum;
        }
        if(sum == 7)
            return true;
        return false;
    }

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        HappyNumber hn=new HappyNumber();
        System.out.println(hn.isHappy(num));

    }
    
}
