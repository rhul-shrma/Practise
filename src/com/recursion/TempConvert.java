package com.recursion;

import java.util.Scanner;

public class TempConvert {
    static float CelToFare(float c){
        float f;
        f = ((c*9)/5) + 32;
        return f;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Temperature in Celcius: ");
        float Celcius = scn.nextFloat();

        float Fahrenhiet = CelToFare(Celcius);

        System.out.println("Te Temperature in Fahrenheit is: " + Fahrenhiet);
    }
}
