package DesingPaaternProjects.Observer;

public class OctalObserver extends Observer
{
    public OctalObserver(Subject subject)
    {
        this.subject=subject;
        this.subject.addObserver(this);
    }
    public void update()
    {
        System.out.println("octal:"+Integer.toOctalString(subject.getState()));
    }
}
