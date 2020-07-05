package DesingPaternProjects.Prototype;
import java.util.HashMap;
import java.util.Map;

abstract public class Number implements Cloneable
{
    protected int number;
    abstract void addNr();

    public Object clone()
    {
        Object clone=null;
        try
        {
            clone=super.clone();
        }
        catch(CloneNotSupportedException e)
        {
            e.printStackTrace();
        }
        return clone;
    }
}
