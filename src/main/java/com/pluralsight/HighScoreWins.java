package com.pluralsight;
import java.util.Arrays;
import java.util.Scanner;
public class HighScoreWins {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner (System.in);
        System.out.print("Enter a game score: Home:Visitor|xx:xx");
        String userinput = myScanner.nextLine();
        String [] split = userinput.split("\\|");

        String [] teamScores = split[1].split("\\:");
        String score0 = teamScores[0];
        String score1 = teamScores[1];
        int teamScore0 = Integer.parseInt(teamScores[0]);
        int teamScore1 = Integer.parseInt(teamScores[1]);

        String [] teamNames = split[0].split("\\:");
        String team0 = teamNames[0];
        String team1 = teamNames[1];

        if (teamScore0 > teamScore1){
            System.out.println("Winner: " + teamNames[0]);}

        else System.out.println("Winner: " + teamNames[1]);




    }
}
