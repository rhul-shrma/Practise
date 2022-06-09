package com.practise;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String name = scn.nextLine();
        System.out.println("Hello " + name + " have a good day.");
    }
}
