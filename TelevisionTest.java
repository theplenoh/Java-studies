public class TelevisionTest
{
    public static void main(String[] args)
    {
        Television myTV = new Television();
        myTV.setChannel(11);

        int ch = myTV.getChannel();
        System.out.println("현재 채널은 "+ch+"입니다.");

        myTV.printStatus();
    }
}
