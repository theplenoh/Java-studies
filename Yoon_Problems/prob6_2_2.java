class prob6_2_2
{
    public static void main(String[] args)
    {
        for(int i=1; i<=100; i++)
        {
            if(isPrime(i))
                System.out.print(i+" ");
        }
        System.out.println("");
    }

    public static boolean isPrime(int num)
    {
        int cnt=0;
        for(int i=1; i<=num; i++)
        {
            if(num%i==0)
                cnt++;
            if(cnt>2)
                break;
        }

        if(cnt==2)
            return true;
        else
            return false;
    }
}
