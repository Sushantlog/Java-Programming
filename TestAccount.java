class SavingAccount
{
    static double Annuallntrest=0.04,Monthlyinterest,newMonthlyinterest;
    private double SavingsBalance;

    void setSavingsBalance(double SavingsBalance)
    {
        this.SavingsBalance=SavingsBalance;
    }
    double getSavingsBalance()
    {
        return SavingsBalance;
    }
    void CalculateMonthlyinterest()
    {
        Monthlyinterest=(SavingsBalance*Annuallntrest)/12;
        SavingsBalance=SavingsBalance+Monthlyinterest;
        System.out.println("Monthly interest is : "+Monthlyinterest);
        System.out.println("Modified Saving Balance is : "+SavingsBalance);
    }
    static void Modifiedinterest(double Annuallntrest1)
    {
        Annuallntrest=Annuallntrest1;
        System.out.println("Modifided interest is :"+Annuallntrest);
    }


}
class TestAccount
{
    public static void main(String []args)
    {
        System.out.println("For the annual interest 0.04 ");

        SavingAccount S1=new SavingAccount();

        System.out.println("------- Saver 1 --------------------");
        S1.setSavingsBalance(2000.00);
        System.out.println("the current balance of saver 1 : "+S1.getSavingsBalance());
        S1.CalculateMonthlyinterest();

        SavingAccount S2=new SavingAccount();

        System.out.println("------- Saver 2 --------------------");
        S2.setSavingsBalance(3000.00);
        System.out.println("the current balance of saver 1 : "+S2.getSavingsBalance());
        S2.CalculateMonthlyinterest();

        System.out.println("-----------------------------------");

        SavingAccount.Modifiedinterest(0.05);

        System.out.println("-------------Update for saver 1 With modified interest -----------------");
        S1.CalculateMonthlyinterest();

        System.out.println("-------------Update for saver 2 With modified interest -----------------");
        S2.CalculateMonthlyinterest();

    }
}
