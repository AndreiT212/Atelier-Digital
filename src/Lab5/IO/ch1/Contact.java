package Lab5.IO.ch1;

public class Contact
{
    private String name;
    private Long number;

    public Contact(String name,Long number) {
        this.name = name;
        this.number=number;
    }

    public String getName() {
        return name;
    }

    public Long getNumber() {
        return number;
    }

    public String toString()
    {
        return "name:"+getName()+" number:"+getNumber();
    }
}
