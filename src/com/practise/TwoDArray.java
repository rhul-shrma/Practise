package com.practise;

public class TwoDArray {
    public static void main(String[] args) {
        float[][] flat = new float[5][5];

        int[][] arr = {{2,3}, {4,5}, {3,5,2}, {2,7}};

        for(int i =0; i < arr.length ; i++){
            for(int j =0; j <arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
//        System.out.println(arr.length);\

    }
}
