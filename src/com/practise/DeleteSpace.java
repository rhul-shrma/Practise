package com.practise;

public class DeleteSpace {
    public static void main(String[] args) {
        String s = "This contains  double &  triple String.";
        System.out.println(s.indexOf("  "));
        System.out.println(s.indexOf("   "));
    }
}
