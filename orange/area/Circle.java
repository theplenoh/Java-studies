package orange.area; // 패키지 선언

public class Circle
{
    double rad;
    final double PI;

    public Circle(double r)
    {
        rad = r;
        PI = 3.141592;
    }
    public double getArea()
    {
        return (rad*rad)*PI;
    }
}
