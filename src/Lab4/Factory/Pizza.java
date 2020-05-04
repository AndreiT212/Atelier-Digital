package Lab4.Factory;

public abstract class Pizza
{
    protected String name;

    public void bake()
    {
        System.out.println("baking..."+name);
    }

    public void prepare()
    {
        System.out.println("prepairing..."+name);
    }

    public void cut()
    {
        System.out.println("cutting..."+name);
    }

    public void box()
    {
        System.out.println("done."+name);
    }

    public String toString()
    {
        return "Pizza:"+name;
    }

}
