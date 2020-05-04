package Lab4.Factory;

public class Main {
    public static void main(String[] args) {
        PizzaFactory pizzaFactory=new NYPizzaStore();

        Pizza p1= pizzaFactory.orderPizza("Cheese");
        Pizza p2=pizzaFactory.orderPizza("Spicy");

        System.out.println(p1);
        System.out.println(p2);
    }
}
