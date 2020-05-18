package Lab6.ch2;

public class Pair <T extends Shoe>
{
    private T first;
    private T second;

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public Pair(T first,T second) throws Exception
    {
        if(first.getColor().equals(second.getColor()))
            throw new Exception("no match colors");

        if(first.getSize()==second.getSize())
            throw new Exception("no match size");

        this.first=first;
        this.second=second;
    }

    public String toString()
    {
        return this.getClass()+"="+this.getFirst()+"+"+this.getSecond();
    }
}
