import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class CoursTest {

    Cours cours = new Cours("Histoire", 3);
    Cours coursTest = new Cours("Histoire", 3);

    @Test
    void affichageTest(){
        Assertions.assertEquals(cours.toString(),coursTest.toString());
    }

    @Test
    void getTest(){
        int a = cours.getSemestre();
        Assertions.assertTrue(a == 3);
    }
}