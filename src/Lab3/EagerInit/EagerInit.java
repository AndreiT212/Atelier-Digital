package Lab3.EagerInit;

public class EagerInit
{
    private static final EagerInit instance = new EagerInit();

    public EagerInit() {}

    public static EagerInit getInstance()
    {
        return instance;
    }
}
