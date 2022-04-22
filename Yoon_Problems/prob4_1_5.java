class prob4_1_5
{
    public static void main(String[] args)
    {
        int A = ((25+5)+(36/4)-72)*5;
        int B = ((25*5)+(36-4)+71)/4;
        int C = (128/4)*2;

        if(C < B && B < A)
        {
            System.out.println(true);
        }
        else
        {
            System.out.println(false);
        }
    }
}
