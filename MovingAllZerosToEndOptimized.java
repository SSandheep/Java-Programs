package movingallzerostoend.optimized;

import java.util.Arrays;
import java.util.Scanner;

public class MovingAllZerosToEndOptimized 
{
    public static  void movingAllZerosToEnd(int arr[],int n){
        int temp;
        for(int i=0;i<n-1;i++)
        {
             if(arr[i]==0)
             {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
             }
        }             
      for(int i=0;i<n;i++)
      {
         if(arr[i]==0)
              movingAllZerosToEnd(arr,n-1);
      }
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Array:");
        int size=sc.nextInt();
        System.out.println("Enter the elements of the Array:");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
           arr[i]=sc.nextInt();
        }
        System.out.println("The elements of Array before moving all zeros to the end:\n"+Arrays.toString(arr));
        movingAllZerosToEnd(arr,size);
        System.out.println("The elements of Array after moving all zeros to the end:\n"+Arrays.toString(arr));   
  
    }
    
}
