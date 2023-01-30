class Rectangle
{
    private int ulx, uly;
    private int lrx, lry;

    public Rectangle(final int ulX, final int ulY, final int lrX, final int lrY)
    {
        if(0 <= ulX && ulX < 100)
            ulx = ulX;
        else
        {
            System.out.println("ulX: out of range");
        }

        if(0 <= ulY && ulY < 100)
            uly = ulY;
        else
        {
            System.out.println("ulY: out of range");
        }

        if( (0 <= lrX && lrX < 100) && (lrX > ulx) )
            lrx = lrX;
        else
        {
            System.out.println("lrX: out of range");
        }

        if( (0 <= lrY && lrY < 100) && (lrY > uly) )
            lry = lrY;
        else
        {
            System.out.println("lrY: out of range");
        }
    }

    public void setUpperLeftXY(final int ulX, final int ulY)
    {
        if(0 <= ulX && ulX < 100)
            ulx = ulX;

        if(0 <= ulY && ulY < 100)
            uly = ulY;
    }
    public void setLowerRightXY(final int lrX, final int lrY)
    {
        if( (0 <= lrX && lrX < 100) && (lrX > ulx) )
            lrx = lrX;

        if( (0 <= lrY && lrY < 100) && (lrY > uly) )
            lry = lrY;
    }

    public void showArea()
    {
        int xLen = lrx - ulx;
        int yLen = lry - uly;
        System.out.println("Area: "+(xLen * yLen));
    }
}

class RectangleTest
{
    public static void main(String[] args)
    {
        Rectangle rec = new Rectangle(10, 10, 22, 22);

        rec.setUpperLeftXY(0, 0);
        rec.setLowerRightXY(10, 10);

        rec.showArea();
    }
}
