package com.rama;

import com.rama.com.rama.utility.utilitypowerof2;

import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args)
    {
        System.out.println("Welcome to Power of 2 Program");
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter power of number N  : ");
        int num = scanner.nextInt();
        utilitypowerof2 utility= new utilitypowerof2();
        utility.power(num);
    }
}
