class StringManipulate
{
    public static void main(String[] args)
    {
        String str = "990208-1012752";

        StringBuilder strBuf = new StringBuilder(str);

        String answer = (strBuf.substring(0, 6)).concat(strBuf.substring(7, 14));

        System.out.println(answer);
    }
}
