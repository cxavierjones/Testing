import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    @Test
    void TestSum(){
        Calculator calculate = new Calculator();
        Integer sum = calculate.sum(new Integer[]{3,2,1});
        assertEquals(6,sum);
    }
    @Test
    void TestSum2(){
        Calculator calculate = new Calculator();
        Integer sum = calculate.sum(new Integer[]{3,2,1,10,10});
        assertEquals(26,sum);
    }

    @Test
    void TestMultiplication(){
        Calculator calculate = new Calculator();
        Integer multiply = calculate.multiply(new Integer[]{4,2});
        assertEquals(8,multiply);
    }

    @Test
    void TestMultiplication2(){
        Calculator calculate = new Calculator();
        Integer multiply = calculate.multiply(new Integer[]{4,2,5,3});
        assertEquals(120,multiply);
    }
}
