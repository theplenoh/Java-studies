class Box
{
    public void wrapSimply()
    {
        System.out.println("Wrap simply!");
    }
    public void wrap()
    {
        wrapSimply();
    }
}

class PaperBox extends Box
{
    public void wrapWithPaper()
    {
        System.out.println("Wrap with paper!");
    }
    public void wrap()
    {
        wrapWithPaper();
    }
}

class GoldenPaperBox extends PaperBox
{
    public void wrapWithGoldenPaper()
    {
        System.out.println("Wrap with golden paper!");
    }
    public void wrap()
    {
        wrapWithGoldenPaper();
    }
}

class prob15_1
{
    public static void wrapBox(Box box)
    {
        box.wrap();
    }

    public static void main(String[] args)
    {
        Box boxA = new Box();
        PaperBox boxB = new PaperBox();
        GoldenPaperBox boxC = new GoldenPaperBox();

        wrapBox(boxA);
        wrapBox(boxB);
        wrapBox(boxC);
    }
}
