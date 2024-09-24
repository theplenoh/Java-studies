import java.util.Scanner;

abstract class Friend
{
    String name;
    String phoneNum;
    String address;

    public Friend(String name, String phone, String addr)
    {
        this.name = name;
        this.phoneNum = phone; // this 생략 가능
        this.address = addr;
    }
    public void showData()
    {
        System.out.println("Name: "+name);
        System.out.println("Phone #: "+phoneNum);
        System.out.println("Address: "+address);
    }
    public abstract void showBriefInfo();
}

class HighSchoolFriend extends Friend
{
    String work;

    public HighSchoolFriend(String name, String phone, String addr, String job)
    {
        super(name, phone, addr);
        work = job;
    }
    public void showData()
    {
        super.showData();
        System.out.println("Work: "+work);
    }
    public void showBriefInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Phone #: "+phoneNum);
    }
}

class CollegeFriend extends Friend
{
    String major;

    public CollegeFriend(String name, String phone, String addr, String major)
    {
        super(name, phone, addr);
        this.major = major;
    }
    public void showData()
    {
        super.showData();
        System.out.println("Major: "+major);
    }
    public void showBriefInfo()
    {
        System.out.println("Name: "+name);
        System.out.println("Phone #: "+phoneNum);
        System.out.println("Major: "+major);
    }
}

class FriendInfoHandler
{
    private Friend[] myFriends;
    private int numOfFriends;

    public FriendInfoHandler(int num)
    {
        myFriends = new Friend[num];
        numOfFriends = 0;
    }
    private void addFriendInfo(Friend fren)
    {
        myFriends[numOfFriends++] = fren;
    }
    public void addFriend(int choice)
    {
        String name, phoneNum, addr, job, major;

        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Phone #: ");
        phoneNum = sc.nextLine();
        System.out.print("Address: ");
        addr = sc.nextLine();

        if (choice == 1)
        {
            System.out.print("Work: ");
            job = sc.nextLine();
            addFriendInfo(new HighSchoolFriend(name, phoneNum, addr, job));
        }
        else // if (choice == 2)
        {
            System.out.print("Major: ");
            major = sc.nextLine();
            addFriendInfo(new CollegeFriend(name, phoneNum, addr, major));
        }
        System.out.println("Input complete!\n");
    }

    public void showAllData()
    {
        for (int i = 0; i < numOfFriends; i++)
        {
            myFriends[i].showData();
            System.out.println("");
        }
    }

    public void showAllBriefInfo()
    {
        for (int i = 0; i < numOfFriends; i++)
        {
            myFriends[i].showBriefInfo();
            System.out.println("");
        }
    }
}

class MyFriendInfoBook
{
    public static void main(String[] args)
    {
        FriendInfoHandler handler = new FriendInfoHandler(10);

        while (true)
        {
            System.out.println("= Select a choice =========");
            System.out.println("1. Add a High School Friend");
            System.out.println("2. Add a College Friend");
            System.out.println("3. Show All Data");
            System.out.println("4. Show Brief Info");
            System.out.println("5. Exit the Program");
            System.out.print(">> ");

            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();

            switch (choice)
            {
                case 1:
                case 2:
                    handler.addFriend(choice);
                    break;
                case 3:
                    handler.showAllData();
                    break;
                case 4:
                    handler.showAllBriefInfo();
                    break;
                case 5:
                    System.out.println("Exiting the Program.");
                    return;
            }
        }
    }
}
