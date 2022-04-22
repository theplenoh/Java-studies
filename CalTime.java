public class CalTime
{
    public static void main(String[] args)
    {
        final double speedOfLight = 3e5;
        double distance = 40e12;

        double seconds, lightYears;

        seconds = distance / speedOfLight;

        lightYears = seconds / (60.0 * 60.0 * 24.0 * 365.0);
        System.out.println("걸리는 시간은 "+lightYears+"광년입니다.");
    }
}
