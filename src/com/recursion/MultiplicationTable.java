package com.recursion;

import java.util.Scanner;

public class MultiplicationTable {
    static void Multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.println(n + "*" + i + " = " + n * i);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = scn.nextInt();

        Multiplication(num);
    }
}
