package com.anabelenhernandez.fizzbuzz;

public class FizzBuzz {

    public static String fizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            return "Fizz";
        } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }
}
