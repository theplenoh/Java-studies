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

class Policeman
{
    int handcuffs;
    Gun pistol;

    public Policeman(int numOfBullets, int numOfCuffs)
    {
        handcuffs = numOfCuffs;
        if (numOfBullets != 0)
            pistol = new Gun(numOfBullets);
        else
            pistol = null;
    }
    public void putHandcuff()
    {
        System.out.println("SNAP!");
        handcuffs--;
    }
    public void shoot()
    {
        if (pistol == null)
            System.out.println("MISFIRE!");
        else
            pistol.shoot();
    }
}

class HasComposite
{
    public static void main(String[] args)
    {
        Policeman manWithGun = new Policeman(5, 3);
        manWithGun.shoot();
        manWithGun.putHandcuff();

        Policeman manWithNoGun = new Policeman(0, 3);
        manWithNoGun.shoot();
    }
}
