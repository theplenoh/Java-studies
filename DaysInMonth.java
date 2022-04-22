import java.util.Scanner;

public class DaysInMonth
{
    public static void main(String[] args)
    {
        int month;
        int days = 0;

        System.out.print("일수를 알고 싶은 월을 입력하십시오: ");
        Scanner input = new Scanner(System.in);

        month = input.nextInt();

        switch (month)
        {
            case 4: case 6: case 9: case 11:
                days = 30;
                break;
            case 2:
                days = 28;
                break;
            default:
                days = 31;
                break;
        }

        System.out.println("해당 달의 일수는: " + days + "일");
    }
}
