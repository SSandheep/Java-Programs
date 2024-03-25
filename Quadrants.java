package quadrants;

import java.util.Scanner;

public class Quadrants 
{
    public String coordinates(int x,int y)
    {
        if(x==0 && y==0)
            return "Lies on Origin";
        else if(x>0 && y>0)
            return "Lies on 1st quadrant";
        else if(x<0 && y>0)
            return "Lies 2nd quadrant";
        else if(x<0 && y<0)
            return "Lies on 3rd quadrant";
        else if(x>0 && y<0)
            return "Lies on 4th quadrant";
        else if(x==0 && y>0)
            return "Lies on Y-axis";
        else if(x>0 && y==0)
            return "Lies on X-axis";
        else if(x==0 && y<0)
            return "Lies on -Y axis";
        else if(x<0 && y==0)
            return "Lies on -X axis";
        else
            return "Invalid coordinates";
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        Quadrants q=new Quadrants();
        System.out.println("Enter the X coordinates:");
        int x=sc.nextInt();
        System.out.println("Enter the Y coordinates:");
        int y=sc.nextInt();
        String quadrant="The ("+x+","+y+") coordinates "+q.coordinates(x,y);
        System.out.println(quadrant);
    }
    
}
