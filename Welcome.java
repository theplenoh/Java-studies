import java.time.LocalDateTime;

public class Welcome
{
    public static void main(String[] args)
    {
        LocalDateTime timePoint = LocalDateTime.now();

        int currHour = timePoint.getHour();

        System.out.println("현재 시간은 "+timePoint);
        System.out.println(currHour+"시");

        if (0 <= currHour && currHour < 6)
            System.out.println("You need to be sleeping!");
        else if(6 <= currHour && currHour < 12)
            System.out.println("Good morning!");
        else if(12 <= currHour && currHour < 18)
            System.out.println("Good afternoon!");
        else if(18 <= currHour && currHour < 23)
            System.out.println("Good evening!");
        else if(23 <= currHour && currHour < 24)
            System.out.println("You need to go to bed!");
        else
            System.out.println("I don\'t know what time format you are using.");
    }
}
