package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class test1 {

    public static float getFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float number = 0;
        boolean isValidInput = false;

        while (!isValidInput) {
            System.out.print("Введите дробное число: ");
            String input = scanner.nextLine();

            try {
                number = Float.parseFloat(input);
                isValidInput = true;
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
            }
        }

        return number;
    }

    public static void main(String[] args) {
        float input = getFloatInput();
        System.out.println("Введенное число: " + input);
    }
}