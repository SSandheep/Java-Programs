/*
'Equi-Arrays are arrays of equal number of elements and every element in arr1 
has an another element in arr2 that are made of same digits. 
Write a program to check if two arrays are equi-arrays, print all the pairs.
If no pairs found, print "No Pairs Found". 
Sample : {23, 561, 902, 189} {209, 165, 32, 981} 
Are equi-arrays, 
23 matches with 32 
561 matches with 165 
902 matches with 209 
189 matches with 981 .
Output : 0,2  1,1  2,0 3,3
*/
package equiarray;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class EquiArray 
{
    public static boolean isAnagram(int num1,int num2)
    { 
        String s1=String.valueOf(num1);
        String s2=String.valueOf(num2);
        Character c1[]=new Character[s1.length()];
        Character c2[]=new Character[s2.length()];
        for(int i=0;i<c1.length;i++)
        {
            c1[i]=s1.charAt(i);
        }
        if(s1.length()!=s2.length())
            return false;
        else
        {
            for(int i=0;i<c1.length;i++)
            {
                c1[i]=s1.charAt(i);
                c2[i]=s2.charAt(i);
            }      
        }
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1, c2))
            return true;
        else
          return false;
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of 1st array:");
        int n1=sc .nextInt();
        System.out.println("Enter the size of 2nd array:");
        int n2=sc.nextInt();
        int arr1[]=new int [n1];
        int arr2[]=new int [n2];
        HashMap<Integer,Integer> hm1=new HashMap<>();
        System.out.println("Enter elements of First Array:");
        for(int i=0;i<n1;i++)
        {
           arr1[i]=sc.nextInt();
        }
        System.out.println("Enter elements of Second Array:");
        for(int i=0;i<n2;i++)
        {
           arr2[i]=sc.nextInt();
        }
        System.out.println("The elements of First Array are:"+Arrays.toString(arr1));
        System.out.println("The elements of Second Array are:"+Arrays.toString(arr2));
        if(n1!=n2)
            System.out.println("Not an Equi-Array"); 
        if(n1==n2)
        {
           
            for(int i=0;i<n1;i++)
            {
                for(int j=0;j<n2;j++)
                {
                    if(isAnagram(arr1[i],arr2[j]))
                    {
                      hm1.put(i,j);
                    }
                    else
                        hm1.put(i,null);
                }
            }
        }
       System.out.println(hm1);
       System.out.println("The pairs are:");
       for(Map.Entry<Integer,Integer>e:hm1.entrySet())
       {
           if(e.getValue()==null)
           {
               System.out.println("Not an Equi-Array");
               System.out.println("No such pair");
               break;
           }
          else
            System.out.print(e.getKey()+","+e.getValue()+" ");
       }
    }
    
}
