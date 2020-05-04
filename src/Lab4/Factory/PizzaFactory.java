package Lab4.Factory;

abstract public class PizzaFactory {
    public abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type)
    {
        Pizza pizza;
        pizza=createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
