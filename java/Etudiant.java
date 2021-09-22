public class Etudiant extends Utilisateur {

    public String numeroEtudiant;

    public Etudiant(String nom, String prenom, String adressePostale, String adresseMail, String numeroEtudiant) {
        super(nom, prenom, adressePostale, adresseMail);
        this.numeroEtudiant = numeroEtudiant;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                "numeroEtudiant='" + numeroEtudiant + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adressePostale='" + adressePostale + '\'' +
                ", adresseMail='" + adresseMail + '\'' +
                '}';
    }

    public void telechargerDevoir(Devoir d) {
        d.toString();
    }
}