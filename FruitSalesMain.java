import orange.seller.FruitSeller;
import orange.buyer.FruitBuyer;

class FruitSalesMain
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
