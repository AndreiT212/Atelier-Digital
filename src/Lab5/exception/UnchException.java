package Lab5.exception;

public class UnchException extends RuntimeException
{
    public UnchException(String message)
    {
        super("Unchecked Exception "+message);
    }
}
