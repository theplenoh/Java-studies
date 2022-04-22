import java.util.Scanner;

public class TheaterReservation
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int seatNum;

        // array declaration
        int[] seats = new int[10];

        // array initialization with 0's
        for(int i=0; i<10; i++)
            seats[i] = 0;

        do {
            System.out.println("========================================");
            System.out.println("   1   2   3   4   5   6   7   8   9  10");
            System.out.println("========================================");
            for(int i=0; i<10; i++)
                System.out.printf("%4d", seats[i]);
            System.out.println("");

            System.out.print("원하시는 좌석번호를 입력하세요(종료는 -1): ");
            seatNum = sc.nextInt();

            if(seatNum < -1 || seatNum > 10)
                System.out.println("좌석번호가 유효 범위를 벗어났습니다.");

            if(seatNum >= 1 && seatNum <= 10)
            {
                if(seats[seatNum-1] == 0)
                {
                    seats[seatNum-1] = 1;
                    System.out.println("예약되었습니다.");
                }
                else
                {
                    System.out.println("이미 예약된 자리입니다.");
                }
            }
            System.out.println("");
        } while(seatNum != -1);
    }
}
