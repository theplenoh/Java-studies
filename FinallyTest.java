class FinallyTest
{
    public static void main(String[] args)
    {
        boolean isDivisible = calcDiv(4, 2);

        if (isDivisible)
            System.out.println("연산 성공");
        else
            System.out.println("연산 실패");

        isDivisible = calcDiv(4, 0);
        if (isDivisible)
            System.out.println("연산 성공");
        else
            System.out.println("연산 실패");
    }

    public static boolean calcDiv(int numA, int numB)
    {
        try
        {
            int result = numA / numB;
            System.out.println("나눗셈 결과는: " + result);
            return true;
        }
        catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
            return false;
        }
        finally
        {
            System.out.println("finally 영역 실행");
        }
    }
}
