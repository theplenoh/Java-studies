package orange.seller;

public class FruitSeller
{
    int numOfApples;
    int balance;
    final int APPLE_PRICE;

    public FruitSeller(int money, int appleNum, int price)
    {
        balance = money;
        numOfApples = appleNum;
        APPLE_PRICE = price;
    }
    public int sellApples(int money)
    {
        int num = money/APPLE_PRICE;
        numOfApples -= num;
        balance += money;
        return num;
    }
    public void showSalesResult()
    {
        System.out.println("남은 사과: "+numOfApples);
        System.out.println("판매 수익: "+balance);
    }
}
