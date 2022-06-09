package com.practise;

import java.util.Scanner;

public class Website {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the URL of Website: ");
        String URL = sc.nextLine();

        if(URL.endsWith(".com")){
            System.out.println("This is Commercial Website.");
        } else if(URL.endsWith(".org")){
            System.out.println("This is Organizational Website.");
        } else if(URL.endsWith(".in")){
            System.out.println("This is an Indian Website.");
        } else {
            System.out.println("Please Enter Correct URL.");
        }

    }
}
