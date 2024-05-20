package decimaltobinaryin10bits_countofzeros;
import java.util.Scanner;
public class DecimalToBinaryIn10bits_CountOfZeros 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal Number N:");
        int num=sc.nextInt();
        int rem=0;
        int pv=1;
        int sum=0;
        int cnt=0;
        int len=0;

        while(num!=0)
        {
            rem=num%2;
            sum=sum+rem*pv;
            num=num/2;
            pv=pv*10;
        }
        int temp=sum;
        while(temp!=0)
        {
           len++;
           temp=temp/10;
        }
        for(int i=0;i<10-len;i++)
        {
            System.out.print(0);
        }
        System.out.println(sum);
        cnt=10-len;
        for(int i=0;i<len;i++)
        {
            if(sum%10==0)
                cnt++;
            sum=sum/10;
        }
         System.out.println(cnt);
        }
       
    }
    

