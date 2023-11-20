// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args)
        {
            PlayerOne playerOne = new PlayerOne();
            PlayerOne playerTwo = new PlayerOne();
            int i = 1;

            // While neither player has one, keep throwing dice
            while (!playerOne.isDone() && !playerTwo.isDone())
            {
                System.out.println("Round " + i + ":");
                playerOne.throwDie();
                playerTwo.throwDie();
                System.out.println("Player 1 current points: " + playerOne.getSumPoints());
                System.out.println("Player 2 current points: " + playerTwo.getSumPoints() + "\n");
                i++;
            }

            // Output statement depending on who won
            if (playerOne.getSumPoints() > playerTwo.getSumPoints()) {
                System.out.println("Player 1 is the winner this time with a total of " + playerOne.getSumPoints() + " points!");
            }
            else if (playerOne.getSumPoints() < playerTwo.getSumPoints()) {
                System.out.println("Player 2 is the winner this time with a total of " + playerTwo.getSumPoints() + " points!");
            }
            else {
                System.out.println("It's a draw!");
            }

        }
    }
