package com.arrays;

import java.util.Scanner;

public class AreaPerim {
    double area;
    double per;
    void getarea(){
        System.out.println(area);
    }
    void getPerim(){
        System.out.println(per);
    }
    double setarea(double r){
  area=3.14*(r*r);
  return area;
    }
    double setPerim(double r){
   per=2*3.14*r;
   return per;
    }
    void checkcond(double r){
        double v = setPerim(r);
        double setarea = setarea(r);
        if (v==setarea){
            System.out.println("Error");
        }
        else {
            getarea();
            getPerim();
        }
    }
}
 class MainAP{
    public static void main(String[] args) {
        AreaPerim areaPerim = new AreaPerim();
        Scanner scanner = new Scanner(System.in);
        double r;
        System.out.println("Enter radius");
        r= scanner.nextDouble();
        areaPerim.checkcond(r);
    }
}

