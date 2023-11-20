// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Objects;
import java.util.Scanner;
import java.lang.StringBuilder;
public class Main {
    public static void main(String[] args) {
        // Program which tests NewString class
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input your string. ");
        String input = scanner.nextLine();
        NewString newString = new NewString(input);

        boolean terminate = false;
        while (!terminate)
        {
            // Ask what to do with input
            System.out.println("Would you like to remove a letter or shorten your input? 'Remove' or 'Shorten'");
            String choice = scanner.nextLine();
            if (Objects.equals(choice, "Remove"))
            {
                // Ask what letter to remove and remove accordingly, printing the result
                System.out.println("What letter would you like to remove? Capitalisation is sensitive. ");
                char choiceChar = scanner.nextLine().charAt(0);
                NewString nextString = newString.remove(choiceChar);
                System.out.println("Your text is now: " + nextString.getNewString());

                // Prepare for next iteration of loop by resetting newString
                newString = nextString;
            }
            // Shorten if the user wants to shorten and print the result
            else if (Objects.equals(choice, "Shorten"))
            {
                NewString nextString = newString.shorten();
                System.out.println("Your text is now: " + nextString.getNewString());

                // Prepare for next iteration of loop by resetting newString
                newString = nextString;
            }
            else
            {
                // Terminate if the user fails to provide a valid input
                terminate = true;
                break;
            }



        }



        }
    }
