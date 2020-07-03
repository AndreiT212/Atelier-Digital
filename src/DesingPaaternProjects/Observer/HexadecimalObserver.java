package DesingPaaternProjects.Observer;

public class HexadecimalObserver extends Observer
{
    public HexadecimalObserver(Subject subject)
    {
        this.subject=subject;
        this.subject.addObserver(this);
    }

    public void update()
    {
        System.out.println("hexadecimal:"+Integer.toHexString(subject.getState()));
    }
}
