package Lab6.ch1;

public class EURO extends Currency
{
    public EURO(double units)
    {
        super(units);
    }
    public EURO(){super();}

    public String toString()
    {
        return "Euro:"+getUnits();
    }
}
