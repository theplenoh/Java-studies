class StringReverseTest
{
    public static void main(String[] args)
    {
        String str = "ABCDEFGHIJKLMN";
        StringBuilder strRev = new StringBuilder(str);

        System.out.println(strRev.reverse());
    }
}
