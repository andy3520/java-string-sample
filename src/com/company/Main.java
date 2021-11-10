package com.company;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Nhap so tien:");
        String inputString = new Scanner(System.in).next();
        Boolean isContainK = inputString.contains("k");
        int inputNumber = 0;
        if (isContainK) {
            String[] inputArray = inputString.split("k");
            try {
                inputNumber = Integer.parseInt(inputArray[0]) * 1000;
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        } else {
            inputNumber = Integer.parseInt(inputString);
        }

        System.out.println(inputNumber);
    }
}
