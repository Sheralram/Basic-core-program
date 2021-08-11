package com.ram;

import com.ram.com.ram.utility.Utilityfactor;

import java.util.Scanner;

public class Factorprogram {
    public static void main(String[] args) {
        System.out.println("Welcome to prime factorization Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number  ");
        int number = scanner.nextInt();
        Utilityfactor utility = new Utilityfactor();
        utility.primeFactors(number);

    }
}
