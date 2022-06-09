package com.practise;

public class Patterns {
    public static void main(String[] args) {
        int r, c;
        int n =4;

        for(r=n; r> 0; r--){
            for(c = 0; c<r; c++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
