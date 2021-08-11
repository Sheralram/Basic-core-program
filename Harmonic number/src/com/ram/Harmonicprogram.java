package com.ram;

import com.ram.com.ram.utility.UtilityHarmonic;

import java.util.Scanner;

public class Harmonicprogram {

    public static void main (String[] args) {
        System.out.println("Welcome to Leap Year Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Harmonic  Nth Number  ");
        int num = scanner.nextInt();
        UtilityHarmonic utility = new UtilityHarmonic ();
        utility.harmonic(num);
    }

}
