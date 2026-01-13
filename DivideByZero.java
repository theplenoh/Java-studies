import java.util.Scanner;

class DivideByZero
{
    public static void main(String[] args)
    {
        System.out.print("두 개의 정수 입력: ");
        Scanner kbd = new Scanner(System.in);
        int numA = kbd.nextInt();
        int numB = kbd.nextInt();

        try
        {
            System.out.println("나눗셈 결과의 몫: "+(numA / numB));
            System.out.println("나눗셈 결과의 나머지: "+(numA % numB));
        }
        catch(ArithmeticException e)
        {
            System.out.println("나눗셈 불가능");
            //System.out.println(e.getMessage());
        }

        System.out.println("프로그램을 종료합니다.");
    }
}
