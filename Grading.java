import java.util.Scanner;

public class Grading
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int grade;

        System.out.print("점수: ");
        grade = input.nextInt();

        if (grade > 100 || grade < 0)
            System.out.println("Out of range: 100보다 크거나 0보다 작습니다.");
        else if (grade >= 90)
            System.out.println("A");
        else if (grade >= 80)
            System.out.println("B");
        else if (grade >= 70)
            System.out.println("C");
        else if (grade >= 60)
            System.out.println("D");
        else
            System.out.println("F");
    }
}
