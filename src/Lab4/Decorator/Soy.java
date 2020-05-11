package Lab4.Decorator;

public class Soy extends CondimentDecorator
{
    public Soy(Beverage beverage)
    {
        super("Soy",3,beverage);
    }
}
