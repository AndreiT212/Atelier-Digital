package Box;

import java.util.Objects;

public class Fighter extends Human
{
    private int dpm;

    public Fighter(int dpm,int health,String name)
    {
        super(health,name);
        this.dpm=dpm;
    }

    public int getDpm() {
        return dpm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return dpm == fighter.dpm;
    }

    @Override
    public int hashCode() {
        return Objects.hash(dpm);
    }
}
