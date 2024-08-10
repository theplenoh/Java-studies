import java.util.Scanner;

class PhoneBookEntry
{
    String name;
    String phoneNum;

    public PhoneBookEntry(String name, String num)
    {
        this.name = name;
        this.phoneNum = num;
    }
    public void printEntryInfo()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Phone #: "+this.phoneNum);
    }
}

class PhoneBookCollegeEntry extends PhoneBookEntry
{
    String major;
    int year;

    public PhoneBookCollegeEntry(String name, String num, String major, int year)
    {
        super(name, num);
        this.major = major;
        this.year = year;
    }
    public void printEntryInfo()
    {
        super.printEntryInfo();
        System.out.println("Major in college: "+this.major);
        System.out.println("Year in college: "+this.year);
    }
}

class PhoneBookCompanyEntry extends PhoneBookEntry
{
    String company;

    public PhoneBookCompanyEntry(String name, String num, String company)
    {
        super(name, num);
        this.company = company;
    }
    public void printEntryInfo()
    {
        super.printEntryInfo();
        System.out.println("Company: "+this.company);
    }
}

class PhoneBookMgr
{
    final int RECORD_MAX = 30;
    PhoneBookEntry[] book = new PhoneBookEntry[RECORD_MAX];
    int recordCnt = 0;

    private PhoneBookEntry readGeneralEntry()
    {
        System.out.print("Name: ");
        String name = MenuUI.kbd.nextLine();
        System.out.print("Phone #: ");
        String phoneNum = MenuUI.kbd.nextLine();

        return new PhoneBookEntry(name, phoneNum);
    }
    private PhoneBookEntry readCollegeEntry()
    {
        System.out.print("Name: ");
        String name = MenuUI.kbd.nextLine();
        System.out.print("Phone #: ");
        String phoneNum = MenuUI.kbd.nextLine();
        System.out.print("Your major: ");
        String major = MenuUI.kbd.nextLine();
        System.out.print("Year in college: ");
        int year = MenuUI.kbd.nextInt();

        return new PhoneBookCollegeEntry(name, phoneNum, major, year);
    }
    private PhoneBookEntry readCompanyEntry()
    {
        System.out.print("Name: ");
        String name = MenuUI.kbd.nextLine();
        System.out.print("Phone #: ");
        String phoneNum = MenuUI.kbd.nextLine();
        System.out.print("Company name: ");
        String company = MenuUI.kbd.nextLine();

        return new PhoneBookCompanyEntry(name, phoneNum, company);
    }
    public void insertEntry()
    {
        if (this.recordCnt < this.book.length)
        {
            PhoneBookEntry newEntry = null;
            int choice;

            String name, phoneNum, major;
            int year;
            String company;

            MenuUI.printSubmenuInsert();
            System.out.print(">>> ");
            choice = Integer.parseInt(MenuUI.kbd.nextLine());

            switch (choice)
            {
                case 1:
                    newEntry = readGeneralEntry();
                    break;
                case 2:
                    newEntry = readCollegeEntry();
                    break;
                case 3:
                    newEntry = readCompanyEntry();
                    break;
                default:
                    System.out.println("Submenu Insert choice: out of range");
            }

            this.book[this.recordCnt++] = newEntry;
        }
        else
        {
            System.out.println("Error - book list full!");
        }
    }
    public void deleteEntry()
    {
        int recordNum;
        System.out.print("Record #: ");
        recordNum = MenuUI.kbd.nextInt();

        recordNum--;
        if (0 <= recordNum && recordNum < this.recordCnt)
        {
            if (recordNum + 1 == this.recordCnt)
                this.book[recordNum] = null;
            else
            {
                for(int i=recordNum; i<this.recordCnt; i++)
                    this.book[i] = this.book[i + 1];

                this.book[recordCnt - 1] = null;
            }

            this.recordCnt--;
        }
        else
        {
            System.out.println("Error - record # is out of range!");
        }
    }
    public void searchForEntry()
    {
        String searchWord;
        System.out.print("Search Word: ");
        searchWord = MenuUI.kbd.nextLine();

        System.out.println("= Search Result ========");
        for(int i=0; i<this.recordCnt; i++)
        {
            if (this.book[i].name.contains(searchWord))
            {
                System.out.println("Record #: "+(i+1));
                this.book[i].printEntryInfo();
            }
        }
        System.out.println("========================");
    }
    public void printAllEntries()
    {
        if (this.recordCnt > 0)
        {
            System.out.println("= Print All Records ====");
            for(int i=0; i<this.recordCnt; i++)
            {
                System.out.println("Record #: "+(i+1));
                this.book[i].printEntryInfo();
            }
            System.out.println("========================");
        }
        else
        {
            System.out.println("Error - book list empty!");
        }
    }
}

class MenuUI
{
    public static Scanner kbd = new Scanner(System.in);

    public static void printMenu()
    {
        System.out.println("= Choose one =========================");
        System.out.println("0. Print the Menu");
        System.out.println("1. Insert an Entry");
        System.out.println("2. Search for an Entry");
        System.out.println("3. Delete an Entry");
        System.out.println("4. Exit the Program");
        System.out.println("5. Print All Entries");
    }
    public static void printSubmenuInsert()
    {
        System.out.println("=== Select among the types ===========");
        System.out.println("1. General, 2. College, 3. Company");
    }
}

class PhoneBookVer04
{
    public static void main(String[] args)
    {
        PhoneBookMgr bookMgr = new PhoneBookMgr();
        int choice;

        MenuUI.printMenu();
        while (true)
        {
            System.out.print(">> ");
            choice = MenuUI.kbd.nextInt();
            MenuUI.kbd.nextLine();

            switch (choice)
            {
                case 0:
                    MenuUI.printMenu();
                    break;
                case 1:
                    bookMgr.insertEntry();
                    break;
                case 2:
                    bookMgr.searchForEntry();
                    break;
                case 3:
                    bookMgr.deleteEntry();
                    break;
                case 4:
                    System.out.println("Exiting the program!");
                    return;
                case 5:
                    bookMgr.printAllEntries();
                    break;
                default:
                    System.out.println("Error - an exception!");
            }
        }
    }
}
