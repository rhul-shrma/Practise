package com.practise;

import java.util.Scanner;

public class RockCeisorPaperGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your move (Rock, Paper or Scissor): ");
        String Move = sc.nextLine();
        int Rock = 0, Paper = 0, scissor = 0;
        int random = (int) (Math.random() * 3);
        String CompMove = "";

        if(!Move.equals("Rock") && !Move.equals("rock") && !Move.equals("Paper") && !Move.equals("paper") && !Move.equals("Scissor") && !Move.equals("scissor")){
            System.out.println("Your Move is not Valid.");
        }else {
            if (random == 0) {
                CompMove = "Rock";
            } else if (random == 2) {
                CompMove = "Paper";
            } else {
                CompMove = "Scissor";
            }
        }
        System.out.println("Computer Move : " + CompMove );
    }
}
