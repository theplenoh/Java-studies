import java.util.Scanner;
import java.util.Random;

public class RandomNum
{
    public static void main(String[] args)
    {
        Random generator = new Random();
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int n;

        System.out.print("n: ");
        n = sc.nextInt();

        for(int i=0; i<n; i++)
        {
            sum += generator.nextInt(100);
        }
        System.out.printf("Sum: %d\n", sum);
    }
}
