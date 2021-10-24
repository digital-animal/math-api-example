package com.zahid.exception;

// this exception is thrown when input is negative
@SuppressWarnings("serial")
public class NegativeNumberException extends Exception {
    
    public NegativeNumberException() {
        // pass
    }
    
    public NegativeNumberException(String message) {
        super(message);
    }
}
