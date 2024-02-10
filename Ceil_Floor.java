package ceil_floor;

import java.util.Scanner;

public class Ceil_Floor 
{
    private static int ceilnum(float num)
    {
        return (int) (num+1);
    } 
    private static int floornum(float num)
    {
        return (int)num;
    }     
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        float n=sc.nextFloat();
        int ceilnumber=ceilnum(n);
        int floornumber=floornum(n);
        System.out.println("The ceil value is"+ceilnumber);
        System.out.println("The floor value is"+floornumber);
     
    }
    
}
