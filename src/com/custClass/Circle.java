package com.custClass;

import java.util.Scanner;

class Func{
    double area;
     double perimeter;
      double r;

     double checkPeri  = 2 * 3.14 * r;
    double checkArea = 3.14 * (r*r);

 
    public double getArea() {
        return area;
    }
    public void setArea(double r) {
        if(checkArea == area){
            this.area = area;
        }else{
            System.out.println("Please enter correct radius for getting AREA.");
        }
    }
    public double getPerimeter() {
        return perimeter;
    }
    public void setPerimeter(double perimeter) {
        if(checkPeri == perimeter){
            this.perimeter = perimeter;
        }else{
            System.out.println("Please enter correct radius for getting PERIMETER.");
        }
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }
}



public class Circle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the Radius: ");
        double radius = scn.nextDouble();

        Func circle1 = new Func();
        Func circle2 = new Func();

        System.out.println("The Area of the Circle1 is: " + circle1.area + "\n" + " And the Area of Circle2 is: " + circle2.area);
        System.out.println("The Perimeter of the Circle1 is: " + circle1.perimeter + "\n" + " And the Perimeter of Circle2 is: " + circle2.perimeter);

    }
}
