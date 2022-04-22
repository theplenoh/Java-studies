class prob6_2_1
{
    public static void main(String[] args)
    {
        double radius = 3.0;

        System.out.println("area: "+getCircleArea(radius));
        System.out.println("perimeter: "+getCirclePerimeter(radius));
    }

    public static double getCircleArea(double r)
    {
        return r*r*3.1415;
    }
    public static double getCirclePerimeter(double r)
    {
        return 2*3.1415*r;
    }
}
