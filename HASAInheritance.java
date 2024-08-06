class Gun
{
    int bullets;

    public Gun(int numOfBullets)
    {
        bullets = numOfBullets;
    }
    public void shoot()
    {
        System.out.println("SHOOT!");
        bullets--;
    }
}

class Policeman extends Gun
{
    int handcuffs;

    public Policeman(int numOfBullets, int numOfCuffs)
    {
        super(numOfBullets);
        handcuffs = numOfCuffs;
    }
    public void putHandcuff()
    {
        System.out.println("SNAP!");
        handcuffs--;
    }
}

class HASAInheritance
{
    public static void main(String[] args)
    {
        Policeman man1 = new Policeman(5, 3);
        man1.shoot();
        man1.putHandcuff();
    }
}
