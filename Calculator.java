import java.util.Scanner;
public class Calculator 
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("Choose the operators:+,-,*,/");
     char Operator=sc.next().charAt(0);
     System.out.println("Enter a:");
     double a=sc.nextDouble();
     System.out.println("Enter b:");
     double b=sc.nextDouble();
     switch(Operator)
     {
         case'+':
            double Sum;
            Sum=a+b;
            System.out.println("Sum is "+Sum);
            break;
        case'-':
            double res;
            res=a-b;   
            System.out.println("result is "+res);
            break;
        case'*':
            double Product;
            Product = a*b;
            System.out.println("Product is "+Product);
            break;
        case'/':
            double result;
            result=a/b;
            System.out.println("result is "+result);
            break;
        default:
                System.out.print("invalid");
            
             
     }
     
    
    }
    
}
