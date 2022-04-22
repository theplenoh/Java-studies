import java.util.Scanner;

public class Rectangle
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        double width, height, area, perimeter;

        System.out.print("Width: ");
        width = input.nextDouble();

        System.out.print("Height: ");
        height = input.nextDouble();

        area = width * height;
        perimeter = 2.0 * (width + height);

        System.out.printf("사각형의 넓이는 %.1f\n", area);
        System.out.printf("사각형의 둘레는 %.1f\n", perimeter);
    }
}
