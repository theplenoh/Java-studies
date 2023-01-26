class FruitSeller
{
    int numOfApples;
    int myMoney;
    int APPLE_PRICE;

    public int sellApple(int money)
    {
        int num = money / APPLE_PRICE;
        numOfApples -= num;
        myMoney += money;
        return num;
    }
    public void showSalesResult()
    {
        System.out.println("남은 사과: " + numOfApples);
        System.out.println("판매 수익: " + myMoney);
    }
    public void initMembers(int money, int appleNum, int price)
    {
        myMoney = money;
        numOfApples = appleNum;
        APPLE_PRICE = price;
    }
}

class FruitBuyer
{
    int myMoney = 10000;
    int numOfApples = 0;

    public void buyApple(FruitSeller seller, int money)
    {
        numOfApples+=seller.sellApple(money);
        myMoney-=money;
    }
    public void showPurchaseResult()
    {
        System.out.println("현재 잔액: " + myMoney);
        System.out.println("사과 갯수: " + numOfApples);
    }
}

class FruitSalesMain2
{
    public static void main(String[] args)
    {
        FruitSeller seller1 = new FruitSeller();
        seller1.initMembers(0, 30, 1500);

        FruitSeller seller2 = new FruitSeller();
        seller2.initMembers(0, 20, 1000);

        FruitBuyer buyer = new FruitBuyer();
        buyer.buyApple(seller1, 4500);
        buyer.buyApple(seller2, 2000);

        System.out.println("## 과일 판매자1의 현재 상황");
        seller1.showSalesResult();

        System.out.println("## 과일 판매자2의 현재 상황");
        seller2.showSalesResult();

        System.out.println("## 과일 구매자의 현재 상황");
        buyer.showPurchaseResult();
    }
}
