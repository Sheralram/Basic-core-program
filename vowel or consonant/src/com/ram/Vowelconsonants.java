package com.ram;

import com.ram.com.ram.UtilityVowelC;

import java.util.Scanner;

public class Vowelconsonants {
    public static void main(String[] args) {
        System.out.println("Welcome to Vowels or Consonants program");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the alphabet ");
        char ch = scanner.next().charAt(0);
        UtilityVowelC utility = new UtilityVowelC();
        utility.VowelConsonant(ch);
               }

}
