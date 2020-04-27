package Animals;

abstract public class Animal
{
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract String eat();

    public String walk(int legs)
    {
        return "walking on "+legs+" legs";
    }
}
