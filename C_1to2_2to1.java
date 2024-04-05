/*
i/p->1
o/p->2

i/p->2
o/p->1

Try all possible ways
*/
package pkg1to2_2to1;
import java.util.Scanner;
public class C_1to2_2to1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        
        int output = 0;
        if(input==1)
            output=2;
        if(input==2)
            output=1;
        //or
        System.out.println(output);
        //or
        System.out.println(3^input);
        //or
        System.out.println(3-input);
        //or
        System.out.println(2/input);
        //or
        System.out.println((input%2)+1);
    }
    
}
