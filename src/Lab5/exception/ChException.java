package Lab5.exception;

public class ChException extends Exception
{
    public ChException(String message)
    {
        super("New Exception "+message);
    }
}
