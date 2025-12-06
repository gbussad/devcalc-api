package com.devcalc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    CalculatorService svc = new CalculatorService();

    @Test
    void testAdd() { assertEquals(15.0, svc.add(10, 5)); }

    @Test
    void testSubtract() { assertEquals(5.0, svc.subtract(10, 5)); }

    @Test
    void testMultiply() { assertEquals(50.0, svc.multiply(10, 5)); }

    @Test
    void testDivide() { assertEquals(2.0, svc.divide(10, 5)); }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> svc.divide(10, 0));
    }
}