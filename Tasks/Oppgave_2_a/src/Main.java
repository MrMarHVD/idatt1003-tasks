// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.Scanner;

public class Main {

    // Program to tell the user whether a given number is a leap year
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for year
        System.out.println("Please input your year. ");

        int yearIn = scanner.nextInt();

        // Divide input by 400 and cast to double so number can be accurately compared
        //double test = (double)yearIn / 400;

        if (yearIn % 100 == 0)
        {
            if (yearIn % 400 == 0)
            {
                System.out.println("Your year is a leap year, and a rare one! ");
            }
            else
            {
                System.out.println("Your year is not a leap year. ");
            }
        }
        else
        {
            if (yearIn % 4 == 0)
            {
                System.out.println("Your year is a leap year! ");
            }
            else
            {
                System.out.println("Your year is not a leap year. ");
            }
        }

        // Check if number is an integer or not and output accordingly
        /*

        */

        }
    }
