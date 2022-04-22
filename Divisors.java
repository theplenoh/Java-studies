import java.util.Scanner;

public class Divisors
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("n: ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            if(n % i == 0)
                System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
