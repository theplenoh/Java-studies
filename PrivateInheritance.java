class Accumulator
{
    private int val;

    Accumulator(int init)
    {
        val = init;
    }

    protected void accumulate(int num)
    {
        if (num < 0)
            return;
        val += num;
    }
    protected int getAccVal()
    {
        return val;
    }
}

class SavingsAccount extends Accumulator
{
    public SavingsAccount(int initDeposit)
    {
        super(initDeposit);
    }
    public void saveMoney(int money)
    {
        accumulate(money);
    }
    public void showSavedMoney()
    {
        System.out.print("Balance: ");
        System.out.println(getAccVal());
    }
}

class PrivateInheritance
{
    public static void main(String[] args)
    {
        SavingsAccount myAccount = new SavingsAccount(1000);
        myAccount.saveMoney(1000);
        myAccount.saveMoney(1000);
        myAccount.showSavedMoney();
    }
}
