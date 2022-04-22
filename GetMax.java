public class GetMax
{
    public static void main(String[] args)
    {
        int[] prices = new int[] {90, 80, 20, 60, 70};
        int max = prices[0];

        for(int i=0; i<prices.length; i++)
        {
            if(prices[i] > max)
                max = prices[i];
        }
        System.out.println("Maximum: "+max);
    }
}
