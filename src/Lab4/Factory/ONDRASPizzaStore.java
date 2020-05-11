package Lab4.Factory;

public class ONDRASPizzaStore extends PizzaFactory
{
    public Pizza createPizza(String type)
    {
        Pizza pizza=null;

        if(type.equals("Annanas"))
            pizza=new ONDRASAnnanasPizza();
        else
            if(type.equals("Sea Fruit"))
                pizza=new ONDRASSeaFruitPizza();
        return pizza;
    }
}
