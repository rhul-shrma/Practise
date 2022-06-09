package com.custClass;

import java.util.Scanner;

class Methods{
//    int side;
    public int area(int side){
        return side*side;
    }

    public int perimeter(int side){
        return 4*side;
    }
}

public class Square {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the total number of sides to make square: ");
        int s = scn.nextInt();

        Methods area = new Methods();
        Methods perimeter = new Methods();

        System.out.println("The Area of SQUARE is: " + area.area(s));
        System.out.println("The Perimeter of SQUARE is: " + perimeter.perimeter(s));
    }
}
