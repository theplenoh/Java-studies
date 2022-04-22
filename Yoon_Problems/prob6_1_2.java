class prob6_1_2
{
    public static void main(String[] args)
    {
        absValue(5, 3);
        absValue(3, 5);
    }
    public static void absValue(int a, int b)
    {
        int temp;

        if(b > a)
        {
            temp = a;
            a = b;
            b = temp;
        }

        System.out.println("absValue: "+((int)a-(int)b));
    }
}
