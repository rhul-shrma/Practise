package com.practise;

import java.util.Scanner;

public class Factorial {

    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        } else {
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();
        System.out.println("The Factorial of " + n + " is: " + factorial(n));

//        int fact = 1;

//        Using For Loop
//        for(int i=1; i<=n; i++){
//            fact = fact*i;
//        }

//        Using While Loop
//        int i = 1;
//        while (i<=n){
//            fact = fact*i;
//            i++;
//        }
//        System.out.println(n + "!" + "=" + fact);
//    }
    }
}

