package Box;

public class Human {
    private int health;
    private String name;

    public Human(int health,String name) {
        this.health = health;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void decreaseHealth(int damage)
    {
        health=health-damage;
    }
}
