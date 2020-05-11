package Lab5.IO.ch1;

public class Main
{
    public static void main(String[] args)
    {
        PhoneBook pb=new PhoneBook("./src/Lab5/IO/ch1/phonebook");
        System.out.println(pb);

        System.out.println(pb.getContactByName("Andrei"));
    }
}
