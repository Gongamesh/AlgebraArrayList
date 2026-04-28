import java.util.ArrayList;

public class EvidencijaPolaznika {

    public static void ispisPolaznika(ArrayList<Polaznik> evidencija) {
        for(Polaznik polaznik : evidencija) {
            System.out.println(polaznik);
        }
    }

    public static void searchPolaznikByEmail(ArrayList<Polaznik> evidencija, String email) {
        boolean flag = false;

        for (Polaznik polaznik : evidencija) {
            if(polaznik.getEmail().equals(email)) {
                System.out.println("\nPronadjeni polaznik je: ");
                System.out.println(polaznik);
                flag = true;
                break;
            }
        }

        if(!flag) {
            System.out.println("Polaznik nepostoji!");
        }
    }

    public static void main(String[] args) {
        ArrayList<Polaznik> evidencija = new ArrayList<>();

        evidencija.add(new Polaznik("Janko", "Jankovic", "jankic@admin.com"));
        evidencija.add(new Polaznik("Marko", "Markovic", "markic@admin.com"));
        evidencija.add(new Polaznik("Melman", "Zirafa", "zirafa@admin.com"));
        evidencija.add(new Polaznik("Alex", "Lav", "lav@admin.com"));

        ispisPolaznika(evidencija);
        searchPolaznikByEmail(evidencija, "jankicc@admin.com");
    }
}
