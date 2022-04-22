import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args)
    {
        final double PI = 3.1415;

        Scanner input = new Scanner(System.in);
        double radius, area;

        System.out.print("radius: ");
        radius = input.nextDouble();

        area = PI * radius * radius;

        System.out.printf("Area of the circle: %f\n", area);
    }
}
