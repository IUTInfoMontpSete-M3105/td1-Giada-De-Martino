public class Administrateur extends Utilisateur {

    public Administrateur(String nom, String prenom, String adressePostale, String adresseMail) {
        super(nom, prenom, adressePostale, adresseMail);
    }

    public void creerCours(String nom, int semestre) {
        Cours c = new Cours(nom, semestre);
    }

    public void supprimerCours() {
        // TODO implement here
    }

    public void affecterChargeDeCours(Enseignant enseignant) {
        enseignant.setChargeDeCours(true);
    }

    public void desaffecterChargeDeCours() {
        // TODO implement here
    }

    public void affecterEnseignant() {
        // TODO implement here
    }
}