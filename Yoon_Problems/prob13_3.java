import java.util.Scanner;

class prob13_3
{
    public static int minValue(int[] arr)
    {
        int min = arr[0];
        for(int each : arr)
            if (each < min)
                min = each;

        return min;
    }

    public static int maxValue(int[] arr)
    {
        int max = arr[0];
        for(int each : arr)
            if (each > max)
                max = each;

        return max;
    }

    public static void main(String[] args)
    {
        int[] arr = new int[5];

        Scanner sc=new Scanner(System.in);

        for(int i=0; i<arr.length; i++)
        {
            System.out.print("int: ");
            arr[i] = sc.nextInt();
        }

        System.out.println("maxVal: "+maxValue(arr));
        System.out.println("minVal: "+minValue(arr));
    }
}
