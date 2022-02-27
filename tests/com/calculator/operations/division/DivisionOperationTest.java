package tests.com.calculator.operations.division;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.com.calculator.operations.division.Division;

public class DivisionOperationTest {
    
    Division divider = new Division();

    @Test
    public void shouldReturn2_5() {
        assertEquals(2.5d, divider.division(5, 2));
    }

    @Test
    public void shouldReturn0() {
        assertEquals(0, divider.division(0, 8000));
    }

}
