package com.ram;

import com.ram.com.utility.Utilitynumber;

import java.util.Scanner;

public class Largestnumber {
    public static void main(String[] args) {
        System.out.println("Welcome to Largest 3 number program");
        Scanner scanner= new Scanner(System.in);
        System.out.println(" Enter 3 numbers ");
        int num1= scanner.nextInt();
        int num2= scanner.nextInt();
        int num3= scanner.nextInt();
        Utilitynumber utility = new Utilitynumber();
        utility.number(num1,num2,num3);
    }
}
