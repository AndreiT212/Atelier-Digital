package MovieDatabase;

public class Studio {

    private String nume;
    Film[] filme = new Film[]{};

    public int getContor() {
        return contor;
    }

    private int contor;

    public Studio(String nume,Film[] filme) {
        this.nume = nume;
        this.filme = filme;
        this.contor=filme.length;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }
}
