class prob5_4_1
{
    public static void main(String[] args)
    {
        int sum = 0;

        int rangeA = 1;
        int rangeB = 99;

        int i = rangeA;
        while(i<=rangeB)
        {
            sum = sum + i;
            i++;
        }

        System.out.println("sum: "+sum);
    }
}
