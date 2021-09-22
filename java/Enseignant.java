import java.util.*;

public class Enseignant extends Utilisateur {

    public String Numem;
    public String Harpege;
    public Boolean chargeDeCours = false;

    public Enseignant(String nom, String prenom, String adressePostale, String adresseMail, String numem, String harpege) {
        super(nom, prenom, adressePostale, adresseMail);
        Numem = numem;
        Harpege = harpege;
    }

    public void setChargeDeCours(Boolean chargeDeCours) {
        this.chargeDeCours = chargeDeCours;
    }

    //devoirs
    public Devoir creerDevoir(String nomDevoir, String description, Date deadline) {
        return new Devoir(nomDevoir, description, deadline);
    }

    public void corrigerDevoir(Devoir dev, double note) {
        dev.setNbPoints(note);
    }

    //certificats
    public void attribuerPoint() {
    }

    public void attribuerAvis() {
    }

    //cours
    public void donnerCours(){
    }

    public void participerCours(){
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "Numem='" + Numem + '\'' +
                ", Harpege='" + Harpege + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                '}';
    }
}