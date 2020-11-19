import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ProduitTest {

    @Test
    public void multEquals(){
        System.out.println("Test multEquals");
        assertEquals(Produit.multiply(5, 3), 15);
    }

    @Test
    public void multNotEquals(){
        System.out.println("Test multNotEquals");
        assertNotEquals(Produit.multiply(1, 3), 4);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void multiply() {

    }
}