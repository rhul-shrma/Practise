package com.practise;

import java.util.Scanner;

public class Percentage {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int firstSubj = scn.nextInt();
        int SecondSubj = scn.nextInt();
        int thirdSubj = scn.nextInt();
        int fourthSubj = scn.nextInt();
        int fifthSubj = scn.nextInt();
        scn.close();

        int totalmarks = (firstSubj + SecondSubj + thirdSubj + fourthSubj + fifthSubj);

        int percen = (totalmarks*100)/500;
        if(percen>= 33){
            System.out.println("Congratulations You are PASS.");
        }
        else{
            System.out.println("Sorry you are FAIL.");
        }

//        double CGPA = percen/9.5;
//
//        System.out.println("Percentage of Five Subjects is: "+  + percen);
//        System.out.println("CGPA of Five Subjects is: "+  + CGPA);
    }
}
