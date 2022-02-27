package tests.com.calculator.operations.subtraction;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.com.calculator.operations.subtraction.Subtraction;

public class SubtractionOperationTest {
    
    Subtraction subtraction = new Subtraction();

    @Test
    public void shouldReturn10() {
        assertEquals(10, subtraction.subtract(30, 20));
    }

    @Test
    public void shouldReturnNegative50() {
        assertEquals(-50, subtraction.subtract(-25, 25));
    }

    @Test
    public void shouldReturn70() {
        assertEquals(70, subtraction.subtract(100, 30));
    }

}
