/*
For hiring a car, a travel agency charges R1 rupees per hour for the first N hours and then R2 rupees per hour. Given the total time of travel in
minutes in X.
The task is to find the total travelling cost in rupees.
Note : While converting minutes into hours, ceiling value should be considered as the total number of hours.
For example :
If the total travelling time is 90 minutes, i.e. 1.5 hours, it must be considered as 2 hours.
Example : Input :
20 -- r1
4 -- n
40 -- r2
300 -- x
Output : 120
Explanation :
Total travelling hours = 300 / 60 = 5 hours
Rupees 20 / hours for first 4 hours = 20 * 4 = 80 rupees Rupees 40 / hours in 5th hour = 40 * 1 = 40 rupees
Hence, the total travelling cost = 80 + 40 = 120 rupees
*/
package totaltravellingcost;
import java.util.Scanner;
public class TotalTravellingCost 
{
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Rupees for 1st N hours:");
       int r1=sc.nextInt();
       System.out.println("Enter the 1st N hours:");
       int n1=sc.nextInt();
       System.out.println("Enter the Rupess for Remaining hours:");
       int r2=sc.nextInt();
       System.out.println("Enter the total time in minutes:");
       double mins=sc.nextInt();
       double hrs=Math.ceil(mins/60);
       int n2=(int) (hrs-n1);
       int total_cost=(r1*n1)+(r2*n2);
        System.out.println("The Total travelling cost is:"+total_cost);
       
    }
    
}
