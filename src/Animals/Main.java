package Animals;

public class Main {
    public static void main(String[] args) {
        Fish d=new Fish();
        Cat c=new Cat("Fluffy");
        Animal a=new Fish();
        Animal e=new Spider();
        Pet p=new Cat();



        System.out.println(d.getName());
        d.setName("pesti");
        System.out.println(d.getName());
        d.play();
        System.out.println(d.walk());
        System.out.println(d.eat());

        System.out.println(c.getName());
        c.setName("pisi");
        System.out.println(c.getName());
        c.play();
        System.out.println(c.eat());
        System.out.println(c.walk(c.legs));

        System.out.println(e.eat());
        System.out.println(e.walk(e.legs));
    }
}
