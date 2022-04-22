import java.util.Scanner;

public class VariableInArrSZ
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int NUM_STUDENTS;
        System.out.print("학생 수: ");
        NUM_STUDENTS = sc.nextInt();

        int[] scores = new int[NUM_STUDENTS];
        int sum = 0;

        for(int i=0; i<scores.length; i++)
        {
            System.out.print("학생 "+(i+1)+"의 성적: ");
            scores[i] = sc.nextInt();
            sum += scores[i];
        }

        System.out.println("평균: "+(double)sum/NUM_STUDENTS);
    }
}
