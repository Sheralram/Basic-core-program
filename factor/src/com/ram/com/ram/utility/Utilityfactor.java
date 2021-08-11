package com.ram.com.ram.utility;

public class Utilityfactor {

    public void primeFactors(int number)
    {
        for(int i = 2; i< number; i++) {
            while(number%i == 0) {
                System.out.println(i+" ");
                number = number/i;
            }
        }
        if(number >2)
        {
            System.out.println(number);
        }
    }
}



