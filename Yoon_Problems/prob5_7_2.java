class prob5_7_2
{
/*
    ((A*10 + B)+(B*10 + A) == 99)
*/
    public static void main(String[] args)
    {
        for(int i=0, j; i<=9; i++)
        {
            for(j=0; j<=9; j++)
            {
                if((i*10 + j)+(j*10 + i) == 99)
                    System.out.println(((i*10)+j) + " + " + ((j*10)+i) + " = 99");
            }
        }
    }
}
