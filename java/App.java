import java.util.Calendar;
import java.util.Date;

public class App {

    public static void main(String[] args) {
        Enseignant prof = new Enseignant("Paul", "Vic", "32041", "abcd@gmail.com","1564879","seds2232");
        Enseignant prof2 = new Enseignant("Pantin", "All", "32041", "abcd@gmail.com","1564879","seds2232");

        Date deadline = new Date(Calendar.YEAR, Calendar.MONTH, 17);
        Devoir d1 = prof.creerDevoir("Devoir 1", "Finir vite", deadline);
        Devoir d2 = prof2.creerDevoir("Devoir 2","Ceci est un autre devoir",deadline);

        Administrateur admin = new Administrateur("Jean", "Paul", "32400","adefrt@gmail.com");

        Etudiant e1 = new Etudiant("Jean", "Jean","32400","sfrd@gmail.com","165240");
        Etudiant e2 = new Etudiant("Jeanis", "Jean","32400","sfrd@gmail.com","165240");

        Cours cours = new Cours("Histoire", 3);

        System.out.println(prof);
        System.out.println(prof2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(cours);
    }
}
