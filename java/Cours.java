import java.util.*;

public class Cours {

    public String nom;
    public int semestre;
    public ArrayList<Enseignant> enseignants;

    public Cours(String nom, int semestre) {
        this.nom = nom;
        this.semestre = semestre;
    }

    public String getNom() {
        return nom;
    }

    public int getSemestre() {
        return semestre;
    }

    public ArrayList<Enseignant> getEnseignants() {
        return enseignants;
    }

    @Override
    public String toString() {
        return "Cours{" +
                "nom='" + nom + '\'' +
                ", semestre=" + semestre +
                '}';
    }
}