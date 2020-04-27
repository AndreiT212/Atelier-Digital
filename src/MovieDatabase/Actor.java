package MovieDatabase;

import java.util.Arrays;
import java.util.Objects;

public class Actor
{
    private String nume;
    private int varsta;
    private Premiu[] p=new Premiu[]{};

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return varsta == actor.varsta &&
                Objects.equals(nume, actor.nume) &&
                Arrays.equals(p, actor.p);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(nume, varsta);
        result = 31 * result + Arrays.hashCode(p);
        return result;
    }

    public Actor(String nume, int varsta, Premiu[] p)
    {
        this.varsta=varsta;
        this.nume=nume;
        this.p=p;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
