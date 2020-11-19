import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SurfaceTest {

    @Test
    public void surfEquals(){
        System.out.println("Test surfEquals");
        assertEquals(Surface.surface(5, 3), 15);
    }

    @Test
    public void surfNotEquals(){
        System.out.println("Test surfNotEquals");
        assertNotEquals(Surface.surface(1, 3), 4);
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void surface() {
    }
}