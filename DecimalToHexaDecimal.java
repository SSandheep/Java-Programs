package decimaltohexadecimal;
import java.util.Scanner;
public class DecimalToHexaDecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Integer number:");
        int num=sc.nextInt();
        String res=Integer.toHexString(num);
        System.out.println("The corresponding binary number is: \n"+res.toUpperCase());
    }
    
}
