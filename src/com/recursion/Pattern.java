package com.recursion;

import java.util.Scanner;

public class Pattern {
//    static void Pattern1(int n){
//        for(int i=0; i<n; i++){
//            for(int j=0; j<i; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//    }

    static void ReversePattern(int n){
        for(int i=n; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int num = scn.nextInt();

        ReversePattern(num);
    }
}
