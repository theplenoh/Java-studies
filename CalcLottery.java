public class CalcLottery
{
    public static void main(String[] args)
    {
        int max = 45;
        long product = 1;
        long fac = 1;

        for(int i=0; i<6; i++)
        {
            product *= max--;
        }
        //System.out.println(product);
        for(int i=6; i>=1; i--)
        {
            fac *= i; 
        }
        //System.out.println(fac);
        System.out.println("로또 1등 확률: 1/"+product / fac);
    }
}
