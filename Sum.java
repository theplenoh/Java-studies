import java.util.Scanner;

public class Sum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.print("rangeA: ");
        int rangeA = sc.nextInt();
        System.out.print("rangeB: ");
        int rangeB = sc.nextInt();

        for(int i=rangeA; i<=rangeB; i++)
        {
            sum = sum + i;
        }

        System.out.printf("sum: %d\n", sum);
    }
}
