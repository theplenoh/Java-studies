class FruitSeller
{
    int numOfApples;
    int balance;
    final int APPLE_PRICE;

    public FruitSeller(int money, int appleNum, int price)
    {
        //initialize
        balance = money;
        numOfApples = appleNum;
        APPLE_PRICE = price;
    }
    public int sellApples(int money)
    {
        int num=money/APPLE_PRICE; //get the number of apples
        numOfApples-=num;
        balance+=money;
        return num;
    }
    public void showSalesResult()
    {
        System.out.println("남은 사과: "+numOfApples);
        System.out.println("판매 수익: "+balance);
    }
}

class FruitBuyer
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
        numOfApples+=seller.sellApples(money);
        balance-=money;
    }
    public void showPurchaseResult()
    {
        System.out.println("현재 잔액: "+balance);
        System.out.println("사과 개수: "+numOfApples);
    }
}

class FruitSalesMain3
{
    public static void main(String[] args)
    {
        FruitSeller seller1 = new FruitSeller(0, 30, 1500);
        FruitSeller seller2 = new FruitSeller(0, 20, 1000);

        FruitBuyer buyer = new FruitBuyer(10000);
        buyer.buyApples(seller1, 4500);
        buyer.buyApples(seller2, 2000);

        System.out.println("과일 판매자1의 현재 상황");
        seller1.showSalesResult();

        System.out.println("과일 판매자2의 현재 상황");
        seller2.showSalesResult();

        System.out.println("과일 구매자의 현재 상황");
        buyer.showPurchaseResult();
    }
}
