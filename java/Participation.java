import java.util.*;

public class Participation {

    public double nbTotalPoints;
    public String certificat;

    public Participation(int nbTotalPoints, String certificat) {
        this.nbTotalPoints = nbTotalPoints;
        this.certificat = certificat;
    }

    public double getNbTotalPoints() {
        return nbTotalPoints;
    }

    public void setNbTotalPoints(double nbTotalPoints) {
        this.nbTotalPoints = nbTotalPoints;
    }

    public String getCertificat() {
        return certificat;
    }

    public void setCertificat(String certificat) {
        this.certificat = certificat;
    }
}