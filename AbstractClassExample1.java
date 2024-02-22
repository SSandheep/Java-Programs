package abstractclassexample1;
abstract class GeneralBank 
{
    abstract void getSavingsInterestRate();
    abstract void getFixedDepositAccountRate();
}
class ICSIBank extends GeneralBank
{

    @Override
    void getSavingsInterestRate() {
     int SavingsInterestRate=4;
     System.out.println("The savings Interest rate of ICSI Bank is:"+SavingsInterestRate+"%");
 
    }

    @Override
    void getFixedDepositAccountRate() {
        double  FixedDepositAccountRate=8.5;
         System.out.println("The Fixed Deposit Account rate of ICSI Bank is:"+FixedDepositAccountRate+"%");
    }
}
    class KOTMBank extends GeneralBank
    {

        @Override
        void getSavingsInterestRate() {
            int SavingsInterestRate=6;
            System.out.println("The savings Interest rate of ICSI Bank is:"+SavingsInterestRate+"%");
        }

        @Override
        void getFixedDepositAccountRate() {
         int FixedDepositAccountRate=9;
         System.out.println("The Fixed Deposit Account rate of KOTM Bank is:"+FixedDepositAccountRate+"%");

        }
        
    }
public class AbstractClassExample1 
{
    public static void main(String[] args) 
    {
        ICSIBank i=new ICSIBank();
        i.getSavingsInterestRate();
        i.getFixedDepositAccountRate();
        KOTMBank k=new KOTMBank();
        k.getSavingsInterestRate();
        k.getFixedDepositAccountRate();
    }
    
}
