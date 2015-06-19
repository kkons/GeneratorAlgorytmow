package com.company;

public class GeneratorAlgorytmow {



    public String makePalindrome(String input){

        int inputLength = input.length()-1;
        StringBuilder output = new StringBuilder();

        for (int i = inputLength; i >= 0 ; i--)
            output.append(input.charAt(i));

        return output.toString();
    }


    public void displayMenu(){

        System.out.println("Wybierz opcję programu:");
        System.out.println("1 - Wyjście");
        System.out.println("2 - Palindromy");
    }


    }

