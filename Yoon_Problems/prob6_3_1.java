class prob6_3_1
{
    public static void main(String[] args)
    {
        System.out.println("expBin(4): "+expBin(4));
        System.out.println("expBin(10): "+expBin(10));
    }

    public static int expBin(int n)
    {
        if(n == 0)
            return 1;
        else
            return 2 * expBin(n - 1);
    }
}
