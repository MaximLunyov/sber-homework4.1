package org.example.exceptions;

public class PinExhaustedException extends Exception {

    public PinExhaustedException(String msg) {
        super(msg);
    }

    public PinExhaustedException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
