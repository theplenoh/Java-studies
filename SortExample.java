import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class SortExample
{
    public static void main(String[] args)
    {
        Random randGen = new Random();
        Scanner sc = new Scanner(System.in);

        final int ARR_SZ = 10;
        int[] myArr = new int[ARR_SZ];

        for(int i = 0; i < myArr.length; i++)
        {
            /*
            System.out.print("myArr[i]: ");
            myArr[i] = sc.nextInt();
            */
            myArr[i] = randGen.nextInt(100)+1;
        }

        // Before sorting
        for(int item : myArr)
            System.out.printf("%d ", item);
        System.out.println("");

        Arrays.sort(myArr);

        // After sorting
        for(int item : myArr)
            System.out.printf("%d ", item);
        System.out.println("");
    }
}
