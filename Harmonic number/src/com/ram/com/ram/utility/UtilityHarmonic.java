package com.ram.com.ram.utility;

public class UtilityHarmonic {

    public void harmonic (int num)
    {
            int output=1;
            for (float i=2;i<=num;i++)
            {
                float number= output +  (float )1/i ;
                //harmonic += (float)1 / i;
                //System.out.println(1/i);
                //System.out.println(output);
                System.out.println(+number);
            }

    }
}
