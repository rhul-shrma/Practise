package com.arrays;

public class ArrayPresent {
    public static void main(String[] args) {
        int[] Num = {1 ,5, 64, 2, 23, 45};
        int number = 4;
        boolean isArray = false;
        for(int element: Num){
            if(number == element){
                isArray = true;
                break;
            }
        }
        if(isArray){
            System.out.println("The Given output is present in an Array");
        }else {
            System.out.println("The Given output is not present in an Array");
        }
    }
}
