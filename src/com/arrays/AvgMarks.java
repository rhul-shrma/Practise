package com.arrays;

import java.util.Scanner;

public class AvgMarks {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter your Marks: ");
        int[] marks ={1,2,3,4,5};
        int tot=0;
        for(int i=0; i< marks.length; i++){
            tot = tot+marks[i];
        }
        int average=tot/5;
        System.out.println("Yor Average is: " + average);
    }
}
