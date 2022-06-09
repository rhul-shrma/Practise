package com.practise;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = sc.nextInt();

        if(year % 400 == 0){
            System.out.println("You are in a LEAP YEAR.");
        } else if(year % 100 == 0){
            System.out.println("You are not in a LEAP YEAR.");
        } else if(year % 4 == 0){
            System.out.println("You are in a LEAP YEAR.");
        }
        else {
            System.out.print("You are not in a LEAP YEAR.");
        }
    }
}
