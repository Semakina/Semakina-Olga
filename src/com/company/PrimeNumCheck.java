package com.company;

public class PrimeNumCheck {
    void check(int number){
        if (number <= 0) throw new IllegalArgumentException();
        if (findDiv(number))
            System.out.println("Entered number is not prime");
        else System.out.println("Entered number is prime");
    }
    private boolean findDiv(int number){
        int sqRoot = (int)Math.ceil(Math.sqrt(number));
        boolean isDivFound = false;
        if (number == 1) isDivFound = true;
        for (int i = 2; i <= sqRoot; i++) {
            if ((number % i) == 0) {
                isDivFound = true;
                break;
            }
        }
        return isDivFound;
    }
}
