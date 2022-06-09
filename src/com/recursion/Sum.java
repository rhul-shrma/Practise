package com.recursion;

import java.util.Scanner;

public class Sum {
    static int sum(int n){
        if(n == 1){
            return 1;
        }
        return n + sum(n-1);
    }


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int A = sum(num);

        System.out.println(A);
    }
}
