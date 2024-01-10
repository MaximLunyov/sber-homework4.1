package org.example;

import org.example.exceptions.PinExhaustedException;

public class PinValidator {
    private static final int CORRECT_PINCODE = 1234;
    boolean pinEntered;
    private int flag = 0;

    public boolean isPinEntered() {
        return pinEntered;
    }

    boolean checkPin(int pinCode) throws PinExhaustedException {
        pinEntered = false;
        if (CORRECT_PINCODE == pinCode) {
            pinEntered = true;
            return true;
        } else {
            if (flag == 3) {
                flag = 0;
                throw new PinExhaustedException("Three wrong tries!");
            }
            ++flag;
            return false;
        }
    }
}
