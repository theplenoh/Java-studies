class Box
{
    public void wrapSimply()
    {
        System.out.println("Wrap simply!");
    }
}

class PaperBox extends Box
{
    public void wrapWithPaper()
    {
        System.out.println("Wrap with paper!");
    }
}

class GoldenPaperBox extends PaperBox
{
    public void wrapWithGoldenPaper()
    {
        System.out.println("Wrap with golden paper!");
    }
}

class InstanceOf
{
    public static void wrapBox(Box box)
    {
        if (box instanceof GoldenPaperBox)
            ((GoldenPaperBox)box).wrapWithGoldenPaper();
        else if (box instanceof PaperBox)
            ((PaperBox)box).wrapWithPaper();
        else
            box.wrapSimply();
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
