package com.arrays;

public class AddMatrices {
    public static void main(String[] args) {
        int[][] matrice1 = {{1,2,3},
                            {4,5,6}};

        int[][] matrice2 = {{2,6,13},
                            {4,7,1}};

        int[][] result = {{0,0,0},
                          {0,0,0}};

        for (int i=0; i<matrice1.length; i++){
            for (int j=0; j< matrice1[i].length; j++){
                result[i][j] = matrice1[i][j] + matrice2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
