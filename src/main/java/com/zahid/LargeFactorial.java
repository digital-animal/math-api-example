package com.zahid;

import java.math.BigInteger;

import com.zahid.exception.NegativeNumberException;

public class LargeFactorial {
    
    // as the called function throws NegativeNumberException thus calling function(main)
    // should follow catch-or-declare strategy i.e. use try..catch or throws keyword
    public static void main(String[] args) throws NegativeNumberException { 
        LargeFactorial largeFact = new LargeFactorial();
        
        for(int i=0; i<=100; i++) {
            System.out.println(largeFact.calculateFactorial(i));
        }
    }

    // this method throws checked exception NegativeNumberException when input is negative
    // thus throws keyword used in method signature
    public BigInteger calculateFactorial(int n) throws NegativeNumberException {
        if(n < 0) {
            throw new NegativeNumberException("input number cannot be negative");
        }
        
        BigInteger result = BigInteger.ONE;

        for(int i=1; i<=n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        return result;
    }
}
