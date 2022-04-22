import java.util.Random;

public class ArrayTest1
{
    public static void main(String[] args)
    {
        Random numGen = new Random();
        int[] s = new int[10];

        for(int i=0; i<s.length; i++)
        {
            s[i] = numGen.nextInt(10);
        }

        for(int i=0; i<s.length; i++)
        {
            System.out.print(s[i]+" ");
        }
        System.out.println();
    }
}
