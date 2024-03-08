package sortstringnumbers;

import java.util.Arrays;
import java.util.Scanner;

public class SortStringNumbers 
{
    public static void sortingArray(String s[],int size)
    {
        String temp="";
        for(int i=0;i<size-1;i++)
        {
            for(int j=i+1;j<size;j++)
            {
                if(Integer.parseInt(s[i])>Integer.parseInt(s[j]))
                {
                     temp=s[i];
                      s[i]=s[j];
                      s[j]=temp;
                }
            }
       }
     
    }
    public static void main(String[] args) 
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter size of the Array:");
       int size=sc.nextInt();
       String str[]=new String[size];
       System.out.println("Enter elements of Array:");
       for(int i=0;i<size;i++){
           str[i]=sc.next();
       }
       System.out.println("Array elements before sorting are:\n"+Arrays.toString(str));
       sortingArray(str,size);
      System.out.println("Array elements after sorting are:\n"+Arrays.toString(str));
    }
    
}
