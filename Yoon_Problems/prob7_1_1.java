class Triangle
{
    double base;
    double height;

    public Triangle(double b, double h)
    {
        base = b;
        height = h;
    }
    public void setBase(double b)
    {
        base = b;
    }
    public void setHeight(double h)
    {
        height = h;
    }
    public double getArea()
    {
        return base * height * 0.5;
    }
}

class prob7_1_1
{
    public static void main(String[] args)
    {
        Triangle tri1 = new Triangle(10.2, 17.3);
    }
}
