class EnhancedFor
{
    public static void main(String[] args)
    {
        int [] arr = {1, 2, 3, 4, 5};

        int sum = 0;
        for(int each : arr)
            sum+=each;

        System.out.println("배열 요소의 합: "+sum);

        for(int each : arr)
        {
            each++;
            System.out.print(each+" ");
        }

        System.out.println("");
        for(int each : arr)
            System.out.print(each+" ");
        System.out.println("");
    }
}
