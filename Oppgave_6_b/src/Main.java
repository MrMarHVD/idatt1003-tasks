// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // TextAnalysis textAnalyser = new TextAnalysis("This is a test to see if the program works. ");

        /*
        System.out.println("Overview: \n" + textAnalyser.numOfSigns);
        System.out.println("Character count: " + textAnalyser.getCountOf('Æ'));
        System.out.println("Total number of characters " + textAnalyser.getTotal());
        System.out.println("Percentage not a letter: " + textAnalyser.percentageNotLetter());
        System.out.println("Number of different characters: " + textAnalyser.getCountDiff());
        System.out.println("Most common character(s): " + textAnalyser.getMostCommon());
        */

        // Loop program and print information while user desires
        boolean end = false;
        while (!end)
        {
            System.out.println("Please provide your input here: ");
            String input = scanner.nextLine();
            TextAnalysis textAnalyser = new TextAnalysis(input);

            // Output information
            System.out.println("Overview: \n" + textAnalyser.numOfSigns);
            System.out.println("Character count: " + textAnalyser.getCountOf('Æ'));
            System.out.println("Total number of characters " + textAnalyser.getTotal());
            System.out.println("Percentage not a letter: " + textAnalyser.percentageNotLetter());
            System.out.println("Number of different characters: " + textAnalyser.getCountDiff());
            System.out.println("Most common character(s): " + textAnalyser.getMostCommon());

            System.out.println("Would you like to end the program? Input 'Yes' if you want to end the program. Otherwise it will restart. ");
            String choice = scanner.nextLine();

            // End program if user desires
            if (Objects.equals(choice, "Yes"))
            {
                end = true;
            }


        }


        }
    }
