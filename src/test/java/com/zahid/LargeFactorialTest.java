package com.zahid;

import java.math.BigInteger;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.zahid.exception.NegativeNumberException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Testing LargeFactorial Class")
public class LargeFactorialTest { 
    
    LargeFactorial largeFactorial;
    
    @BeforeEach
    void init() {
        largeFactorial = new LargeFactorial();
    }
    
    @Test
    @DisplayName("Testing for Positive Integer")
    public void testCalculateFactorialInteger() throws NegativeNumberException {
        
        BigInteger expected = BigInteger.valueOf(3628800);
        BigInteger actual = largeFactorial.calculateFactorial(10);
        assertEquals(expected, actual);
    }
    
    @Test
    @DisplayName("Testing for Negative Input")
    public void testCalculateFactorialNegative() {
        assertThrows(NegativeNumberException.class, ()-> largeFactorial.calculateFactorial(-10), "factorial of negative number should throw");
    }
}
