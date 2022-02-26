package tests.com.calculator.operations.add;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

import src.com.calculator.operations.add.Add;

public class AddOperationTest {
    
    Add addOperation = new Add();

    @Test
    public void shouldReturn20() {
        assertEquals(20, addOperation.add(10, 10));
    }

    @Test
    public void shouldReturn3_5D() {
        assertEquals(3.5d, addOperation.add(2.0d, 1.5d));
    }

    @Test
    public void shouldReturnNegative150() { 
        assertEquals(-150, addOperation.add(-75, -75));
    }
}
