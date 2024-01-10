package org.example;

import java.util.Scanner;

public class UserInterfaceConsole implements UserInterface {

    @Override
    public void showError(Throwable t) {

    }

    @Override
    public int getPin() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    @Override
    public double getAmountOfMoney() {
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public int getCommand() {
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }


    @Override
    public void showError(String message) {
        System.out.println(message);
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String askQuestion(String message) {
        return null;
    }
}
