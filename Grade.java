import java.util.Scanner;
public class Grade
{
    public static void main(String[] args)
    {
        int n;
        double percentage;
        double totalmarks =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of subjects:");
        n=sc.nextInt();
        System.out.println("Enter marks of "+n+" subjects:");
        for(int i=0;i<n;i++)
        {
            totalmarks+=sc.nextInt();
        }
        System.out.println("Total mark is :"+totalmarks);
        percentage=(totalmarks/(n*100))*100;
        System.out.println("Percentage is :"+percentage);
        int GPA=(int) (percentage/10);
        System.out.println("GPA is: "+GPA);
        switch(GPA)
        {
            case 10:
            case 9:
                System.out.println("Grade A");
                break;
            case 8:
            case 7:
                System.out.println("Grade B");
                break;
            case 6:
            case 5:
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Grade F");
                break;
                
        }
            
        
    }
    
}
