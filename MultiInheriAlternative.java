interface TV
{
    public void onTV();
}

class TVImpl
{
    public void onTV()
    {
        System.out.println("영상 출력 중");
    }
}

interface Computer
{
    public void dataReceive();
}

class ComputerImpl
{
    public void dataReceive()
    {
        System.out.println("영상 데이터 수신 중");
    }
}

class IPTV implements TV, Computer
{
    ComputerImpl myComp = new ComputerImpl();
    TVImpl myTV = new TVImpl();

    public void dataReceive()
    {
        myComp.dataReceive();
    }
    public void onTV()
    {
        myTV.onTV();
    }
    public void powerOn()
    {
        myComp.dataReceive();
        myTV.onTV();
    }
}

class MultiInheriAlternative
{
    public static void main(String[] args)
    {
        IPTV iptv = new IPTV();
        iptv.powerOn();

        TV tv = iptv;
        Computer comp = iptv;
    }
}
