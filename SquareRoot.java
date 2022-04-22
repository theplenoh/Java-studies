public class SquareRoot
{
    public static void main(String[] args)
    {
        // y = a*x*x + b*x + c
        double a, b, c;

        a = 1.0;
        b = -3.0;
        c = 2.0;

        double x1 = (-b + Math.sqrt(b*b - 4*a*c)) / (2.0*a);
        double x2 = (-b - Math.sqrt(b*b - 4*a*c)) / (2.0*a);

        System.out.println("근은 " + x1);
        System.out.println("근은 " + x2);
    }
}
