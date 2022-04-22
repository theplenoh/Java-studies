class prob5_4_2
{
    public static void main(String[] args)
    {
        int i=1;

        while(i<=100)
        {
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        i--;
        do
        {
            System.out.print(i+" ");
            i--;
        }
        while(i>0);
        System.out.println();
    }
}
