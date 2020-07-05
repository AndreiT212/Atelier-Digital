package DesingPaternProjects.Observer;

public class Main
{
    public static void main(String[] args)
    {
        Subject subject = new Subject();

        HexadecimalObserver o1=new HexadecimalObserver(subject);
        OctalObserver o2=new OctalObserver(subject);
        BinaryObserver o3=new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
        System.out.println("Second state change: 5");
        subject.delObserver(o1);
        subject.setState(5);
    }
}
