package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice;
        PrimeNumCheck checkNumber = new PrimeNumCheck();

        do {
            System.out.println("Choose:\n1 - enter number\n2 - exit");
            Scanner scan = new Scanner(System.in);

                while (!scan.hasNextInt()) {
                    System.err.println("You entered not an integer or the entered number is too big");
                    System.out.println("Choose:\n1 - enter number\n2 - exit");
                    scan.next();
                }
            choice = scan.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter nonnegative integer");

                    while (!scan.hasNextInt()) {
                        System.err.println("You entered not an integer or the entered number is too big");
                        System.out.println("Enter nonnegative integer");
                        scan.next();
                    }
                    int number = scan.nextInt();
                    try {
                        checkNumber.check(number);
                    }
                    catch (IllegalArgumentException e) {
                        System.err.println("You entered not a positive number");
                    }
                    break;
                }
                case 2: {
                    System.exit(0);
                    break;
                }
                default: {
                    System.err.println("Please choose available option");
                    break;
                }
            }
        } while (true);
    }
}