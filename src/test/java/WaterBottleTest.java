import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

WaterBottle waterBottle;

    @Before
    public void before() {
      waterBottle = new WaterBottle(100);
    }


    @Test
    public void drink() {
        assertEquals(90, waterBottle.drink());
    }

    @Test
    public void emptyBottle() {
        assertEquals(0, waterBottle.emptyBottle());
    }

    @Test
    public void fillBottle() {
        WaterBottle emptyWaterBottle = new WaterBottle( 20);
        assertEquals( 100, emptyWaterBottle.fillBottle());
    }



}
