class prob5_7_1
{
    public static void main(String[] args)
    {
        for(int i=2, j; i<=9; i+=2)
        {
            for(j=1; true; j++)
            {
                System.out.println(i+" * "+j+" = "+i*j);
                if(i == j)
                    break;
            }
        }
    }
}
