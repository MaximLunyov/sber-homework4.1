package org.example;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class homeworkReadContent {
    private static void readHTTP(String url) {
        try {
            URL ur = new URL(url);
            InputStream ins = ur.openStream();
            Scanner sc = new Scanner (ins).useDelimiter("\\A");
            String result = sc.hasNext() ? sc.next() : "";
            System.out.println(result);
        } catch (MalformedURLException e) {
            System.out.println("Не правильно введен адрес "+url+" Введите адрес узла в виде: https://www.google.ru/");
            InputAgain();

        } catch (IOException e) {
            System.out.println("Нет доступа к "+url+" проверьте корректность адреса и подключение к сети");
            InputAgain();
        }
    }

    private static void InputAgain() {
        String s;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите адрес или exit для выхода из программы");
        s = scan.next();
        if (s.equals("exit")) return;
        System.out.println(s);
        readHTTP(s);
    }


    public static void main(String[] args) {
        InputAgain();

    }
}
