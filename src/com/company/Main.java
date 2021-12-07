package com.company;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    /* Question:
        If a given number is divisible by 5, return 'Fizz'.
        If a given number is divisible by 3, return 'Buzz'.
        If a given number is divisible by 5 and 3, return 'FizzBuzz'.
        If a given number does not meet the aforementioned conditions, return the number (ex: 2).
     */

    public static void main(String[] args) {
        int[] numbersArray = IntStream.rangeClosed(0, 25).toArray(); // create an array of numbers
        System.out.println("Inputs: " + Arrays.toString(numbersArray)); // print the array (for clarity in the console)

        for (int number : numbersArray) { // iterate through each element in the array
            String prepend = number + " --> "; // console output syntactic sugar

            if (number == 0) // base case since 0 divided by any number is 0
                System.out.println(prepend + number);
            else if (number % 5 == 0 && number % 3 == 0) // if number is divisible by both 5 and 3
                System.out.println(prepend + "FizzBuzz");
            else if (number % 5 == 0) // if number is divisible by 5
                System.out.println(prepend + "Fizz");
            else if (number % 3 == 0) // if number is divisible by 3
                System.out.println(prepend + "Buzz");
            else
                System.out.println(prepend + number);
        }
    }
}