class Point
{
    private int xPos, yPos;

    public Point(int x, int y)
    {
        xPos = x;
        yPos = y;
    }
    public int getXPos()
    {
        return xPos;
    }
    public int getYPos()
    {
        return yPos;
    }
    public void showPointInfo()
    {
        System.out.println("["+xPos+", "+yPos+"]");
    }
}

class Circle
{
    int radius;
    Point origin;

    public Circle(Point pt, int rad)
    {
        origin = pt;
        radius = rad;
    }
    public void showCircleInfo()
    {
        System.out.printf("원점: (%d, %d)\n", origin.getXPos(), origin.getYPos());
        System.out.printf("반지름: %d\n", radius);
    }
}

class Ring
{
    private Circle outerC;
    private Circle innerC;

    public Ring(int innerC_x, int innerC_y, int innerRad, int outerC_x, int outerC_y, int outerRad)
    {
        innerC = new Circle(new Point(innerC_x, innerC_y), innerRad);
        outerC = new Circle(new Point(outerC_x, outerC_y), outerRad);
    }
    public void showRingInfo()
    {
        System.out.println("Inner Circle Info: ");
        System.out.println("radius: "+innerC.radius);
        System.out.println("["+innerC.origin.getXPos()+", "+innerC.origin.getYPos()+"]");
        System.out.println("Outer Circle Info: ");
        System.out.println("radius: "+outerC.radius);
        System.out.println("["+outerC.origin.getXPos()+", "+outerC.origin.getYPos()+"]");
    }
}

class RingTest
{
    public static void main(String[] args)
    {
        Ring ring = new Ring(1, 1, 4, 2, 2, 9);

        ring.showRingInfo();
    }
}
