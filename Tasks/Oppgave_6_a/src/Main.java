// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    // Program that randomly generates integers between 0 and bound and counts them in a list
    public static void main(String[] args) {

            // Create list and random variables
            java.util.Random randomInt = new java.util.Random();
            List<Integer> count = new ArrayList<>();

            // Initialise 10 items in the list
            Collections.addAll(count, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

            // Initialise variables
            int i = 0;

            int cycles = 5000;
            int bound = 10;

            // Add counts depending on number generated
            while (i < cycles) {
                int number = randomInt.nextInt(bound) + 1;

                // Check if randomly generated number is equal to j and add 1 to count for that number if so, or repeat until the right number is obtained
                for (int j = 0; j <= bound; j++) {
                    if (j == number) {
                        int currentValue = count.get(j - 1);
                        count.set(j - 1, currentValue + 1);
                    }
                }

                i++;
        }
            // Print the entire list
            System.out.println("The following is the number of times each number 1 through 10 was randomly obtained in " + cycles + " cycles: \n" + count);



    }
    }
