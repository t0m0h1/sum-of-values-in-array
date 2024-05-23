package com.example.Main;

import java.util.ArrayList;


public class Main {


    public static ArrayList<Integer> randomNumbers(int n) {
        // Create an array list to hold the random numbers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Generate n random numbers
        for (int i = 0; i < n; i++) {
            // Generate a random number between 1 and 100
            int number = (int) (Math.random() * 100) + 1;

            // Add the number to the array list
            numbers.add(number);
        }

        return numbers;
    }

    public static int sumOfEvens(ArrayList<Integer> randomNumbers) {
        // Initialize a variable to hold the sum of even numbers
        int sum = 0;

        // Loop through the numbers array
        for (int number : randomNumbers) {
            // Check if the number is even
            if (number % 2 == 0) {
                // Add the number to the sum
                sum += number;
            }
            

        }
        return sum;
    }

    public static int sumOfOdds(ArrayList<Integer> randomNumbers) {
        // Initialize a variable to hold the sum of odd numbers
        int sum = 0;

        // Loop through the numbers array
        for (int number : randomNumbers) {
            // Check if the number is odd
            if (number % 2 != 0) {
                // Add the number to the sum
                sum += number;
            }
        }    
        return sum;
    }

    public static int sum(ArrayList<Integer> randomNumbers) {
        int sum = 0;
        for (int number : randomNumbers) {
            sum += number;
        }
        return sum;
    }

        // driver code
        public static void main(String[] args) {
            ArrayList<Integer> randomNumbers = randomNumbers(12);
            System.out.println("Random numbers: " + randomNumbers);
            System.out.println("Sum of all numbers: " + sum(randomNumbers));
            System.out.println("Sum of even numbers: " + sumOfEvens(randomNumbers));
            System.out.println("Sum of odd numbers: " + sumOfOdds(randomNumbers));
        }


}