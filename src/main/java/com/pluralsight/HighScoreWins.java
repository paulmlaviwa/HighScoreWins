package com.pluralsight;

import java.util.Scanner;

public class HighScoreWins {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Please enter a game score: ");
        String input = myScanner.nextLine();

        String[] inputSplit = input.split("\\:");

        String team1 = inputSplit[0];
        int team2Score = Integer.parseInt(inputSplit[2]);

        String[] barInputSplit = inputSplit[1].split("\\|");

        String team2 = barInputSplit[0];
        int team1Score = Integer.parseInt(barInputSplit[1]);

        System.out.print("Winner: ");
        if (team1Score > team2Score) {
            System.out.print(team1);
        } else {
            System.out.print(team2);
        }
    }
}