package Lab4.Decorator;

public class Milk extends CondimentDecorator
{
    public Milk(Beverage beverage)
    {
        super("Milk",1,beverage);
    }
}
