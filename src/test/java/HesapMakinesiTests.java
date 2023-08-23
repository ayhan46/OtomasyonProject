import org.example.HesapMakinesi;
import org.junit.jupiter.api.*;

public class HesapMakinesiTests {

    HesapMakinesi hesapMakinesi;

    @BeforeAll
    public static void setupClass(){
        System.out.println(" Setup class metodu calistirildi. ");
    }


    @BeforeEach
    public void setup(){
        hesapMakinesi = new HesapMakinesi();
        System.out.println(" Setup metodu calistirildi. ");
    }


    @Test
    public void toplamaTesti() {
        double toplamaSonucu = hesapMakinesi.toplama(1.5, 3.6);
        Assertions.assertEquals(5.1, toplamaSonucu);
    }

    @Test
    public void cikarmaTesti(){
    double cikarmaSonucu = hesapMakinesi.cikarma(5.5,3.5);
    Assertions.assertEquals(2.0, cikarmaSonucu);
    }

    @Test
    public void carpmaTesti(){
        double carpmaSonucu = hesapMakinesi.carpma(2.0,3.5);
        Assertions.assertEquals(7.0, carpmaSonucu);
    }

    @AfterEach
    public void teardown(){
        System.out.println(" teardown metodu calistirildi. ");
    }

    @AfterAll
    public static void teardownClass(){
        System.out.println(" teardown class metodu calistirildi. ");
    }


}
