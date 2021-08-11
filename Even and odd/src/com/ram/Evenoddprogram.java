package com.ram;

import com.utility.Utilityevenodd;

import java.util.Scanner;

public class Evenoddprogram {

    public static void main(String[] args) {
        System.out.println("Welcome to Even Odd Program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number  ");
        int num = scanner.nextInt();
        Utilityevenodd utility = new Utilityevenodd();
        utility.evenodd (num);
    }
}

