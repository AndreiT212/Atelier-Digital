package Lab4.Decorator;

public class Whip extends CondimentDecorator
{
    public Whip(Beverage beverage) {
        super("Whip", 4,beverage);
    }
}
