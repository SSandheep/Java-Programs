package integertoroman;
import java.util.HashMap;
import java.util.Scanner;

public class IntegerToRoman 
{
    public static String integerToRomanNumerals(int num)
    {
      String res="";
        HashMap<Integer,String>hm=new HashMap<>();
        hm.put(1,"I");
        hm.put(5,"V");
        hm.put(10,"X");
        hm.put(50, "L");
        hm.put(100,"C");
        hm.put(500,"D");
        hm.put(1000,"M");
                      
        if(hm.containsKey(num))
            res=hm.get(num);
        
        if(num>1 && num<4)
               res=hm.get(1)+integerToRomanNumerals(num-1);
        
        if(num==4)
               res=hm.get(1)+hm.get(5);
        
        if(num>5 && num<9)
        {  
            num=num-5;
            res=hm.get(5)+integerToRomanNumerals(num);
        }
        
        if(num==9)
            res=hm.get(1)+hm.get(10);
        
        if(num>10 && num<40)
        {
            num=num-10;
            res=hm.get(10)+integerToRomanNumerals(num);
        }
        
        if(num==40)
            res=hm.get(10)+hm.get(50);
        
        if(num>40 && num<50)
        {
            num=num-40;
            res=integerToRomanNumerals(40)+integerToRomanNumerals(num);
        }
        
        if(num>50 && num<90)
        {
            num=num-50;
            res=hm.get(50)+integerToRomanNumerals(num);
        }
         
        if(num==90)
            res=hm.get(10)+hm.get(100);
        
        if(num>90 && num<100)
        {
            num=num-90;
            res=integerToRomanNumerals(90)+integerToRomanNumerals(num);
        }
        
       if(num>100 && num< 400)
       {
           num=num-100;
           res=hm.get(100)+integerToRomanNumerals(num);
       }
       
       if(num==400)
           res=hm.get(100)+hm.get(500);
          
       if(num>400 && num<500)
       {
           num=num-400;
           res=integerToRomanNumerals(400)+integerToRomanNumerals(num);
       }
       
       if(num>500 && num<900)
       {
           num=num-500;
           res=hm.get(500)+integerToRomanNumerals(num);
       }
       
       if(num==900)
           res=hm.get(100)+hm.get(1000);
       
       if(num>900 && num<1000)
       {
           num=num-900;
           res=integerToRomanNumerals(900)+integerToRomanNumerals(num);
       }
       
       if(num>1000 && num<=3999)
       {
           num=num-1000;
           res=hm.get(1000)+integerToRomanNumerals(num);
       }
        return res;
    }

    public static void main(String[] args) 
    {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the Integer number:");
            int n=sc.nextInt();  
            System.out.println("The Roman Numeral is:\n"+ integerToRomanNumerals(n));
    }


}
    
 //Answer from Leetcode-3ms
    
 /*
    public static String integerToRomanNumerals(int num) {
        int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]) {
                num -= nums[i];
                sb.append(strs[i]);
            }
        }
        return sb.toString();
    }
*/