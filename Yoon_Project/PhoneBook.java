class PhoneInfo
{
    String name;
    String phoneNumber;
    String dateOfBirth;

    public PhoneInfo(String name, String num, String DOB)
    {
        this.name = name;
        this.phoneNumber = num;
        this.dateOfBirth = DOB;
    }

    public PhoneInfo(String name, String num)
    {
        this.name = name;
        this.phoneNumber = num;
        this.dateOfBirth = null;
    }

    public void showPhoneInfo()
    {
        System.out.println("Name: "+this.name);
        System.out.println("Phone #: "+this.phoneNumber);
        if (this.dateOfBirth!=null)
            System.out.println("Birth: "+this.dateOfBirth);

        System.out.println("");
    }
}

class PhoneBookVer01
{
    public static void main(String[] args)
    {
        PhoneInfo person1 = new PhoneInfo("김정훈", "010-1234-1234", "920112");
        PhoneInfo person2 = new PhoneInfo("이효준", "010-3456-1234", "930112");

        person1.showPhoneInfo();
        person2.showPhoneInfo();
    }
}
