class Car
{
    private int gasolineGauge;

    public Car(int gasoline)
    {
        this.gasolineGauge = gasoline;
    }
    public void showCurrGauge()
    {
        System.out.println("Gasoline left: "+gasolineGauge);
    }
}

class HybridCar extends Car
{
    private int electricGauge;

    public HybridCar(int gasoline, int electric)
    {
        super(gasoline);
        this.electricGauge = electric;
    }
    public void showCurrGauge()
    {
        super.showCurrGauge();
        System.out.println("Electricity left: "+electricGauge);
    }
}

class HybridWaterCar extends HybridCar
{
    private int waterGauge;

    public HybridWaterCar(int gasoline, int electric, int water)
    {
        super(gasoline, electric);
        this.waterGauge = water;
    }

    public void showCurrGauge()
    {
        super.showCurrGauge();
        System.out.println("Water left: "+waterGauge);
    }
}

class prob14_1
{
    public static void main(String[] args)
    {
        Car myCarA = new Car(140);
        myCarA.showCurrGauge();

        System.out.println();

        HybridCar myCarB = new HybridCar(100, 90);
        myCarB.showCurrGauge();

        System.out.println();

        HybridWaterCar myCarC = new HybridWaterCar(50, 60, 100);
        myCarC.showCurrGauge();
    }
}
