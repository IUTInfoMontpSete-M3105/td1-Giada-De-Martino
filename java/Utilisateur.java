public abstract class Utilisateur {

    public String nom;
    public String prenom;
    public String adressePostale;
    public String adresseMail;

    public Utilisateur(String nom, String prenom, String adressePostale, String adresseMail) {
        this.nom = nom;
        this.prenom = prenom;
        this.adressePostale = adressePostale;
        this.adresseMail = adresseMail;
    }

    public void gererDonnees() {
        // TODO implement here
    }

    public void afficherCours(Cours cours) {
        System.out.println(cours.toString());
    }

    public void afficherDevoirs(Devoir dev) {
        System.out.println(dev.toString());
    }

    public void afficherRendu(Rendu ren) {
        System.out.println(ren.toString());
    }

    public void afficherPoints(Devoir dev) {
        System.out.println(dev.getNbPoints());
    }
}