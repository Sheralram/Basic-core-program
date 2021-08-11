package com.rama.com.rama.utility;

public class utilitypowerof2 {
    public void power(int num)
    {
        int powerof2=1;
        if(num<31)
        {
            for (int i = 1; i <= num; i++)
            {
                powerof2 = powerof2 * 2;
            }
            System.out.println(num+ " number power of 2  is :"+powerof2);
        }
        else{
            System.out.println("please enter the Number till 31");
        }
    }
}
