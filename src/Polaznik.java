import java.util.Objects;

public class Polaznik implements Comparable<Polaznik> {
    private String ime;
    private String prezime;
    private String email;

    public Polaznik(String ime, String prezime, String email) {
        this.ime = ime;
        this.prezime = prezime;
        this.email = email;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPrezime() {
        return this.prezime;
    }

    @Override
    public String toString() {
        return this.ime + " " + this.prezime + " " + this.email;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.email);
    }

    @Override
    public boolean equals(Object obj) {
        Polaznik p = (Polaznik) obj;
        return Objects.equals(this.email, p.getEmail());
    }

    @Override
    public int compareTo(Polaznik o) {
        return this.prezime.compareTo(o.getPrezime());
    }

}
