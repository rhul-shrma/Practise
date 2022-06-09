package com.arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] marks = {90, 83, 54, 57, 34};

        for(int i=marks.length - 1; i>=0; i--){
            System.out.println(marks[i]);
        }
    }
}
