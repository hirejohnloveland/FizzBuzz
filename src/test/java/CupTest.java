import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {

    @Test
    void getLiquidType() {
        Cup c = new Cup("orange juice", 85.4);

        assertEquals("orange juice", c.getLiquidType());
    }
    @Test
    void setLiquidType() {
        Cup c = new Cup("orange juice", 85.4);
        c.setLiquidType("Water");
        assertEquals("Water", c.getLiquidType());
    }
    @Test
    void getPercentageFull() {
        Cup c = new Cup("orange juice", 85.4);
        assertEquals(85.4, c.getPercentFull(), 0.003);
    }
}