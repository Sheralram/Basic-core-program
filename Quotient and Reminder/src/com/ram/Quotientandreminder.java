package com.ram;

import java.util.Scanner;

public class Quotientandreminder {
    public static void main(String[] args) {
        System.out.println("Welcome to prime factorization Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the  Dividend Number  ");
        int dividend = scanner.nextInt();
        System.out.println("Enter the  Divisor Number  ");
        int divisor = scanner.nextInt();
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient = " + quotient);
        System.out.println("Remainder = " + remainder);


    }
}
