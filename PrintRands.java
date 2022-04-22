import java.util.Random;

public class PrintRands
{
    public static void main(String[] args)
    {
        Random numGen = new Random();

        for(int i=0; i<50; i++)
        {
            System.out.println(numGen.nextInt(5));
        }
    }
}
