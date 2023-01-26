class FruitSeller
{
    int numOfApples = 20;
    int myMoney = 0;
    final int APPLE_PRICE = 1000;

    public int sellApple(int money)
    {
        int num = money/APPLE_PRICE;
        numOfApples -= num;
        myMoney += money;
        return num;
    }
    public void showSalesResult()
    {
        System.out.println("남은 사과: " + numOfApples);
        System.out.println("판매 수익: " + myMoney);
    }
}

class FruitBuyer
{
    int numOfApples = 0;
    int myMoney = 5000;

    public void buyApple(FruitSeller seller, int money)
    {
        numOfApples+=seller.sellApple(money);
        myMoney -= money;
    }
    public void showPurchaseResult()
    {
        System.out.println("현재 잔액: " + myMoney);
        System.out.println("사과 갯수: " + numOfApples);
    }
}

class FruitSalesMain1
{
    public static void main(String[] args)
    {
        FruitSeller seller = new FruitSeller();
        FruitBuyer buyer = new FruitBuyer();

        buyer.buyApple(seller, 2000); // Buyer buysApple from seller with 2000

        System.out.println("# 과일 판매자 시뮬레이션 1");

        System.out.println("## 과일 판매자의 현재 상황");
        seller.showSalesResult();

        System.out.println("## 과일 구매자의 현재 상황");
        buyer.showPurchaseResult();
    }
}
