package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String userChoice;
        String input;
        Console console = System.console();
        GeneratorAlgorytmow gen = new GeneratorAlgorytmow();
        Scanner sc = new Scanner(System.in);

        do {
            gen.displayMenu();
            userChoice = sc.nextLine();

            if (userChoice.equals("1")) {

                System.exit(0);

            } else if (userChoice.equals("2")) {

                System.out.println("Podaj wyraz do odwrócenia");
                input = sc.nextLine();
                System.out.println("Wynik: " + gen.makePalindrome(input));

            }

            else
            {
                System.out.println("Nie rozumiem!");

            }


        } while (true);
    }
}
