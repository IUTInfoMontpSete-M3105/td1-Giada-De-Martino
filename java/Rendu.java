import javax.swing.text.Document;
import java.util.*;

public class Rendu {

    private String nom;
    private Date date;
    private String document;

    public Rendu(String nom, Date date, String document) {
        this.nom = nom;
        this.date = date;
        this.document = document;
    }

    @Override
    public String toString() {
        return "Rendu{" +
                "nom='" + nom + '\'' +
                ", date=" + date +
                ", document=" + document +
                '}';
    }
}