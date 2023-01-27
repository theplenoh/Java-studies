package orange.buyer;

import orange.seller.FruitSeller;
public class FruitBuyer
{
    int numOfApples;
    int balance;

    public FruitBuyer(int money)
    {
        balance = money;
        numOfApples = 0;
    }
    public void buyApples(FruitSeller seller, int money)
    {
        numOfApples += seller.sellApples(money);
        balance -= money;
    }
    public void showPurchaseResult()
    {
        System.out.println("현재 잔액: " + balance);
        System.out.println("사과 갯수: " + numOfApples);
    }
}
