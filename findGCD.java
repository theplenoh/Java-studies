import java.util.Scanner;

public class findGCD
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int x, y, r;

        System.out.print("두 개의 정수를 입력하시오(큰수, 작은수): ");
        x = sc.nextInt();
        y = sc.nextInt();

        if(x < y)
        {
            int temp = y;
            y = x;
            x = temp;
        }

        while(y != 0)
        {
            r = x % y;
            x = y;
            y = r;
        }

        System.out.println("최대 공약수는 " + x);
    }
}
