package com.practise;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scn.nextInt();

//        Table of any Number
//        for(int i=1; i<=10; i++){
//            int N = n * i;
//            System.out.println(n + "*" + i + "=" + N );
//        }

//        Reverse Table of any Number
        for(int i=10; i>=1; i--){
            int N = n * i;
            System.out.println(n + "*" + i + "=" + N );
        }
    }
}
