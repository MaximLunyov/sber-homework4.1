package org.example;

import org.example.exceptions.AccountIsLockedException;
import org.example.exceptions.BadPinException;
import org.example.exceptions.BadSumException;
import org.example.exceptions.IsNotLoggedInException;

public interface Terminal {
    double checkAmount() throws BadSumException, BadPinException, IsNotLoggedInException, AccountIsLockedException;

    void putMoney(double sum) throws IsNotLoggedInException, AccountIsLockedException, BadSumException;

    void withdrawMoney(double sum) throws BadSumException, IsNotLoggedInException, AccountIsLockedException;

    void checkPin(int pincode) throws BadPinException;
}
