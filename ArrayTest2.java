import java.util.Scanner;

public class ArrayTest2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        final int NUM_STUDENTS = 5;

        int[] grades = new int[NUM_STUDENTS];
        int sum = 0;

        for(int i=0; i<NUM_STUDENTS; i++)
        {
            System.out.print("성적을 입력하시오: ");
            grades[i] = sc.nextInt();
            sum += grades[i];
        }
        System.out.println("합계: "+sum);
        System.out.println("평균: "+(double)sum/NUM_STUDENTS);
    }
}
