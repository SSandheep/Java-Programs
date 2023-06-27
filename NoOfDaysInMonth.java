import java.util.Scanner;
public class NoOfDaysInMonth
{
    public static void main(String[] args) 
    {
        int m,y,days=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Month number:");
        m=sc.nextInt();
        while(m>=1&&m<=12)
        {
            if(m==1||m==3||m==5||m==7||m==8||m==10||m==12)
            {
                days=31;
            }
            else if (m==4||m==6||m==9||m==11)
            {
                days=30;
            }
            else if(m==2)
            {
               System.out.println("Enter the year:");
               y=sc.nextInt();
               if(y%400==0||y%4==0&&y%100!=0)
               {
                   days=29;
               }
               else
               {
                   days=28;
               }
             
            }
            System.out.println("No. of Days in month "+m+" is "+days); 
            break;
        }

    }
    
}
