import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class EvidencijaPolaznika {

    public static void ispisPolaznika(Set<Polaznik> evidencija) {
        for(Polaznik polaznik : evidencija) {
            System.out.println(polaznik);
        }
    }

    public static boolean searchPolaznikByEmail(Set<Polaznik> evidencija, String email) {

        for (Polaznik polaznik : evidencija) {
            if(polaznik.getEmail().equals(email)) {
                return true;
            }
        }

        return false;
    }

    public static void addPolaznik(Set<Polaznik> evidencija, String email ,String ime, String prezime) {
        if(searchPolaznikByEmail(evidencija, email)) {
            System.out.println("Polaznik vec postoji.");
        } else if (!evidencija.add(new Polaznik(ime, prezime, email))) {
            System.out.println("Polaznik postoji.");
        } else {
            System.out.println("Polaznik je uspjesno dodan.");
        }
    }

    public static void main(String[] args) {
        Set<Polaznik> evidencija = new HashSet<>();

        addPolaznik(evidencija, "jankic@admin.com", "Janko", "Jankovic");
        addPolaznik(evidencija, "markic@admin.com", "Marko", "Markovic");
        addPolaznik(evidencija, "zirafa@admin.com", "Melman", "Zirafa");
        addPolaznik(evidencija, "lav@admin.com", "Alex", "Lav");
        addPolaznik(evidencija, "lav@admin.com", "Alex", "Lav");

        ispisPolaznika(evidencija);

        Set<Polaznik> sortiranaEvidencija = new TreeSet<>(evidencija);
        System.out.println("");
        ispisPolaznika(sortiranaEvidencija);
    }
}
