import java.util.Scanner;

class ExceptionHandleUseIf
{
    public static void main(String[] args)
    {
        Scanner kbd = new Scanner(System.in);
        int[] arr = new int[100];

        for(int i=0; i<3; i++)
        {
            System.out.print("피제수 입력: ");
            int numA = kbd.nextInt();

            System.out.print("제수 입력: ");
            int numB = kbd.nextInt();

            if (numB == 0)
            {
                System.out.println("제수는 0이 될 수 없습니다.");
                i-=1;
                continue;
            }

            System.out.print("연산결과를 저장할 배열의 인덱스 입력: ");
            int idx = kbd.nextInt();

            if (idx < 0 || idx > 99)
            {
                System.out.println("유효하지 않은 인덱스 값입니다.");
                i-=1;
                continue;
            }

            arr[idx] = numA / numB;
            System.out.println("나눗셈 결과는: "+arr[idx]);
            System.out.println("저장된 위치의 인덱스는 "+idx);
        }
    }
}
