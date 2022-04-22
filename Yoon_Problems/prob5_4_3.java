class prob5_4_3
{
    public static void main(String[] args)
    {
        int i;
        int sum = 0;
        int rangeA = 1000;
        int rangeB = 1;

        i = rangeA;
        while(i>rangeB)
        {
            if((i % 2 == 0) && (i % 7 == 0))
            {
                System.out.print(i+" ");
                sum += i;
            }
            i--;
        }
        System.out.println("");
        System.out.println(sum);
    }
}
