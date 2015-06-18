package com.company;

public class GeneratorAlgorytmow {



    public String zwrocPalindrom(String input){

        int dlugosc = input.length()-1; // dlugosc wyrazu do odwrocenia
        StringBuffer output = new StringBuffer(); // wynik metody

        for (int i = dlugosc; i >= 0 ; i--) {
            output.append(input.charAt(i)); //odwracanie
        }
        return output.toString();
    }


    public void prezentujMenu(){

        System.out.println("Wybierz opcję programu:");
        System.out.println("1 - Wyjście");
        System.out.println("2 - Palindromy");
    }


    }

