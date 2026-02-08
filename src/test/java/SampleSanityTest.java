import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleSanityTest {

    @Test
    void addWorks() {
        SafeCalculator c = new SafeCalculator();
        assertEquals(5, c.add(2, 3));
    }

    @Test
    void divideByZeroThrows() {
        SafeCalculator c = new SafeCalculator();
        assertThrows(IllegalArgumentException.class, () -> c.divide(1, 0));
    }
}
