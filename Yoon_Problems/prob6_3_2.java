class prob6_3_2
{
    public static void main(String[] args)
    {
        dec2bin(29);
        System.out.println("");
    }

    public static void dec2bin(int num)
    {
        if(num == 0)
            return;
        dec2bin(num / 2);
        System.out.print(num % 2);
    }
}
