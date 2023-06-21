import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

public class ProblemTest {
    @Test
    void testMain() {
        
    }

    @Test
    void testGetPassword() {
        assertEquals( 1020,Problem.getPassword(12, 1313, 122, 678, 598));
    }

    @Test
    void testIsStable() {
        assertEquals(true, Problem.isStable(121212000));
        assertEquals(true, Problem.isStable(12));
        assertEquals(false, Problem.isStable(0012211));
        assertEquals(true, Problem.isStable(1212));
        assertEquals(false, Problem.isStable(121));
        assertEquals(true, Problem.isStable(1));
    }

    @Test
    void testGetPassword2() {
        assertEquals( 122+1313,Problem.getPassword(12, 1313, 122, 678, 598));
    }
}
