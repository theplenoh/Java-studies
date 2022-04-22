import java.util.Scanner;
import java.util.Random;

public class NestedLoop
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random randGen = new Random();

        //System.out.print("n: ");
        int n = randGen.nextInt(10); 

        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
