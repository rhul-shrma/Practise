package com.practise;

public class SunEven {
    public static void main(String[] args) {
        int sum = 0;
        int n = 3;
        for (int i=0; i<n; i++){
            sum = sum + (2*i);
        }
        System.out.println("Sum of Even Natural Numbers are:" + sum);
    }
}
