import java.util.Scanner;
class BaseAcc
{
    String CustomerName;
    int AccountNumber;
    String AccountType;
    BaseAcc(String CustomerName,int AccountNumber,String AccountType)
    {
        this.CustomerName=CustomerName;
        this.AccountNumber=AccountNumber;
        this.AccountType=AccountType;     
    }
    void Content()
    {
        System.out.println("Customer name is:"+CustomerName);
        System.out.println("Account Number is:"+AccountNumber);
        System.out.println("Account type is:"+AccountType);
    }
}
class CurrentAcc extends BaseAcc
{
    double deposit;
    double withdraw;
    double balance;
    CurrentAcc(String CustomerName,int AccountNumber,String AccountType,double balance,double deposit,double withdraw)
    {
        super(CustomerName,AccountNumber,AccountType);
        this.balance=balance;
        this.deposit=deposit;
        this.withdraw=withdraw;
        
    }
    void deposit()
    {
        System.out.println("Enter the amount to be deposited in Current Account:");
        Scanner sc=new Scanner(System.in);
        deposit=sc.nextDouble();
        balance+=deposit;
    }
    void withdraw()
    {
        System.out.println("Enter the amount to be withdrawn from Current Account:");
        Scanner sc=new Scanner(System.in);
        withdraw=sc.nextDouble();
        balance-=withdraw;
    }
    void displaybalance()
    {
        System.out.println("Balance amount in Current Account "+(CustomerName)+" is:"+balance);
    }
    
}
class SavingsAcc extends BaseAcc
{
    double deposit;
    double balance;
    SavingsAcc(String CustomerName,int AccountNumber,String AccountType,double balance,double deposit)
    {
        super(CustomerName,AccountNumber,AccountType);
        this.deposit=deposit;
        this.balance=balance;
    }
    void deposit()
    {
        System.out.println("Enter the amount to be deposited in Savings Account:");
        Scanner sc=new Scanner(System.in);
        deposit=sc.nextDouble();
        balance+=deposit;
    }
    void displaybalance()
    {
        
        System.out.println("Balance amount in Savings Account "+(CustomerName)+" is:"+balance);
    }
            
}
public class NewMain
{
    public static void main(String[] args)
    {
        CurrentAcc C=new CurrentAcc("Aarthy",123,"Current Account",25000,0,0);
        C.Content();
        C.deposit();
        C.withdraw();
        C.displaybalance();
        SavingsAcc S=new SavingsAcc("RT",345,"Savings Account",22000,0);
        S.Content();
        S.deposit();
        S.displaybalance();
        
    }
    
}
