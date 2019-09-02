import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {


    //setup
    Calculator calculator;



    //before
    @Before
    public void before() {
        calculator = new Calculator(4.40, 2.20);
    }


    //AAA
    @Test
    public void addNumber() {
        assertEquals(6.60, calculator.addNumber(),0.01);
    }

    @Test
    public void subtractNumber() {
        assertEquals(2.20, calculator.subtractNumber(), 0.01);
    }

    @Test
    public void multiplyNumber() {
        assertEquals(9.68, calculator.multiplyNumber(), 0.01);
    }

}
