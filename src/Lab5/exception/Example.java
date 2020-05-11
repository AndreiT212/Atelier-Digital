package Lab5.exception;

public class Example
{
    public void methodUncheckedException(int i)
    {
        if(i==0)
        {
            UnchException e = new UnchException("created in methodUncheckedException");
            throw e;
        }
        System.out.println("after unch exception "+i);
    }

    public void methodCheckedException(int i) throws ChException
    {
        if(i==0)
        {
            ChException c=new ChException("methodCheckedException");
            throw c;
        }
    }
}
