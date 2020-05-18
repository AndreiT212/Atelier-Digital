package Lab6.ch1;

public class RON extends Currency
{
    public RON(){super();}

    public RON(double units)
    {
        super(units);
    }

    public String toString()
    {
        return "Ron:"+getUnits();
    }
}
