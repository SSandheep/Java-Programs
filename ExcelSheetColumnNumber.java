package excelsheetcolumnnumber;
import java.util.Scanner;
public class ExcelSheetColumnNumber 
{
    public int titleToNumber(String columnTitle) 
    {  
        String Alphabet="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int colnum=0;
        int strlen=columnTitle.length();
        int i=strlen-1;
        int j=0;    
        while(i>=0)
        {  
            int  k=Alphabet.indexOf(columnTitle.charAt(i))+1;
            colnum+=k*Math.pow(26, j);
            j++;
            i--;
        }
        return colnum;
    }

    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the column title:");
        String coltitle=sc.next().toUpperCase();
        ExcelSheetColumnNumber cn=new ExcelSheetColumnNumber();
        int ColumnNumber= cn.titleToNumber(coltitle);
        System.out.println("The column number is:"+ColumnNumber);
    }
    
}
