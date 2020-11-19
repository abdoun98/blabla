import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PerimetreTest {

    @Test
    public void perimEquals(){
        System.out.println("Test perimEquals");
        assertEquals(Perimetre.perimetre(5, 3, 2), 16);
    }

    @Test
    public void perimNotEquals(){
        System.out.println("Test perimNotEquals");
        assertNotEquals(Perimetre.perimetre(1, 3, 5), 35);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void perimetre() {
    }
}