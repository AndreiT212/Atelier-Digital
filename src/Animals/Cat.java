package Animals;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name) {
        super(4);
        this.name=name;
    }

    Cat()
    {
        this("");
    }

    @Override
    public String eat() {
        return "munch munch";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("pur pur");
    }
}
