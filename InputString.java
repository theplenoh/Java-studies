import java.util.*;

public class InputString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        String name;
        int age;

        System.out.print("이름: ");
        name = input.next();

        System.out.print("나이: ");
        age = input.nextInt();

        System.out.println(name+"님, 안녕하세요! "+age+"살이시네요!");
    }
}
