package org.example.exceptions;

public class IsNotLoggedInException extends Exception {

    public IsNotLoggedInException(String msg) {
        super(msg);
    }
    public IsNotLoggedInException(String msg,Throwable cause) {
        super(msg,cause);
    }
}
