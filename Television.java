public class Television
{
    int channel;
    int volume;
    boolean powerState;

    void printStatus()
    {
        System.out.println("채널: "+channel);
        System.out.println("볼륨: "+volume);
        System.out.printf("전원 상태: %s\n", powerState? "켜짐":"꺼짐");
    }

    int getChannel()
    {
        return channel;
    }

    void setChannel(int ch)
    {
        channel = ch;
    }
}
