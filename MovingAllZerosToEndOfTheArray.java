package movingallzerostoendofthearray;
import java.util.Arrays;
import java.util.Scanner;
public class MovingAllZerosToEndOfTheArray 
{
    public static  int[]movingAllZerosToEnd(int arr[]){
        int temp;
        for(int i=0;i<arr.length-1;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==0)
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        return arr;
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
        int res[]=movingAllZerosToEnd(arr);
        System.out.println("The elements of Array after moving all zeros to the end:\n"+Arrays.toString(res));
    }
      
      
}
