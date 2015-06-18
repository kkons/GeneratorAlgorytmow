package com.company;

import java.io.Console;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String wybor;
        String input;
        Console console = System.console();
        GeneratorAlgorytmow gen = new GeneratorAlgorytmow();
        Scanner sc = new Scanner(System.in);

        do {

            gen.prezentujMenu();
            wybor = sc.nextLine();
            switch (wybor) {

                case ("1"): {
                    System.exit(0);
                }
                case ("2"): {
                    System.out.println("Podaj wyraz do odwrócenia");
                    input = sc.nextLine();
                    System.out.println("Wynik: " + gen.zwrocPalindrom(input));
                    break;
                }
                default: {
                    System.out.println("Nie rozumiem polecenia:)");
                    break;
                }

            }
        } while (true);
    }
}
