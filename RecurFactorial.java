class RecurFactorial
{
    public static void main(String[] args)
    {
        System.out.println("fac(3): "+factorial(3));
        System.out.println("fac(12): "+factorial(12));
    }
    public static int factorial(int n)
    {
        if(n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
}
