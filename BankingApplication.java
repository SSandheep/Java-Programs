package bankingapplication;
import java.util.Scanner;
public class BankingApplication 
{ 
    String CustomerName;
    String CustomerId;
    int amount;
    int balance;
    int previoustransaction;   

    public BankingApplication(String CustomerName,String CustomerId)
    {
        this.CustomerName=CustomerName;
        this.CustomerId=CustomerId;
        balance=0;
        System.out.println("The Customer Name is:"+CustomerName);
        System.out.println("The Customer ID is:"+CustomerId);
     
    }
    void deposit(int amt)
    {
        if(amount!=0)
        {
        previoustransaction=amount;
        System.out.println("The balance amount is:"+balance);
        }
    }
    void withdraw(int amt)
    {
        if(amount!=0 && balance!=0)
        {
            balance=balance-amount;
            previoustransaction=-amount;
            System.out.println("The balance amount is:"+balance);
        }
    }
    void displayBalance()
    {
        System.out.println("The balance amount is:"+balance);
    }
    void previousTransaction()
    {
        if(previoustransaction>0)
            System.out.println("The amount is deposited and it is"+previoustransaction);
        else if(previoustransaction<0)
            System.out.println("The amount is withdrawn and it is:"+Math.abs(previoustransaction));
        else
            System.out.println("The balance amount is:"+balance);
    }
    void showMenu()
    {
        int ch=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("1.DEPOSIT");
        System.out.println("2.WITHDRAW");
        System.out.println("3.DISPLAY BALANCE");
        System.out.println("4.PREVIOUS TRANSACTION");
        
        do
        {
             System.out.println("Previous transaction was made before how many months:");
            int months=sc.nextInt();
           System.out.println("Enter your choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:
                {
                    System.out.println("Enter amount to deposit:");
                    amount=sc.nextInt();
                    deposit(amount);
                    break;
                }
                
               case 2:
               {
                    System.out.println("Enter amount to withdraw:");
                    amount=sc.nextInt();
                    withdraw(amount);
                    break;
               }
               
               case 3:
               {
                    displayBalance();
                    break;
               }
               case 4:
               {
                   previousTransaction();
                   break;
               }
               default:
               {
                   System.out.println("INVALID OPTION");
                   break;
               }
                             
            }
            
        }
        while(ch!=5);
    }
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Customer Name:");
        String cname=sc.next();
        
        BankingApplication b=new BankingApplication(cname,"30");
        b.showMenu();
        

    }
    
}

