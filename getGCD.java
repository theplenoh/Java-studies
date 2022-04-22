import java.util.Scanner;

public class getGCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y, r;

        System.out.print("두 개의 정수를 입력하시오: ");
        x = sc.nextInt();
        y = sc.nextInt();

        if(x < y)
        {
            int tmp = y;
            y = x;
            x = tmp;
        }

        while(y!=0)
        {
            r = x % y;
            x = y;
            y = r;
        }

        System.out.println("GCD: "+x);
    }
}
