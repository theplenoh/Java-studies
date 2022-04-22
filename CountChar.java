public class CountChar
{
    public static void main(String[] args)
    {
        String str = "no news is good news.";
        int cnt=0;

        for(int i=0; i<str.length(); i++)
        {
            if(str.charAt(i) == 'n')
                cnt++;
        }

        System.out.printf("cnt: %d\n", cnt);
    }
}
