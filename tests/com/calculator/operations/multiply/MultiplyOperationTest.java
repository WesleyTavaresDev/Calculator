package tests.com.calculator.operations.multiply;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import src.com.calculator.operations.multiply.Multiply;

public class MultiplyOperationTest {

    Multiply multiply = new Multiply();

    @Test
    public void shouldReturn4() {
        assertEquals(4, multiply.multiply(2, 2));
    }

    @Test
    public void shouldReturn128() {
        assertEquals(128, multiply.multiply(64, 2));
    }

    @Test
    public void shouldReturn90() {
        assertEquals(90, multiply.multiply(45, 2));
    }
    
}
