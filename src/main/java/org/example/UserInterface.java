package org.example;

public interface UserInterface {

    void showError(Throwable t);
    void showError(String message);
    void showMessage(String message);
    String askQuestion(String message);
    int getPin();
    int getCommand();
    double getAmountOfMoney();

}
