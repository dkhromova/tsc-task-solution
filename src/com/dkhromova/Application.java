package com.dkhromova;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String array = scanner.nextLine();
        String[] words = array.split(" ");
        printNumberArray(words);
    }

    public static void printNumberArray(String[] words) {
        int number = 1;
        for (String word : words) {
            System.out.println(number++ + "." + word);
        }
    }
}
