package MovieDatabase;

public class Film {

    private int anAparitie;
    private String nume;
    Actor[] actori = new Actor[]{};

    public Film(int anAparitie,String nume,Actor[] actori)
    {
        this.anAparitie=anAparitie;
        this.nume=nume;
        this.actori=actori;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getAnAparitie() {
        return anAparitie;
    }

    public void setAnAparitie(int anAparitie) {
        this.anAparitie = anAparitie;
    }
}
