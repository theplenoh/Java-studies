import java.util.Random;

public class RollADice
{
    public static void main(String[] args)
    {
        Random randGen = new Random();

        int[] freq = new int[6];
        int newNum;

        for(int i=0; i<10000; i++)
        {
            newNum = randGen.nextInt((6 - 1) + 1) + 1;
            freq[newNum - 1]++;
        }

        System.out.printf("===========================\n");
        System.out.printf("%2s %s\n","면","빈도");
        System.out.printf("===========================\n");
        for(int i=0; i<6; i++)
        {
            System.out.printf("%3d %2d\n", i+1, freq[i]);
        }
    }
}
