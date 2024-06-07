import org.example.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class CalculatorSpecs {

    Calculator calc = new Calculator();
    @Test
    @DisplayName("Assert Equals test case")
    public void assertEqualTest(){
        Assertions.assertEquals(4,calc.add(2,2),()->"Both are not equals");
        Assertions.assertNotEquals(3,calc.add(2,2));
    }

    @Test
    @DisplayName("Assert Array equals test case")
    public void assertArrayEquals(){
        Assertions.assertArrayEquals(new int[] {1,2,3},new int[] {1,2,3});
    }

    @Test
    @DisplayName("Assert not null test case")
    public void assertNotEqual(){
        String nullString =null;
        String notNull ="abc";
        Assertions.assertNotNull(notNull);
    }

    @Test
    @DisplayName("Assert true case")
    public void assertTrueTest(){
        boolean trueVar = true;
        boolean falseVar = false;

        Assertions.assertTrue(trueVar);
    }
}
