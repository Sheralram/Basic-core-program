package com.ram.com.utility;

public class Utilitynumber {
    public void number(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            System.out.println(num1 + "is a largest");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2 + "is a largest");
        } else {
            System.out.println(num3 + "is a largest");

        }
    }
}

