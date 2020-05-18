package Lab6.ch1;

public class Main
{
    public static void main(String[] args)
    {
        ExchangeDesk e=new ExchangeDesk();

        RON ron=new RON(10);
        USD usd=e.exchange(ron,USD.class,0.25);
        System.out.println(usd);

        EURO e2=e.<USD,EURO>exchange(usd,EURO.class,1.1);
        System.out.println(e2);
    }
}
