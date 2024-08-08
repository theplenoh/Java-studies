class Speaker
{
    private int volume;

    public void showCurrState()
    {
        System.out.println("Speaker vol.: "+volume);
    }
    public void setVolume(int vol)
    {
        volume = vol;
    }
}

class BassSpeaker extends Speaker
{
    private int bassVolume;

    public void showCurrState()
    {
        super.showCurrState();
        System.out.println("Bass vol.: "+bassVolume);
    }
    public void setBassVolume(int bass)
    {
        bassVolume = bass;
    }
}

class Overriding
{
    public static void main(String[] args)
    {
        Speaker bassSp = new BassSpeaker();

        bassSp.setVolume(10);
        bassSp.setBassVolume(20);
        bassSp.showCurrState();
    }
}
