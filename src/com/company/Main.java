package com.company;

public class Main {

    public static void main(String[] args) {
	// Operators
        int intValue1 = 21;
        int intValue2 = 41;

        int result1 = intValue1 + intValue2;
        int result2 = intValue1 - intValue2;
        int result3 = intValue1 * intValue2;
        double result4 = (double) intValue1 / intValue2;
        float result5 = (float) intValue1 % intValue2;

        System.out.println(intValue1 + " + " + intValue2 + " = " + result1);
        System.out.println(intValue1 + " - " + intValue2 + " = " + result2);
        System.out.println(intValue1 + " * " + intValue2 + " = " + result3);
        System.out.println(intValue1 + " / " + intValue2 + " = " + result4);
        System.out.println(intValue1 + " % " + intValue2 + " = " + result5);



    }
}
