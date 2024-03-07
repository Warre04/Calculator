package be.kuleuven;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator(5, 3);
        assert calculator.add() == 8;
    }
    @Test
    public void testSubtract() {
        Calculator calculator = new Calculator(5, 3);
        assert calculator.subtract() == 2;
    }
    @Test
    public void testMultiply() {
        Calculator calculator = new Calculator(5, 3);
        assert calculator.multiply() == 15;
    }
    @Test
    public void testDivide() {
        Calculator calculator = new Calculator(6, 3);
        assert calculator.divide() == 2;
    }
    @Test
    public void testAdd1() {
        Calculator calculator = new Calculator(5, 10);
        assert calculator.add() == 15;
    }
    @Test
    public void testSubtract2() {
        Calculator calculator = new Calculator(5, 5);
        assert calculator.subtract() == 0;
    }
    @Test
    public void testMultiply2() {
        Calculator calculator = new Calculator(5, 5);
        assert calculator.multiply() == 25;
    }
    @Test
    public void testDivide2() {
        Calculator calculator = new Calculator(15, 5);
        assert calculator.divide() == 3;
    }
}
