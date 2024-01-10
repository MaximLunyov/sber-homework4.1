package org.example.exceptions;

public class BadSumException extends Exception {

    public BadSumException(String msg){
        super(msg);
    }
    public BadSumException(String msg,Throwable cause) {
        super(msg,cause);
    }
}

