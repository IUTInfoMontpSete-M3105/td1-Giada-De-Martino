import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.Calendar;
import java.util.Date;

class RenduTest {
    Date date = new Date(Calendar.YEAR, Calendar.MONTH, 17);
    Rendu rendu = new Rendu("Devoir", date, "Devoirs rendu");
    Rendu renduTest = new Rendu("Devoir", date, "Devoirs rendu");

    @Test
    void affichageRendu(){
        Assertions.assertEquals(rendu.toString(), renduTest.toString());
    }

    @Test
    void renduRam(){
        Assertions.assertNotEquals(rendu, renduTest);
    }
}