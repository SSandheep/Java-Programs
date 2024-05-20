package decimaltobinaryin10bits;
import java.util.Scanner;
public class DecimalToBinaryIn10Bits 
{
    public static String decimalToBinary(int num)
    {
        StringBuilder bs=new StringBuilder();
        int rem=0;
        while(num!=0)
        {
            rem=num%2;
            bs.append(rem);
            num=num/2;
        }
        if(num==1)
            bs.append(num);
        
        while(bs.length()<10)
            bs.append(0);
        return bs.reverse().toString();
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int N=sc.nextInt();
        String binarystring=decimalToBinary(N);
        System.out.println("The binary representation of given Integer with 10 bits is:\n"+binarystring);
        int cnt=0;
        for(int i=0;i<binarystring.length();i++)
        {
            if(binarystring.charAt(i)=='0')
                cnt++;
        }
        System.out.println("The number of zeros in it : "+cnt);
    }
    
}
