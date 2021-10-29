package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("let's play ROCK PAPER SCISSORS");
        System.out.println("how much wins do you preffer?: ");
        int score = scan.nextInt();
        int scoreUser = 0;
        int scoreComputer = 0;
        while(true) {
            if(scoreUser == score){
                System.out.println("You won the game!!!!");
                break;
            }else if(scoreComputer == score){
                System.out.println("Computer won the game!!!!");
                break;
            }
            System.out.println("\nyour choise:");
            System.out.println("1 - rock");
            System.out.println("2 - paper");
            System.out.println("3 - scissors");
            System.out.println("4 - Surrender");
            int choice = scan.nextInt();
            if (choice == 4) {
                System.out.println("Computer WIN!");
                break;
            }
            switch (choice) {
                case 1 -> System.out.println("you picked rock");
                case 2 -> System.out.println("you picked paper");
                case 3 -> System.out.println("you picked scissors");
            }
            int computerPick = rand.nextInt(3) + 1;
            switch (computerPick) {
                case 1 -> System.out.println("computer picked rock");
                case 2 -> System.out.println("computer picked paper");
                case 3 -> System.out.println("computer picked scissors");
            }

            if (choice == 1 && computerPick == 1) {
                System.out.println(">>>>>>>>>>>>>>>>>draw<<<<<<<<<<<<<<<<<\n");
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 2 && computerPick == 1) {
                System.out.println(">>>>>>>you won! congratulations<<<<<<<\n");
                scoreUser++;
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 3 && computerPick == 1) {
                System.out.println(">>>>>>>>>>>>>you lose :/<<<<<<<<<<<<<<\n");
                scoreComputer++;
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 1 && computerPick == 2) {
                System.out.println(">>>>>>>>>>>>>you lose :/<<<<<<<<<<<<<<\n");
                scoreComputer++;
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 2 && computerPick == 2) {
                System.out.println(">>>>>>>>>>>>>>>>>draw<<<<<<<<<<<<<<<<<\n");
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 3 && computerPick == 2) {
                System.out.println(">>>>>>>you won! congratulations<<<<<<<\n");
                scoreUser++;
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 1 && computerPick == 3) {
                System.out.println(">>>>>>>you won! congratulations<<<<<<<\n");
                scoreUser++;
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 2 && computerPick == 3) {
                System.out.println(">>>>>>>>>>>>>you lose :/<<<<<<<<<<<<<<\n");
                scoreComputer++;
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            } else if (choice == 3 && computerPick == 3) {
                System.out.println(">>>>>>>>>>>>>>>>>draw<<<<<<<<<<<<<<<<<\n");
                System.out.println("User: " + scoreUser + " " + scoreComputer + ": Computer");
            }

        }


    }
}
