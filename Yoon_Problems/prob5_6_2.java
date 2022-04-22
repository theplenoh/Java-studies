class prob5_6_2
{
    public static void main(String[] args)
    {
        int init = 1;
        int sum = 0

        int i=0;
        while(true)
        {
            if((i%2)==1 || (i%3)==0)
            {
                sum += i;
            }
            if(sum>=1000)
                break;
            i++;
        }

        System.out.println("i: "+i);
        System.out.println("sum: "+sum);
    }
}
