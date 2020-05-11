package Lab4.Decorator;

public class Main {
    public static void main(String[] args)
    {
        Beverage dr=new DarkRoast();
        Beverage drw=new Whip(dr);

        Beverage hb=new HouseBlend();
        hb=new Mocha(hb);
        hb=new Mocha(hb);
        hb=new Whip(hb);

        Beverage doubleMocha=new HouseBlend();
        doubleMocha=new Mocha(doubleMocha);
        doubleMocha=new Mocha(doubleMocha);
        doubleMocha=new Whip(doubleMocha);

        Beverage simpleEspresso=new Espresso();

        System.out.println(drw.getDescription()+"="+drw.getCost());
        System.out.println(dr.getDescription()+"="+dr.getCost());
        System.out.println(hb.getDescription()+"="+hb.getCost());
        System.out.println(doubleMocha.getDescription()+"="+doubleMocha.getCost());
        System.out.println(simpleEspresso.getDescription()+"="+simpleEspresso.getCost());
    }
}
