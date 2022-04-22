public class Voyager
{
    public static void main(String[] args)
    {
        final double speedOfVoyager = 6e4;
        double distance = 40e12;

        double seconds = distance / speedOfVoyager;

        double years = seconds / (24*365);

        System.out.println("걸리는 시간은 " + years + "년입니다.");
    }
}
