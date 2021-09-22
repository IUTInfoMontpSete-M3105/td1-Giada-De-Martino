import java.util.*;

public class Devoir {

    private String nomDevoir;
    private String description;
    private Date deadline;
    private double nbPoints;

    public Devoir(String nomDevoir, String description, Date deadline) {
        this.nomDevoir = nomDevoir;
        this.description = description;
        this.deadline = deadline;
        this.nbPoints = 0;
    }

    public double getNbPoints() {
        return nbPoints;
    }

    public void setNbPoints(double nbPoints) {
        this.nbPoints = nbPoints;
    }

    @Override
    public String toString() {
        return "Devoir{" +
                "nomDevoir='" + nomDevoir + '\'' +
                ", description='" + description + '\'' +
                ", deadline=" + deadline +
                ", nbPoints=" + nbPoints +
                '}';
    }
}