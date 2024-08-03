import java.util.Scanner;

class PhoneBookEntry
{
    String name;
    String phoneNum;
    String dateOfBirth;

    public PhoneBookEntry(String name, String num, String birth)
    {
        this.name = name;
        this.phoneNum = num;
        this.dateOfBirth = birth;
    }
    public PhoneBookEntry(String name, String num)
    {
        this.name = name;
        this.phoneNum = num;
        this.dateOfBirth = null;
    }
    public void printPhoneBookEntryInfo()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Phone #: "+this.phoneNum);
        if (this.dateOfBirth != null)
            System.out.println("DOB: "+this.dateOfBirth);

        System.out.println("");
    }
}

class PhoneBookCtrl
{
    Scanner kbd = new Scanner(System.in);

    PhoneBookEntry[] book;
    int recordCnt = 0;

    public PhoneBookCtrl(PhoneBookEntry[] phoneBook)
    {
        this.book = phoneBook;
    }
    public void printMenu()
    {
        System.out.println("= Choose one ===========");
        System.out.println("0. Print the Menu");
        System.out.println("1. Insert an Entry");
        System.out.println("2. Search for an Entry");
        System.out.println("3. Delete an Entry");
        System.out.println("4. Exit the Program");
        System.out.println("5. Print All Entries");
    }
    public void insertEntry()
    {
        if (this.recordCnt < this.book.length)
        {
            String name, phoneNum, dateOfBirth;

            System.out.print("Name: ");
            name = kbd.nextLine();
            System.out.print("Phone #: ");
            phoneNum = kbd.nextLine();
            System.out.print("DOB: ");
            dateOfBirth = kbd.nextLine();

            this.book[this.recordCnt++] = new PhoneBookEntry(name, phoneNum, dateOfBirth);
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
        recordNum = Integer.parseInt(kbd.nextLine());

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
        searchWord = kbd.nextLine();

        System.out.println("= Search Result ========");
        for(int i=0; i<this.recordCnt; i++)
        {
            if (this.book[i].name.contains(searchWord))
                System.out.printf("%2d. [%s] [%s] [%s]\n", i+1, this.book[i].name, this.book[i].phoneNum, this.book[i].dateOfBirth);
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
                System.out.printf("%2d. [%s] [%s] [%s]\n", i+1, this.book[i].name, this.book[i].phoneNum, this.book[i].dateOfBirth);
            }
            System.out.println("========================");
        }
        else
        {
            System.out.println("Error - book list empty!");
        }
    }
}

class PhoneBookVer03
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int choice;

        PhoneBookEntry[] book = new PhoneBookEntry[30];
        PhoneBookCtrl bookCtrl = new PhoneBookCtrl(book);

        bookCtrl.printMenu();
        while(true)
        {
            System.out.print(">> ");
            choice = sc.nextInt();
            sc.nextLine();
            switch(choice)
            {
                case 0:
                    bookCtrl.printMenu();
                    break;
                case 1:
                    bookCtrl.insertEntry();
                    break;
                case 2:
                    bookCtrl.searchForEntry();
                    break;
                case 3:
                    bookCtrl.deleteEntry();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return;
                case 5:
                    bookCtrl.printAllEntries();
                    break;
                default:
                    System.out.println("Error - an exception!");
            }
        }
    }
}
