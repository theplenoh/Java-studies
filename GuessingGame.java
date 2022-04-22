import java.util.Random;
import java.util.Scanner;

public class GuessingGame
{
    public static void main(String[] args)
    {
        Random numGen = new Random();
        Scanner sc = new Scanner(System.in);

        int target = numGen.nextInt(100);
        int guess;
        int attempt = 0;

        do
        {
            System.out.print("정답을 추측하여 보시오: ");
            guess = sc.nextInt();
            attempt++;

            if(guess < target)
            {
                System.out.println("제시한 정수가 낮습니다.");
            }
            else if(guess > target)
            {
                System.out.println("제시한 정수가 높습니다.");
            }
        } while(guess != target);

        System.out.print("축하합니다. 시도횟수: "+attempt+"\n");
    }
}
