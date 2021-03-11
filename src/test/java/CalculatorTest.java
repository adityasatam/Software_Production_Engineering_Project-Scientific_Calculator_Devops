import calculator.Calculator;
import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void powerTruePositive(){
        assertEquals("power two integer numbers for True Positive", 8, calculator.power(2, 3), DELTA);
        assertEquals("power two double numbers for True Positive", 3.463102551737, calculator.power(2.6, 1.3), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("power two integer numbers for False Positive", 6, calculator.power(2, 3), DELTA);
        assertNotEquals("power two double numbers for False Positive", 7.3, calculator.power(2.6, 1.3), DELTA);
    }

    @Test
    public void squarerootTruePositive(){
        assertEquals("squareroot one integer numbers for True Positive", 2, calculator.squareroot(4), DELTA);
        assertEquals("squareroot one double numbers for True Positive", 1.449137674618944, calculator.squareroot(2.1), DELTA);
    }

    @Test
    public void squarerootFalsePositive(){
        assertNotEquals("squareroot one integer numbers for False Positive", 6, calculator.squareroot(4), DELTA);
        assertNotEquals("squareroot one double numbers for False Positive", -7.3, calculator.squareroot(2.1), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        assertEquals("factorial one integer numbers for True Positive", 120, calculator.factorial(5), DELTA);
        assertEquals("factorial one double numbers for True Positive", 120, calculator.factorial(5.2), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("factorial one integer numbers for False Positive", 6, calculator.factorial(5), DELTA);
        assertNotEquals("factorial one double numbers for False Positive", 7.3, calculator.factorial(5.2), DELTA);
    }

    @Test
    public void naturallogTruePositive(){
        assertEquals("naturallog one integer number for True Positive", 2.302585092994046, calculator.naturallog(10), DELTA);
        assertEquals("naturallog one double number for True Positive", 2.322387720290225, calculator.naturallog(10.2), DELTA);
    }

    @Test
    public void naturallogFalsePositive(){
        assertNotEquals("naturallog one integer number for False Positive", 10, calculator.naturallog(10), DELTA);
        assertNotEquals("naturallog one double number for False Positive", 10.5, calculator.naturallog(10.2), DELTA);
    }


}
