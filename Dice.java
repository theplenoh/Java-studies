import java.util.Random;

public class Dice
{
    public static void main(String[] args)
    {
        Random diceGen = new Random();
        System.out.println("주사위 두 개를 굴립니다!");
        System.out.println(diceGen.nextInt(6)+"!");
        System.out.println("그리고");
        System.out.println(diceGen.nextInt(6)+"!");
    }
}
