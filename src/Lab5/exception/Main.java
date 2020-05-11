package Lab5.exception;

public class Main
{
    public static void main(String[] args)
    {
        Example e=new Example();
        try
        {
            e.methodCheckedException(0);
        }catch(ChException exception)
        {
            exception.printStackTrace();
        }finally
        {
            System.out.println("fkingfinally");
        }

        System.out.println("aftah exception");
    }
}
