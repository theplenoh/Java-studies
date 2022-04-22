class prob6_1_1
{
    public static void main(String[] args)
    {
        calcResult(12, 3);
    }

    public static void calcResult(int a, int b)
    {
        System.out.println("= Calculation Result =======");
        System.out.println("sum: "+((int)a+(int)b));
        System.out.println("diff: "+((int)a-(int)b));
        System.out.println("product: "+((int)a*(int)b));
        System.out.println("quotient, remainder: "+((int)a/(int)b)+", "+((int)a%(int)b));
    }
}
