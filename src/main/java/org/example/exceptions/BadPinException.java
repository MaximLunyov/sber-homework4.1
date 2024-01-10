package org.example.exceptions;

public class BadPinException extends Exception {

    public BadPinException(String msg) {
        super(msg);
    }

    public BadPinException(String msg,Throwable cause) {
        super(msg,cause);
    }
}

