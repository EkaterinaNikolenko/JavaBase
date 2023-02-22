package com.hillel.nikolenko.homeworks.homework7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 11);
        int numberOfAttempts = (int) (Math.random() * 7 + 3);
        int userNumber = -1;

        System.out.println("Number of attempts " + numberOfAttempts);
        System.out.println("Please enter your number from 0 to 10:");

        for (int i = 0; i < numberOfAttempts; i++) {
            do {
                if (scanner.hasNextInt()) {
                    userNumber = scanner.nextInt();
                    if (userNumber < 0 || userNumber > 10) {
                        System.out.println("Please enter number from 0 to 10");
                        scanner.nextLine();
                    } else {
                        break;
                    }
                } else {
                    System.out.println("Wrong data! Try again!");
                    scanner.nextLine();
                }
            } while (true);

            if (userNumber > randomNumber) {
                System.out.println("Your number is bigger");
            } else if (userNumber < randomNumber) {
                System.out.println("Your number is smaller");
            } else {
                System.out.println("You guessed!");
                break;
            }

            if(i == numberOfAttempts - 1){
                System.out.println("You lose! The number was " + randomNumber);
            }
        }
    }
}
