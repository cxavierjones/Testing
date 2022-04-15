import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    void setup(){
        calculator=new Calculator();
    }
    @Test
    void TestSum(){
        Integer sum = calculator.sum(new Integer[]{3,2,1});
        assertEquals(6,sum);
    }
    @Test
    void TestSum2(){
        Integer sum = calculator.sum(new Integer[]{3,2,1,10,10});
        assertEquals(26,sum);
    }

    @Test
    void TestMultiplication(){
        Integer multiply = calculator.multiply(new Integer[]{4,2});
        assertEquals(8,multiply);
    }

    @Test
    void TestMultiplication2(){
        Integer multiply = calculator.multiply(new Integer[]{4,2,5,3});
        assertEquals(120,multiply);
    }

    @Test
    void TestMax(){
        Integer max = calculator.max(new Integer[]{3,4,6,5,7});
        assertEquals(7,max);
    }

    @Test
    void TestMax2(){
        Integer max = calculator.max(new Integer[]{-4,-3,-6,-5,-7});
        assertEquals(-3,max);
    }
    @Test
    void testDivide(){
        double div = calculator.divide(4,2);
        assertEquals(2,div);
    }
    @Test
    void testDivide2(){
        double div = calculator.divide(2,4);
        assertEquals(0.5,div);
    }
//    @Test
//    void testDivide3(){
//        double div = calculator.divide(2,0);
//        assertEquals(Double.POSITIVE_INFINITY,div);
//    }

       @Test
    void testDivide3(){
        // lambda expression
        assertThrows(ArithmeticException.class,()->calculator.divide(2,0));
    }

    @Test
    void testDivide4(){
        assertThrows(ArithmeticException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                calculator.divide(5,0);
            }
        });
    }
}

