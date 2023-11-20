// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

import java.util.Scanner;

public class Main {
    // Program which outputs the all multiples 1 through 10 of a given number chosen by the user
    public static void main(String[] args) {
        // Initialise variables
        Scanner scanner = new Scanner(System.in);
        //int i = 0;
        int number = 0;

        // Take user input
        System.out.println("Please input the integer you wish to start from. ");
        int start = scanner.nextInt();
        System.out.println("Please input the integer you wish to end with. ");
        int end = scanner.nextInt();

        // Use difference between the two user inputs to determine what numbers to multiply
        int difference = end - start;

        // Output multiples 1 through 10 of each number between the two provided by the user
        for (int i = 0; i <= difference; i++)
        {
            System.out.println("Multiples of " + (start + i) + ":");
            for (int multiple = 1; multiple <= 10; multiple++)
            {
                System.out.println((start + i) + " * " + multiple + " = " + (start + i) * multiple);

            }

        }

        }
    }
