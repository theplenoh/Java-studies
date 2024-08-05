class Computer
{
    String owner;

    public Computer(String name)
    {
        owner = name;
    }
    public void compute()
    {
        System.out.println("요청 내용을 계산합니다.");
    }
}

class LaptopComp extends Computer
{
    int battery;

    public LaptopComp(String name, int initBatt)
    {
        super(name);
        battery = initBatt;
    }
    public void charge()
    {
        battery += 5;
    }
    public void computeOnMove()
    {
        if (battery < 1)
        {
            System.out.println("충전이 필요합니다.");
            return;
        }

        System.out.print("이동하면서 ");
        compute();
        battery-=1;
    }
}

class TabletComp extends LaptopComp
{
    String registeredPenModel;

    public TabletComp(String name, int initBatt, String pen)
    {
        super(name, initBatt);
        registeredPenModel = pen;
    }

    public void scribble(String penInfo)
    {
        if (battery < 1)
        {
            System.out.println("충전이 필요합니다.");
            return;
        }

        if (registeredPenModel.compareTo(penInfo) != 0)
        {
            System.out.println("등록된 펜이 아닙니다.");
            return;
        }

        System.out.println("필기 내용을 처리합니다.");
        battery -= 1;
    }
}

class ISAInheritance
{
    public static void main(String[] args)
    {
        LaptopComp laptop = new LaptopComp("이수종", 5);
        TabletComp tablet = new TabletComp("정수영", 5, "ISE-241-242");

        laptop.computeOnMove();
        tablet.scribble("ISE-241-242");
    }
}
