import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(50);
    }

    @Test
    public void print() {
      assertEquals(30, printer.print(10, 2));
      assertEquals(50, printer.print(30, 2));

    }


}
