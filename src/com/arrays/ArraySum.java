package com.arrays;

public class ArraySum {
    public static void main(String[] args) {
        float[] Num = {1.1f,2.2f,3.3f,4.4f,5.5f};
        float sum = 0;
        for(float a: Num){
//            sum = sum + element;
            sum += a;
        }
        System.out.println("Sum is:" + sum);
    }
}
