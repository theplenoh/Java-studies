import java.util.Scanner;

public class GetSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int sum=0;
        int i=1;

        System.out.print("n: ");
        int n = sc.nextInt();

        while(i<=n)
        {
            sum = sum + i;
            i++;
        }

        System.out.println("합계: "+sum);
    }
}
