import java.util.*;

public class EvidencijaPolaznika {

    public static void ispisPolaznika(Map<String, Polaznik> evidencija) {
        for(Polaznik polaznik : evidencija.values()) {
            System.out.println(polaznik);
        }
    }

    public static boolean searchPolaznikByEmail(Map<String, Polaznik> evidencija, String email) {

        for (String key : evidencija.keySet()) {
            if(key.equals(email)) {
                return true;
            }
        }

        return false;
    }

    public static void addPolaznik(Map<String, Polaznik> evidencija, String email ,String ime, String prezime) {
        if(evidencija.containsKey(email)) {
            System.out.println("Polaznik s ovim emailom vec postoji.");
        } else {
            evidencija.put(email, new Polaznik(ime, prezime, email));
        }
    }

    public static void main(String[] args) {
        Map<String, Polaznik> evidencija = new HashMap<>();

        addPolaznik(evidencija, "jankic@admin.com", "Janko", "Jankovic");
        addPolaznik(evidencija, "markic@admin.com", "Marko", "Markovic");
        addPolaznik(evidencija, "zirafa@admin.com", "Melman", "Zirafa");
        addPolaznik(evidencija, "lav@admin.com", "Alex", "Lav");
        addPolaznik(evidencija, "lav@admin.com", "Alex", "Lav");

        ispisPolaznika(evidencija);

        Map<String, Polaznik> sortiranaEvidencija = new TreeMap<>(evidencija);

        System.out.println("");
        ispisPolaznika(sortiranaEvidencija);
    }
}
