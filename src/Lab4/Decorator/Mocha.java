package Lab4.Decorator;

public class Mocha extends CondimentDecorator
{
    public Mocha(Beverage beverage) {
        super("Mocha", 4, beverage);
    }
}
