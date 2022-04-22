class BeadKid
{
    int numOfBeads;

    public BeadKid(int beads)
    {
        numOfBeads = beads;
    }
    public void getsBeadsFrom(BeadKid kid, int beadNum)
    {
        numOfBeads+=kid.losesBeads(beadNum);
    }
    public int losesBeads(int beads)
    {
        if(numOfBeads<beads)
        {
            int returnVal = numOfBeads;
            numOfBeads = 0;
            return returnVal;
        }

        numOfBeads-=beads;
        return beads;
    }
    public void displayStatus()
    {
        System.out.println("보유 구슬 개수: "+numOfBeads);
    }
}

class prob7_1_2
{
    public static void main(String[] args)
    {
        BeadKid child1 = new BeadKid(15);
        BeadKid child2 = new BeadKid(9);

        System.out.println("= 게임 전 =====");
        System.out.println("어린이1");
        child1.displayStatus();
        System.out.println("어린이2");
        child2.displayStatus();

        child1.getsBeadsFrom(child2, 2);
        child2.getsBeadsFrom(child1, 7);

        System.out.println("= 게임 후 =====");
        System.out.println("어린이1");
        child1.displayStatus();
        System.out.println("어린이2");
        child2.displayStatus();
    }
}
